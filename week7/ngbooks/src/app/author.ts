import { Book } from './book';

export class Author {
  id: number;
  name: string;
  age: number;
  books?: Book[];

  constructor(i, n, a) {
    this.id = i;
    this.name = n;
    this.age = a;
  }
}