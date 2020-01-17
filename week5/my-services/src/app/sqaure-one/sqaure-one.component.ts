import { Component, OnInit, OnChanges } from '@angular/core';
import { CounterService } from '../counter.service';

@Component({
  selector: 'app-sqaure-one',
  templateUrl: './sqaure-one.component.html',
  styleUrls: ['./sqaure-one.component.css']
})
export class SqaureOneComponent implements OnInit, OnChanges {

  constructor(public counterService : CounterService) { }

  ngOnInit() {
    console.log('init of s1');
    this.counterService.logCounter();
  }

  ngOnChanges() {
    console.log('something changed! ngOnChanges is running');
  }

  localCounter : number = 0;

  incrementLocal() : void {
    this.localCounter++;
  }

  incrementService() : void {
    this.counterService.counter++;
  }


}
