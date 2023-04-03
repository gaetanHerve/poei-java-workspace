function sendResults() {
    const nom = document.getElementById("nom").value;
    const prenom = document.getElementById("prenom").value;
    const age = document.getElementById("age").value;

    let result = `NOM : ${nom}, PRENOM : ${prenom}, AGE : ${age}`;
    document.getElementById("result").innerHTML = result;
}