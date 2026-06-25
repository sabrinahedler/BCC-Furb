class Model {
    constructor() {
        this.funcionarios = [];
    }

    async carregarFuncionarios() {
        try {
            const response = await fetch('../data/funcionarios.json');
            if (!response.ok) {
                throw new Error('Erro ao carregar dados');
            }
            this.funcionarios = await response.json();
            return this.funcionarios;
        } catch (error) {
            console.error('Erro ao carregar funcionários:', error);
            return [];
        }
    }

    obterFuncionarios() {
        return this.funcionarios;
    }
}

class View {
    constructor() {
        this.contentDiv = document.getElementById('content');
        this.navLinks = document.querySelectorAll('.nav-link');
    }

    renderizarHome() {
        this.contentDiv.innerHTML = `
            <section class="home-section">
                <h2>Bem-vindo ao Sistema de Gestão de Funcionários</h2>
                <p>Este é um sistema de gerenciamento de funcionários desenvolvido como uma Single Page Application (SPA).</p>
                <p>Utilize o menu de navegação para acessar a lista de funcionários e visualizar suas informações.</p>
            </section>
        `;
    }

    renderizarFuncionarios(funcionarios) {
        let html = '<section class="funcionarios-section">';
        html += '<h2>Lista de Funcionários</h2>';
        html += '<div class="cards-container">';

        funcionarios.forEach(funcionario => {
            html += `
                <div class="card">
                    <div class="card-foto">
                        <img src="${funcionario.foto}" alt="Foto de ${funcionario.nome}">
                    </div>
                    <div class="card-content">
                        <div class="card-nome">${funcionario.nome}</div>
                        <div class="card-propriedades">
                            <strong>Cargo: ${funcionario.subobjeto.cargo}</strong>
                            <strong>Admissão: ${funcionario.subobjeto.data_admissao}</strong>
                        </div>
                        <div class="card-email">
                            <a href="mailto:${funcionario.email}">${funcionario.email}</a>
                        </div>
                    </div>
                </div>
            `;
        });

        html += '</div></section>';
        this.contentDiv.innerHTML = html;
    }

    atualizarNavegacao(paginaAtiva) {
        this.navLinks.forEach(link => {
            link.classList.remove('active');
            if (link.getAttribute('data-page') === paginaAtiva) {
                link.classList.add('active');
            }
        });
    }

    obterNavLinks() {
        return this.navLinks;
    }
}

class Controller {
    constructor(model, view) {
        this.model = model;
        this.view = view;
        this.paginaAtual = 'home';
        this.inicializar();
    }

    async inicializar() {
        // Carregar dados
        await this.model.carregarFuncionarios();

        // Configurar event listeners
        this.view.obterNavLinks().forEach(link => {
            link.addEventListener('click', (e) => {
                e.preventDefault();
                const pagina = link.getAttribute('data-page');
                this.navegarPara(pagina);
            });
        });

        // Renderizar página inicial
        this.navegarPara('home');
    }

    navegarPara(pagina) {
        this.paginaAtual = pagina;
        this.view.atualizarNavegacao(pagina);

        if (pagina === 'home') {
            this.view.renderizarHome();
        } else if (pagina === 'funcionarios') {
            const funcionarios = this.model.obterFuncionarios();
            this.view.renderizarFuncionarios(funcionarios);
        }
    }
}

document.addEventListener('DOMContentLoaded', () => {
    const model = new Model();
    const view = new View();
    const controller = new Controller(model, view);
});