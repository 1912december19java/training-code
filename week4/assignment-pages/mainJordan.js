"use strict";
const transButton = document.getElementById("transButton");
const hoverText = document.getElementById("hoverText");
const hoverTextAlt = document.getElementById("hoverTextAlt");
const returnDiv = document.getElementById('returnDiv');
let colorChanged = false;
let movedText = false;
let movedTwice = 0;

transButton.addEventListener("click", e => {
  if (colorChanged) {
    transButton.textContent = "STOP!";
    transButton.style.background = "red";
    transButton.style.color = "white";
    colorChanged = false;
  } else if (!colorChanged) {
    transButton.textContent = "PLEASE!";
    transButton.style.background = "white";
    transButton.style.color = "black";
    colorChanged = true;
    console.log("change to safe");
  }
});

hoverText.addEventListener("mouseover", e => {
  if (!movedText) {
      console.log('hover');
      hoverTextAlt.appendChild(hoverText);
      hoverText.textContent = "I said DON'T hover!"
      movedText = true;
      movedTwice++

  }else if (movedText){
      console.log('hover');
      returnDiv.appendChild(hoverText);
      movedTwice++
  }
  if (movedTwice === 2){
      hoverText.textContent = "Ok, fine, you win."
  }
});
