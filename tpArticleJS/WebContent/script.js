let articles = new Array();

class Article {
    constructor(ref, marque, prix) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
    }
    getMarque() {return this.marque.toUpperCase();}
    getPrix() {return `${this.prix}€`;}
}

function addArticle() {
    const values = getInputValues();
    articles.push(new Article(values.ref, values.marque, values.prix));
}

function getInputValues() {
    return {
        ref: document.getElementById("ref").value,
        marque: document.getElementById("marque").value,
        prix: document.getElementById("prix").value
    }
}

function displayArticles() {
    let tableBody = document.getElementById("articlesTableBody");
    tableBody.innerHTML = "";
    articles.forEach( article => {
        tableBody.innerHTML +=
        `<tr>
            <td>${article.ref}</td>
            <td>${article.getMarque()}</td>
            <td>${article.getPrix()}</td>
        </tr>`;
    });
}

function clearArticles() {
    articles = [];
    displayArticles();
}
