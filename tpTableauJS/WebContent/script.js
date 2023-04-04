var nameList = new Array();

function add() {
    const {name, firstname} = getInfos();
    if (name != "" && firstname != "") {
        displayError(false);
        nameList.push(`${name} ${firstname}`);
        console.log(nameList);
        clearInfos();
    } else {
        displayError(true);
    }
    
}

function displayError(display) {
    document.getElementById("error").hidden = !display;
}

function print() {
    const listHtmlElem = getListHtmlElem();
    let htmlStr = "";
    nameList.forEach(elem => {
        htmlStr += `<li> ${elem} </li>`;
    });
    listHtmlElem.innerHTML = htmlStr;
}

function getInfos() {
    return {
        name: document.getElementById("name").value,
        firstname: document.getElementById("firstname").value
    }
}

function clearInfos() {
    document.getElementById("name").value = "";
    document.getElementById("firstname").value = "";
}

function getListHtmlElem() {
    return document.getElementById("list");
}