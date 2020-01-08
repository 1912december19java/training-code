'use strict'

const appleElement = document.getElementById('apple');
const orangeElement = document.getElementById('orange');
const grapefruitElement = document.getElementById('grapefruit');
const fruitButtonElement = document.getElementById('fruit-button');

let currentFontSize = 8;

appleElement.addEventListener("click", (e)=>{
  console.log(e);
  currentFontSize++;
  fruitButtonElement.style.fontSize = `${currentFontSize}px`;
});

let toggle = false;

orangeElement.addEventListener('mouseenter', (e)=>{
  console.log(e);
  toggle = !toggle;
  if(toggle) {
    grapefruitElement.style.backgroundColor = 'antiquewhite';
  } else {
    grapefruitElement.style.backgroundColor = 'dodgerblue';
  }
});

fruitButtonElement.addEventListener('click', (e)=>{
  const newTag = document.createElement('p');
  newTag.innerText = 'New Element!';
  newTag.addEventListener('click', (e)=>{
    newTag.style.backgroundColor = 'coral';
  });
  grapefruitElement.appendChild(newTag);
});