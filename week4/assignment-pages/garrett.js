'use strict'

const greenButton = document.getElementById('green');

const blueButton = document.getElementById('blue');

greenButton.addEventListener("click", (e)=>{
    console.log(e);
    document.body.style.backgroundColor='green';
});

blueButton.addEventListener("click", (e)=>{
    console.log(e);
    document.body.style.backgroundColor='blue';
});

const textBox = document.getElementById('test');

textBox.addEventListener("click", (e)=>{
    console.log(e);
    window.alert("Hey, knock it off!");
})