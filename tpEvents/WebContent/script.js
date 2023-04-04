function onInputChange(inputId) {
    const currentVal = document.getElementById(inputId).value;
    switch (inputId) {
        case "prenom":
            checkInput(inputId);
            document.getElementById("prenom").value = currentVal.toLowerCase();
            break;
        case "nom":
            checkInput(inputId);
            document.getElementById("nom").value = currentVal.toUpperCase();
            break;
        default:
    }
    toggleValidation();
}

function checkInput(inputId) {
    const error = (document.getElementById(inputId).value == "")
    displayError(error, inputId);
}

function checkAgeValue(age) {
    return (typeof(age) === "number" && age >= 0 && age <= 120);
}

function displayError(display, field) {
    const htmlElem = document.getElementById(field);
    htmlElem.style.backgroundColor = display ? "red" : "white";
    document.getElementById(`${field}Error`).hidden = !display;
}

function toggleValidation() {
    const {nom, prenom, age} = getAllInputValues();
    if (nom != "" && prenom != "" && checkAgeValue(parseInt(age)))
        document.getElementById("validate").removeAttribute("disabled");
    else
        document.getElementById("validate").setAttribute("disabled", "disabled");
}

function getAllInputValues() {
    return {
        nom: document.getElementById("nom").value,
        prenom: document.getElementById("prenom").value,
        age: document.getElementById("age").value
    }
}

function sendResults() {
    const nom = document.getElementById("nom").value;
    const prenom = document.getElementById("prenom").value;
    const age = document.getElementById("age").value;
    const status = getStatus(age);

    let resultId = `NOM : ${nom}, PRENOM : ${prenom}`;
    let resultAge = `AGE : ${age}`;
    let resultStatus = `STATUS : ${status ?? "erreur"}`;

    document.getElementById("status").style.color = (status == "mineur") ? "green" : "red";
    
    document.getElementById("resultId").innerHTML = resultId;
    document.getElementById("resultAge").innerHTML = resultAge;
    document.getElementById("status").innerHTML = resultStatus;
}

function getStatus(age) {
    let result = null;
    if (age >= 0 && age <= 120) {
        if (age < 18) {
            result = "mineur";
        } else if (age < 50) {
            result = "majeur";
        } else if (age >= 50) {
            result = "senior";
        }
    }
    return result;
}
