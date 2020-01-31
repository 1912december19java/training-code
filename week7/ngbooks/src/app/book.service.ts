import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Book } from './book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient) { }

  async getAll() : Promise<Book[]> {
    return this.http.get<Book[]>('http://localhost:8080/books/books')
        .toPromise();
  }

  async addBook(book: Book) : Promise<number> {
    return this.http.post<number>('http://localhost:8080/books/books', book)
        .toPromise();
  }

  async updateBook(book: Book) : Promise<Book> {
    return this.http.put<Book>(`http://localhost:8080/books/books/${book.id}`, book)
        .toPromise();
  }
}
