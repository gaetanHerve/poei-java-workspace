var randomNumber;
var nbTries = 0;
var triesThreshold = 4;
var minNumber = 1;
var maxNumber = 10;

function generateRandomNumber() {
    nbTries = 0;
    randomNumber = Math.floor(Math.random() * (maxNumber-minNumber + 1)) + minNumber;
    console.log("randomNumber: ", randomNumber);
    const ruleElt = document.getElementById("rule");
    ruleElt.innerHTML = `L'ordinateur a choisi un nombre entre ${minNumber} et ${maxNumber}. Essayez de le retrouver en ${triesThreshold} tentatives maximum.`;
    enableBtn("validate");
    document.getElementById("displayResult").innerHTML = "";
}

function setParams() {
    triesThreshold = parseInt(document.getElementById("nbTries").value);
    minNumber = parseInt(document.getElementById("min").value);
    maxNumber = parseInt(document.getElementById("max").value);
    if (minNumber > maxNumber) {
        document.getElementById("error").innerHTML = "Min doit être inférieur à max";
    }  else {
        document.getElementById("error").innerHTML = "";
        generateRandomNumber();
    }
}

function checkAnswer() {
    let resultToDisplay;
    const answer = document.getElementById("guessInput").value;
    const isCorrect = isCorrectAnswer(answer);
    if (isCorrect) {
        resultToDisplay = `Bravo, vous avez trouvé en ${nbTries} tentative(s) !`;
        disableBtn("validate");
    } else {
        if (nbTries < triesThreshold) {
            resultToDisplay = `${compareAnswer(answer)}. retentez votre chance ! Il vous reste ${triesThreshold - nbTries} Tentatives.`
        } else {
            resultToDisplay = `Vous n'avez pas trouvé dans le nombre imparti de tentatives (${triesThreshold}).`;
            disableBtn("validate");
        }
    }
    document.getElementById("displayResult").innerHTML = resultToDisplay;
}

function isCorrectAnswer(answer) {
    nbTries++;
    return (answer == randomNumber);
}

function compareAnswer(answer) {
    return answer > randomNumber ? "c'est moins" : "c'est plus";
}

function disableBtn(btnId) {
    document.getElementById(btnId).disabled = true;
}

function enableBtn(btnId) {
    document.getElementById(btnId).disabled = false;
}