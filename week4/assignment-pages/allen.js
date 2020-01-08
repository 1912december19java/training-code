'use strict'

const cookieCounterElement = document.getElementById("counter");
const cookieButtonElement = document.getElementById("cookie-button");
const pictureElement = document.getElementById("picture");
const bodyElement = document.getElementById("body");
let cookieNumber = 0;


cookieCounterElement.addEventListener("click",(e)=>{
    cookieNumber+=(Math.floor(100*Math.random()));
    cookieCounterElement.textContent=`Number of cookies: ${cookieNumber}`;
})

cookieButtonElement.addEventListener("click",(e)=>{
    cookieNumber++;
    cookieCounterElement.textContent=`Number of cookies: ${cookieNumber}`;
})

bodyElement.addEventListener("mousemove", (e)=>{
    let a = Math.floor(255*Math.random());
    let b = Math.floor(255*Math.random());
    let c = Math.floor(255*Math.random());
    cookieButtonElement.style.backgroundColor = "rgb(" + a + "," + b + "," + c + ")";
})