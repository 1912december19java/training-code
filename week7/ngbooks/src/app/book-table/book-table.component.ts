import { Book } from '../book';
import { BookService } from '../book.service';
import { Component, OnInit, PipeTransform } from '@angular/core';
import { DecimalPipe } from '@angular/common';
import { FormControl } from '@angular/forms';

import { Observable } from 'rxjs';
import { map, startWith } from 'rxjs/operators';


@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  providers: [DecimalPipe],
  styles: []
})
export class BookTableComponent {

  books: Book[] = [];
  books$: Observable<Book[]>;
  filter = new FormControl('');

  constructor(public pipe: DecimalPipe, public bookService: BookService) {
  }

  ngOnInit() {
    this.populateBooks();
  }

  async populateBooks() {
    this.books = await this.bookService.getAll();
    this.books$ = this.filter.valueChanges.pipe(
      startWith(''),
      map(text => this.search(text, this.pipe))
    );
  }
  
  //TODO: search for genres
  search(text: string, pipe: PipeTransform): Book[] {
    return this.books.filter(book => {
      const term = text.toLowerCase();
      return book.title.toLowerCase().includes(term)
          || (book.author ? book.author.name : '').toLowerCase().includes(term);
    });
  }
}

