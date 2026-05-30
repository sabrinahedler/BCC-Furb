// Lista de palavras válidas (5 letras)
const palavras = [
    "LIVRO", "CARRO", "PRAIA", "PEDRA", "NUVEM",
    "ROUPA", "SONHO", "MORRO", "CASAL", "FESTA",
    "AMIGO", "FRUTA", "POMAR", "FOLHA", "TIGRE",
    "FAROL", "PAPEL", "SABOR", "LIMAO", "HOTEL",
    "METRO", "BANCO", "PRATO", "TENIS", "JOVEM",
    "MAGRO", "LAPIS", "NAVIO", "TRIGO", "VELHO",
    "RISCO", "PLANO", "MUNDO", "CAMPO", "BRISA",
    "FORTE", "PONTE", "TARDE", "CEDRO", "MANGA",
    "SALTO", "PILHA", "TORRE", "PIZZA", "FONTE",
    "BARCO", "GRAMA", "PEIXE", "CERCA", "AREIA"
];

// Sorteia uma palavra
function sortearPalavra() {
    const indice = Math.floor(Math.random() * palavras.length);
    return palavras[indice];
}

let palavraSecreta = sortearPalavra();

const tentativaInput = document.getElementById("tentativa");
const btnEnviar = document.getElementById("btnEnviar");
const btnReiniciar = document.getElementById("btnReiniciar");
const mensagem = document.getElementById("mensagem");

const linhas = document.querySelectorAll("#tabuleiro .linha");

let tentativaAtual = 0;

// Enviar pelo botão
btnEnviar.addEventListener("click", verificarTentativa);

// Enviar pressionando Enter
tentativaInput.addEventListener("keydown", function (event) {
    if (event.key === "Enter") {
        verificarTentativa();
    }
});

function verificarTentativa() {

    const tentativa = tentativaInput.value.toUpperCase().trim();

    // Verifica tamanho
    if (tentativa.length !== 5) {
        mensagem.textContent =
            "Digite uma palavra com exatamente 5 letras.";
        return;
    }

    // Verifica se a palavra existe na lista
    if (!palavras.includes(tentativa)) {
        mensagem.textContent =
            "Palavra não reconhecida.";
        return;
    }

    if (tentativaAtual >= 6) {
        return;
    }

    const casas =
        linhas[tentativaAtual].querySelectorAll(".casa");

    for (let i = 0; i < 5; i++) {

        casas[i].textContent = tentativa[i];

        // Letra correta na posição correta
        if (tentativa[i] === palavraSecreta[i]) {

            casas[i].style.backgroundColor = "#6aaa64";
            casas[i].style.borderColor = "#6aaa64";
            casas[i].style.color = "white";

        }

        // Letra existe na palavra mas está em outra posição
        else if (palavraSecreta.includes(tentativa[i])) {

            casas[i].style.backgroundColor = "#c9b458";
            casas[i].style.borderColor = "#c9b458";
            casas[i].style.color = "white";

        }

        // Letra não existe na palavra
        else {

            casas[i].style.backgroundColor = "#787c7e";
            casas[i].style.borderColor = "#787c7e";
            casas[i].style.color = "white";
        }
    }

    // Vitória
    if (tentativa === palavraSecreta) {

        mensagem.textContent =
            "🎉 Parabéns! Você acertou a palavra!";

        tentativaInput.disabled = true;
        btnEnviar.disabled = true;

        return;
    }

    tentativaAtual++;

    // Derrota
    if (tentativaAtual === 6) {

        mensagem.textContent =
            `❌ Você perdeu! A palavra era: ${palavraSecreta}`;

        tentativaInput.disabled = true;
        btnEnviar.disabled = true;
    }

    tentativaInput.value = "";
    tentativaInput.focus();
}

// Reiniciar jogo
btnReiniciar.addEventListener("click", function () {

    palavraSecreta = sortearPalavra();

    tentativaAtual = 0;

    linhas.forEach(function (linha) {

        const casas = linha.querySelectorAll(".casa");

        casas.forEach(function (casa) {

            casa.textContent = "";
            casa.style.backgroundColor = "";
            casa.style.borderColor = "#d3d6da";
            casa.style.color = "";

        });

    });

    mensagem.textContent = "";

    tentativaInput.disabled = false;
    btnEnviar.disabled = false;

    tentativaInput.value = "";
    tentativaInput.focus();

});