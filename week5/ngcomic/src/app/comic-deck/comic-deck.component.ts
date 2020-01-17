import { Component, OnInit } from "@angular/core";
import { Comic } from "../comic";

@Component({
  selector: "app-comic-deck",
  templateUrl: "./comic-deck.component.html",
  styles: []
})
export class ComicDeckComponent implements OnInit {
  comics: Comic[] = [
    {
      id: 99,
      pageCount: 100,
      price: 40.0,
      rating: 9,
      title: "Mock Comic On Frontend 1"
    },
    {
      id: 99,
      pageCount: 100,
      price: 40.0,
      rating: 9,
      title: "Mock Comic On Frontend 2"
    }
  ];

  constructor() {}

  ngOnInit() {}
}
