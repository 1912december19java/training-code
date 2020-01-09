'use strict'

let xhr = new XMLHttpRequest();

xhr.open('GET', 'https://pokeapi.co/api/v2/pokemon/1');

xhr.send();

//We need to do this because busywait breaks the XHR req-resp cycle:
setTimeout(()=>{
  console.log(xhr.status);

  console.log(xhr.response);
  
  document.querySelector('h1').innerText = JSON.parse(xhr.response).abilities;
},5000)
