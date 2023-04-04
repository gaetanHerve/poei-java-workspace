var randomNumber;
var nbTries = 0;

function generateRandomNumber() {
    nbTries = 0;
    randomNumber = Math.ceil(Math.random()*10);
    console.log("randomNumber: ", randomNumber)
}

function checkAnswer() {
    let resultToDisplay;
    const isCorrect = isCorrectAnswer();
    if (isCorrect) {
        resultToDisplay = `Bravo, vous avez trouvé en ${nbTries} tentative(s) ! Pour rigoler encore un peu, un nouveau nombre aléatoire a été généré.`;
        generateRandomNumber();
    } else {
        resultToDisplay = `Ce n'est pas le bon résultat. retentez votre chance !`;
    }
    document.getElementById("displayResult").innerHTML = resultToDisplay;
}

function isCorrectAnswer() {
    const answer = document.getElementById("guessInput").value;
    nbTries++;
    return (answer == randomNumber);
}