'use strict';

//Getter only example:

//Closure needs outer function:
function outerFunction() {

  let myValue = 10;

  function innerFunction() {
    return myValue;
  }

  return innerFunction;
}

let myValueGetter = outerFunction();

console.log(myValueGetter());

//Closed-over clicker counter example

function counterBuilder(initialValue) {

  let currentValue = initialValue;

  function counter() {
    return currentValue++;
  }

  return counter;
}

let counterOne = counterBuilder(0);
let counterTwo = counterBuilder(100);

console.log('counter starting at 0:')
for(let i=0;i<30;i++) {
  console.log(counterOne());
}

console.log('counter starting at 100: ');
for(let i=0;i<10;i++) {
  console.log(counterTwo());
}

//Getter and Setter example:

function stringGetterSetterBuilder() {

  let stringValue = "";

  function stringGetter() {
    return stringValue;
  }

  function stringSetter(newString) {
    if(typeof newString === 'string') {
      stringValue = newString;
    } else {
      console.error(`Cannot set string: ${newString}`);
    }
  }
  return [stringGetter, stringSetter];
}

let getterAndSetter = stringGetterSetterBuilder();
let myGetter = getterAndSetter[0];
let mySetter = getterAndSetter[1];

console.log(myGetter());
mySetter("Hi There!");
console.log(myGetter());
mySetter(300);
console.log(myGetter());

