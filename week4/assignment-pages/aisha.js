"use strict"

const myElementAction = document.getElementById('myElement');

myElementAction.addEventListener("click", (e)=>{
    myElementAction.innerText = "Hello There";
});


const myButtonAction = document.getElementById('myButton');
myButtonAction.innerText = "You Changed MY Button Text";


myButtonAction.addEventListener('mouseover', (e)=>{
    myButtonAction.innerText = "You clicked my button";
});