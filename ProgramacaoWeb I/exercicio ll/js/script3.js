// Tabela
const tabela = document.getElementById("tabela");
const btnAdicionarLinha = document.getElementById("btnAdicionarLinha");

btnAdicionarLinha.addEventListener("click", function () {

    // Obtém todas as células da tabela
    const celulas = tabela.getElementsByTagName("td");

    // Pega o último número existente
    let ultimoNumero = Number(celulas[celulas.length - 1].textContent);

    // Cria uma nova linha
    let novaLinha = tabela.insertRow();

    // Cria 3 novas células com a continuação da sequência
    for (let i = 0; i < 3; i++) {

        ultimoNumero++;

        let novaCelula = novaLinha.insertCell();

        novaCelula.textContent = ultimoNumero;
    }
});


// Contador
let contador = 0;

const divContador = document.getElementById("contador");

setInterval(function () {

    contador++;

    divContador.textContent = contador;

}, 1000);


// Lista de atividades
const itens = document.querySelectorAll("#listaAtividades li");

itens.forEach(function (item) {

    item.addEventListener("click", function () {

        this.textContent = "Concluído";

    });

});