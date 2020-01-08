'use strict'

const elmo = document.getElementById("elmoPic");
const button = document.getElementById("mainButton");
const mainElmo = document.getElementById('mainElmo');

button.addEventListener('click', (e)=>{
    console.log('click');
    elmo.style.opacity = 100;
});

let sizeMultiplierHeight = 500;
let sizeMultiplierWidth = 500;

elmo.addEventListener('mouseover', (e)=>{
        sizeMultiplierHeight++;
        sizeMultiplierWidth++;
        elmo.style.height = `${sizeMultiplierHeight}px`;
        elmo.style.width = `${sizeMultiplierWidth}px`;

});

elmo.addEventListener('mouseout', (e)=>{
    sizeMultiplierHeight++;
    sizeMultiplierWidth++;
    elmo.style.height = `${sizeMultiplierHeight}px`;
    elmo.style.width = `${sizeMultiplierWidth}px`;

});

