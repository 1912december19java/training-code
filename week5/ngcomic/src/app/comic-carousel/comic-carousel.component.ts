import { Component, OnInit, Input } from '@angular/core';
import { Comic } from '../comic';

@Component({
  selector: 'app-comic-carousel',
  templateUrl: './comic-carousel.component.html',
  styles: []
})
export class ComicCarouselComponent implements OnInit {

  @Input()
  comics : Comic[];

  constructor() { }

  ngOnInit() {
  }

}
