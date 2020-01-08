'use strict'

const DogoNameElement = document.getElementById('DogoName');
const DogoPicElement = document.getElementById('DogoPic');


Dogo-button.addEventListener("click", (e)=>{
    console.log(e);
    currentFontSize++;
DogoNameElement.style.fontSize = `${currentFontSize}px`;
});