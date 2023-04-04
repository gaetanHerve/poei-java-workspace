var person = {
    nom: "",
    prenom: "",
    age: 0,
    getInfo: function() {
        return `${this.nom.toUpperCase()} <br>
        ${this.prenom.toLowerCase()} <br>
        ${this.age} <br>
        ${this.age < 18 ? "mineur" : "majeur"}`;
    }
}

function sendResults() {
    Object.keys(person).forEach( attr => {
        if (!(person[attr] instanceof Function))
            person[attr] = document.getElementById(attr).value;
    });
    document.getElementById("display").innerHTML = person.getInfo();
}

function clearInfos() {
    Object.keys(person).forEach( attr => {
        if (!(person[attr] instanceof Function))
            document.getElementById(attr).value = person[attr] = "";
    });
    document.getElementById("display").innerHTML = "";
}
