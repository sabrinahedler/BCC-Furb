const campoTexto = document.getElementById("campoTexto");
const espelhoTexto = document.getElementById("espelhoTexto");
const btnTamanho = document.getElementById("btnTamanho");
const resultadoTamanho = document.getElementById("resultadoTamanho");

// Atualiza o conteúdo a cada tecla digitada
campoTexto.addEventListener("input", function() {
    espelhoTexto.textContent = campoTexto.value;
});

// Mostra o tamanho atual do texto
btnTamanho.addEventListener("click", function() {
    resultadoTamanho.textContent =
        "O tamanho atual do campo é de: " + campoTexto.value.length;
});