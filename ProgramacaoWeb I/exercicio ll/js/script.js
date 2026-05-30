const num1 = document.getElementById("num1");
const num2 = document.getElementById("num2");

const btnSoma = document.getElementById("btnSoma");
const btnComparar = document.getElementById("btnComparar");

const resultadoSoma = document.getElementById("resultadoSoma");
const resultadoComparacao = document.getElementById("resultadoComparacao");

// Soma
btnSoma.addEventListener("click", function () {

    let valor1 = Number(num1.value);
    let valor2 = Number(num2.value);

    let soma = valor1 + valor2;

    resultadoSoma.textContent = "Resultado da soma: " + soma;
});

// Comparação
btnComparar.addEventListener("click", function () {

    let valor1 = Number(num1.value);
    let valor2 = Number(num2.value);

    if (valor1 > valor2) {
        resultadoComparacao.textContent = "Primeiro número é maior";
        resultadoComparacao.style.backgroundColor = "red";
        resultadoComparacao.style.color = "white";
    }
    else if (valor2 > valor1) {
        resultadoComparacao.textContent = "Segundo número é maior";
        resultadoComparacao.style.backgroundColor = "green";
        resultadoComparacao.style.color = "white";
    }
    else {
        resultadoComparacao.textContent = "Ambos são iguais";
        resultadoComparacao.style.backgroundColor = "yellow";
        resultadoComparacao.style.color = "black";
    }
});