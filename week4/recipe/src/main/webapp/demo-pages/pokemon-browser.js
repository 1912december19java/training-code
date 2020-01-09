'use strict';

let spriteElements = [
    document.getElementById('sprite1'),
    document.getElementById('sprite2'),
    document.getElementById('sprite3'),
    document.getElementById('sprite4'),
    document.getElementById('sprite5'),
    document.getElementById('sprite6'),
]

let scrollLeft = document.querySelector('#scroll-left');
let scrollRight = document.querySelector('#scroll-right');
let pokemonInfo = document.querySelector('#pokemon-info');

let startingDisplayIndex = 1;

let baseUri = 'https://pokeapi.co/api/v2/pokemon';

async function getSprites() {
  let windowIndex = 0;
  for(let element of spriteElements) {
    let pokemonNumber = startingDisplayIndex + windowIndex;
    let response = await fetch(`${baseUri}/${pokemonNumber}`)
    let pokemon = await response.json();
    element.src = pokemon.sprites.front_default;
    //TODO: fix this so we don't stack up a bunch of click listeners
    //element.removeEventListener('click');
    element.addEventListener('click', () => {
      createPokemonInfoPopulator(pokemon)();
    });
    windowIndex++;
  }
}

scrollLeft.addEventListener('click', ()=>{
  if(startingDisplayIndex <= 6) {
    startingDisplayIndex = 1;
  } else {
    startingDisplayIndex -= 6;
  }
  getSprites();
});

scrollRight.addEventListener('click', ()=>{
  startingDisplayIndex += 6;
  getSprites();
});

function createPokemonInfoPopulator(pokemon) {
  console.log(`About to return async anonymous function`);
  return async ()=>{
    //this will quickly clear out existing pokemon info:
    console.log(`Clearing pokemonInfo`)
    pokemonInfo.innerHTML = '';
    let infoList = document.createElement('ul');

    console.log(`appendings infoList to pokemonInfo`);
    pokemonInfo.appendChild(infoList);
    let locationResponse = await fetch(pokemon.location_area_encounters);
    let locationsArray = await locationResponse.json();
    for(let key in pokemon) {
      if(['id','name','height','weight'].includes(key)) {
        let listItem = document.createElement('li');
        listItem.innerText = `${key}: ${pokemon[key]}`;
        infoList.appendChild(listItem);
      }
    }
    let listItem = document.createElement('li');
    if(locationsArray.length === 0) {
      listItem.innerText = 'location: Not Found In Wild';
    } else {
      listItem.innerText = `location: ${locationsArray[0].location_area.name}`;
    }
    infoList.appendChild(listItem);
  }
}

getSprites();
