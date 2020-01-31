import { Author } from './author';
import { Genre } from 'src/app/genre';

export class Book {
  id: number;
  title: string;
  pageCount: number;
  author?: Author;
  genres?: Genre[];

  constructor(i, t, p) {
    this.id = i;
    this.title = t;
    this.pageCount = p;
  }

}

export const BOOK_MOCKS = [
  new Book(900, 'Book1', 30),
  new Book(901, 'Book2', 30)
]