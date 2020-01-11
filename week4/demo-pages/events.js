'use strict';

let button = document.getElementById('inner');
let div = document.getElementById('outer');

button.addEventListener('click', generateAlert('Button Capture'), true);
div.addEventListener('click', generateAlert('Div Capture'), true);
document.addEventListener('click', (event)=>{
  alert('Document Capture');
  //event.stopPropagation(); //dont do this
}, true);

button.addEventListener('click', generateAlert('Button Bubble'));
div.addEventListener('click', generateAlert('Div Bubble'));
document.addEventListener('click', generateAlert('Document Bubble'));

function generateAlert(message) {
  return (e)=>{alert(message);}
}

