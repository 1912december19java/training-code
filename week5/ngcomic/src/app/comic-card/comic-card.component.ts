import { Component, OnInit, Input } from '@angular/core';
import { Comic } from '../comic';

@Component({
  selector: 'app-comic-card',
  templateUrl: './comic-card.component.html',
  styles: []
})
export class ComicCardComponent implements OnInit {

  @Input()
  comic : Comic;

  constructor() { }

  ngOnInit() {
  }

}
