import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-my-second-component',
  templateUrl: './my-second-component.component.html',
  styleUrls: ['./my-second-component.component.css']
})
export class MySecondComponentComponent implements OnInit {

  //fields/properties
  x : number;
  myString : string;

  console = console;

  constructor() { }

  ngOnInit() {
    this.myString = "Hello!";
    this.x = 0;
    console.log(this.myString);
  }

  incrementNumber() : void {
    this.x++;
  }

}
