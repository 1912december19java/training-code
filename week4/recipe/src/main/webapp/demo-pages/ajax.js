'use strict'

let getButton = document.querySelector('#get-button');

getButton.addEventListener('click', (event)=>{
  sendGet();
});

function sendGet() {

  let xhr = new XMLHttpRequest();

  //One reason to use xhr over newer APIs is to interact with the ready state
  //HTTP requests go through ready states 0-4, where a 4 means they're done
  console.log(xhr.readyState);
  
  xhr.addEventListener('readystatechange', (event)=>{
    console.log(xhr.readyState);

    if(xhr.readyState === xhr.DONE) {

      //We've received some response since the readystate is DONE
      let response = xhr.response;
      console.log(response);

      //condition for success/failure:
      if(xhr.status >= 200 && xhr.status < 300) {
        console.log(`Success with status ${xhr.status}`);
        getButton.innerHTML = 'GET sent success';
      } else {
        console.error(`Failure with status ${xhr.status}`);
      }
    }
  });

  xhr.open('GET', 'https://pokeapi.co/api/v2/pokemon');

  //actually send
  xhr.send();
}