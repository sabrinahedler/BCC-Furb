// fotos de perfil
const FOTO_PADRAO = "../img/perfilNaoLogado.png"; // usuário não logado
const FOTO_AUTENTICADO = "../img/fotoLogin.png"; // usuário logado


document.addEventListener('DOMContentLoaded', () => {
    console.log("Sistema Aqua inicializado.");
    
    // 1. atualiza cabeçalho conforme estado de login
    atualizarCabecalho();

    // 2. configura o formulário de login 
    configurarLogin();

    // 3. configura a troca de temas
    configurarTemas();

    // 4. configura o envio do formulário cadastro
    configurarCadastro();
});


function atualizarCabecalho() {
    const areaUsuario = document.getElementById('areaUsuario');
    if (!areaUsuario) return;

    // busca dados localStorage
    const estaAutenticado = localStorage.getItem('autenticado') === 'true';
    const nomeUsuario = localStorage.getItem('loginUsuario');

    // para usuario autenticado
    if (estaAutenticado && nomeUsuario) {
        areaUsuario.innerHTML = `
            <span>Bem-vindo, ${nomeUsuario}</span>
            <a href="cadastro.html">
                <img src="${FOTO_AUTENTICADO}" alt="Perfil" class="fotoPerfil" title="Ir para Cadastro">
            </a>
            <button onclick="fazerLogout()" class="btn-logout">Sair</button>
        `;
    } else {
        // para usuario não autenticado
        areaUsuario.innerHTML = `
            <span>Usuário não autenticado</span>
            <img src="${FOTO_PADRAO}" alt="Padrão" class="fotoPerfil">
        `;
    }
}


function configurarLogin() {
    const formLogin = document.getElementById('login-form');
    if (!formLogin) return;

    formLogin.addEventListener('submit', (evento) => {
        evento.preventDefault(); // evita recarregar página antes do processamento

        const campoLogin = document.getElementById('login').value;
        const campoSenha = document.getElementById('password').value;

        // validação campos vazios
        if (campoLogin.trim() !== "" && campoSenha.trim() !== "") {
            // salva informações
            localStorage.setItem('loginUsuario', campoLogin);
            localStorage.setItem('autenticado', 'true');

            alert("Autenticação realizada com sucesso!");
            
            // retorna pra página principal
            window.location.href = 'index.html';
        } else {
            alert("Por favor, preencha todos os campos para autenticar.");
        }
    });
}

// muda o estilo tema
function configurarTemas() {
    const radiosTema = document.getElementsByName('theme');
    if (radiosTema.length === 0) return;

    radiosTema.forEach(radio => {
        radio.addEventListener('change', (e) => {
            const labels = document.querySelectorAll('#cadastro label');
            const inputs = document.querySelectorAll('#cadastro input:not([type="radio"]):not([type="checkbox"]), #cadastro select');

            // aplica estilos novos
            if (e.target.value === 'custom') {
                labels.forEach(l => l.classList.add('custom-labels'));
                inputs.forEach(i => i.classList.add('custom-inputs'));
            } else {
                // retorna aos estilos originais
                labels.forEach(l => l.classList.remove('custom-labels'));
                inputs.forEach(i => i.classList.remove('custom-inputs'));
            }
        });
    });
}


function configurarCadastro() {
    const formCadastro = document.getElementById('cadastro');
    if (!formCadastro) return;

    formCadastro.addEventListener('submit', (e) => {
        e.preventDefault();

        const peixeSelecionado = document.getElementById('tipo_pet').value;
        const divSucesso = document.getElementById('mensagem-sucesso');
        const imgPeixe = document.getElementById('imagem-peixe-sucesso');
        const textoSucesso = document.getElementById('texto-sucesso');

        // função para mudar de foto a cada peixe escolhido
        const imagensPeixes = {
    'betta': "../img/betta.png",
    'peixe-bolha': "../img/peixe-bolha.png",
    'peixe-caixa': "../img/peixe-caixa.png",
    'pirarucu': "../img/pirarucu.png"
};

        if (peixeSelecionado && imagensPeixes[peixeSelecionado]) {
            imgPeixe.src = imagensPeixes[peixeSelecionado];
            textoSucesso.innerText = "Cadastro realizado com sucesso!";
            
            // mostra confirmação de cadastro
            divSucesso.style.display = 'block';
            formCadastro.style.display = 'none';

            console.log("Cadastro enviado com sucesso para o peixe: " + peixeSelecionado);
        } else {
            alert("Por favor, selecione um peixe favorito.");
        }
    });
}

// função sair, limpa a memória do localStorage
function fazerLogout() {
    localStorage.removeItem('loginUsuario');
    localStorage.removeItem('autenticado');
    window.location.href = 'index.html';
}
