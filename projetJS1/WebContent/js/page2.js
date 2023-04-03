function init() {   
    const x = document.getElementById("demo");
    x.innerHTML += "Toto".toUpperCase();
    x.style.color = "red"
}

var x = "test";
function testSplit() {
    const maChaine = "salaut comment ça va ?";
    let test = maChaine.split(" ");
    test.forEach(element => {
        console.log(element);
    });
    let floor = Math.floor(12.33);
    let trunc = Math.trunc(12.33);
    console.log("floor: ", floor);
    console.log("trunc: ", trunc);
    console.log(Math.round(Math.random()*10));

    console.log(x)
}