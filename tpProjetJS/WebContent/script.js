let store = new Array();

class Article {
    constructor() {

    }
}

class Facture {
    constructor(client) {
        this.client = client;
        this.lignes = new Array();
    }
}

class Ligne {
    constructor(article, qte) {
        this.article = article;
        this.qte = qte;
    }
}

class Client {
    constructor(nom, prenom, civilite) {
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
    }
}