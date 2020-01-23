import { Component, OnInit } from "@angular/core";
import { Comic, COMIC_MOCKS } from "../comic";
import { ComicService } from "../comic.service";

@Component({
  selector: "app-comic-deck",
  templateUrl: "./comic-deck.component.html",
  styles: []
})
export class ComicDeckComponent implements OnInit {
  comics: Comic[] = COMIC_MOCKS;
  constructor(private comicService: ComicService) {}

  ngOnInit() {
    //Both of these are fine:
    this.comicService.getAllComics().subscribe((data) => {
      this.comics = data;
    });
    //this.populateComics();
  }

  async populateComics() {
    this.comics = await this.comicService.promiseGetAllComics();
  }
}
