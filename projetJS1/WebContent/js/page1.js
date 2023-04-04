
function init() {   
    let x = document.getElementById("demo");
    x.innerHTML = "Paragraph changed.";
}

function testArrays() {
    let arr = new Array();
    arr.push(1);
    arr.push(2);
    arr.push(3);
    console.log("initial array: ", arr);
    arr.forEach(testArrFunction);
    console.log("modified: ", arr);
}

function testArrFunction(value) {
    console.log(value + 1);
}
    
