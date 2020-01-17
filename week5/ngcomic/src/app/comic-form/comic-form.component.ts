import { Component, OnInit } from '@angular/core';
import { Comic, COMIC_MOCKS } from '../comic';
import { ComicService } from '../comic.service';

@Component({
  selector: 'app-comic-form',
  templateUrl: './comic-form.component.html',
  styles: []
})
export class ComicFormComponent implements OnInit {

  comic : Comic = COMIC_MOCKS[0];

  constructor(private comicService : ComicService) { }

  ngOnInit() {
  }

  submit() : void {
    this.comicService.sendComic(this.comic);
  }

}
