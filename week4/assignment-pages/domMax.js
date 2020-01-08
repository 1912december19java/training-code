const startButton = document.getElementById('start-button');
const fitnessGram = document.getElementById('fitnessgram');
const backgroundColor = document.getElementsByClassName('container');


let currentFontSize = 16;

startButton.addEventListener("mouseover", (e)=>
{
    console.log(e);
    currentFontSize++;
    startButton.style.fontSize = `${currentFontSize}px`;
});

let toggle = false;

startButton.addEventListener("click", (e)=>
{
    console.log(e);
    toggle = !toggle;
    if(toggle) {
        fitnessGram.style.backgroundColor = 'darkred';
      } else {
        fitnessGram.style.backgroundColor = 'teal';
      }
});

fitnessGram.addEventListener("mouseenter", (e)=>
{
    console.log(e);
    fitnessGram.style.backgroundColor = 'aqua';
     
});

