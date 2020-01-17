import { Component, OnInit } from '@angular/core';
import { CounterService } from '../counter.service';

@Component({
  selector: 'app-sqaure-two',
  templateUrl: './sqaure-two.component.html',
  styleUrls: ['./sqaure-two.component.css']
})
export class SqaureTwoComponent implements OnInit {

  //DI in angular: private arg to constrcutor
  constructor(public counterService: CounterService) { }

  ngOnInit() {
    console.log("init of s2");
    this.counterService.logCounter();
  }

  localCounter : number = 0;

  incrementLocal() : void {
    this.localCounter++;
  }

  incrementService() : void {
    this.counterService.counter++;
  }
}
