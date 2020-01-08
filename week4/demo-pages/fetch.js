'use strict';

let keysButton = document.getElementById('keys-button');
let spriteButton = document.getElementById('sprite-button');
let receivedContent = document.getElementById('content');
let pokemonNumber = 4;

keysButton.addEventListener('click', (event)=>{
  fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonNumber}`)
      .then((response)=>{
        return response.json();
      })
      .then((pokemon)=>{
        //Here we specify what we want to do with our object
        let keysHeader = document.createElement('h4');
        keysHeader.innerText = 'Pokemon Keys:';
        receivedContent.appendChild(keysHeader);
        for(let key in pokemon) {
          let newElement = document.createElement('p');
          newElement.innerText = key;
          receivedContent.appendChild(newElement);
        }
      })
      .catch(console.error);
});

spriteButton.addEventListener('click', (event)=>{
  fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonNumber}`)
      .then(getObjectFromResponseBody)
      .then(addSpriteToDom)
      .catch(console.error);
});

function getObjectFromResponseBody(response) {
  return response.json();
}

function addSpriteToDom(pokemon) {
  let image = document.createElement('img');
  image.alt = 'Pokemon Sprite';
  image.src = pokemon.sprites.front_default;
  receivedContent.appendChild(image);
}