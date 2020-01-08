'use strict'

const btn1Element = document.getElementById('btn1');
const btn2Element = document.getElementById('btn2');
const bod = document.getElementById('body');
const head = document.getElementById('head');
const para = document.getElementById('para');
head.style.backgroundColor = 'white';

para.style.fontSize = 2;

let currentSize = 15;
let size = 15;
btn1Element.addEventListener('click',   (e)=>{
    console.log('<3');
    currentSize++
    btn1Element.style.fontSize = `16px`;
    btn2Element.style.fontSize = `${currentSize}px`;
});

btn2Element.addEventListener('click', (e)=>{
    console.log('I told you not to press it </3')
    size--;
    btn1Element.style.fontSize = `${size}px`
    btn2Element.style.fontSize = `1px`;
});

btn2Element.addEventListener('mouseover', (e)=>{
    console.log('DON\'T DO IT');
    head.style.backgroundColor = 'red';
    bod.style.backgroundColor = 'red';
});

btn2Element.addEventListener('mouseout', (e)=>{
    head.style.backgroundColor = 'white';
    bod.style.backgroundColor = 'white';
});

btn1Element.addEventListener('mouseover', (e)=>{
    console.log('do it :)');
    head.style.backgroundColor = 'green';
    bod.style.backgroundColor = 'green';
});

btn1Element.addEventListener('mouseout', (e)=>{
    head.style.backgroundColor = 'white';
    bod.style.backgroundColor = 'white';
});