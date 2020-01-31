import { Book } from './book'

export class Genre {
  id: number;
  name: string;
  rating: number;
  books?: Book[];

  constructor(i, n, r) {
    this.id = i;
    this.name = n;
    this.rating = r;
  }
}