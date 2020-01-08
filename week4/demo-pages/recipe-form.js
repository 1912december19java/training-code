'use strict';

let recipeForm = document.getElementById('recipe-form');
let recipeName = document.getElementById('recipe-name');
let recipeDirections = document.getElementById('recipe-directions');
let recipeServes = document.getElementById('recipe-serves');

let recipeUri = 'https://pastebin.com/api/api_post.php?api_dev_key=mykey&api_option=paste&api_paste_code=hi';

recipeForm.addEventListener('submit', (event)=>{
  //we need to prevent default form behaviour
  event.preventDefault();
  sendRecipe();
  });

async function sendRecipe() {
  console.log(recipeName.value);
  console.log(recipeDirections.value);
  console.log(recipeServes.value);

  let recipe = {};
  recipe.name = recipeName.value;
  recipe.directions = recipeDirections.value;
  recipe.serves = recipeServes.value;

  console.log(recipe);

  let response = await fetch(recipeUri, { method: 'POST', body: JSON.stringify(recipe) });
  console.log(response);
}
