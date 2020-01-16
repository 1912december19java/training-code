import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CounterService {

  constructor() { }

  counter : number = 0;

  logCounter(): void {
    console.log(`Service counter: ${this.counter}`);
  }
}
