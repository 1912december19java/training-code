import { Component, OnInit } from '@angular/core';
import { BookService } from '../book.service';
import { Book } from '../book';

@Component({
  selector: 'app-book-form',
  templateUrl: './book-form.component.html',
  styles: []
})
export class BookFormComponent implements OnInit {

  book: Book = new Book(0,'',0);

  constructor(private bookService: BookService) { }

  ngOnInit() {
  }

  async onSubmit() {
    console.log(await this.bookService.updateBook(this.book));
  }



}
