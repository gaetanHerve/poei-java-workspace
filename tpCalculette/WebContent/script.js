function getNumbers() {
    const nb1Elem = document.getElementById("nb1");
    const nb2Elem = document.getElementById("nb2");
    return {nb1: Number(nb1Elem.value), nb2: Number(nb2Elem.value)};
}

function getResult(operator) {
    const {nb1, nb2} = getNumbers();
    const result = calculate(nb1, nb2, operator);
    document.getElementById("result").innerHTML = `Résultat : ${result}`;
}

function calculate(nb1, nb2, operator) {
    let result = null;
    switch (operator) {
        case 'plus':
            result = add(nb1, nb2);
            break;
        case 'minus':
            result = substract(nb1, nb2)
            break;
        case 'mult':
            result = multiply(nb1, nb2)
            break;
        case 'div':
            result = divide(nb1, nb2)
            break;
        default:
            break;
    }
    return result;
}

function add(nb1, nb2) {
    return nb1 + nb2;
}

function substract(nb1, nb2) {
    return nb1 - nb2;
}

function multiply(nb1, nb2) {
    return nb1 * nb2;
}

function divide(nb1, nb2) {
    return nb1 / nb2;
}