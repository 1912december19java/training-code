import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child-example',
  templateUrl: './child-example.component.html',
  styleUrls: ['./child-example.component.css']
})
export class ChildExampleComponent implements OnInit {

  @Input()
  message : string = "";

  @Output()
  myOutput : EventEmitter<string> = new EventEmitter();

  constructor() { }

  ngOnInit() {
  }

  onClick() : void {
    this.myOutput.emit("just was click");
  }

}
