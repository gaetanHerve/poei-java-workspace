function sendResults() {
    const nom = document.getElementById("nom").value;
    const prenom = document.getElementById("prenom").value;
    const age = document.getElementById("age").value;

    let resultId = `NOM : ${nom}, PRENOM : ${prenom}`;
    let resultAge = `AGE : ${age}`;
    let resultStatus = `STATUS : ${getStatus(age) ?? "erreur"}`;
    
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