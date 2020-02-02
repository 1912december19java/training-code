import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Book } from './book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  baseUrl: string = 'http://ec2-3-93-10-143.compute-1.amazonaws.com:8085/books'

  constructor(private http: HttpClient) { }

  async getAll() : Promise<Book[]> {
    return this.http.get<Book[]>(`${this.baseUrl}/books`)
        .toPromise();
  }

  async addBook(book: Book) : Promise<number> {
    return this.http.post<number>(`${this.baseUrl}/books`, book)
        .toPromise();
  }

  async updateBook(book: Book) : Promise<Book> {
    return this.http.put<Book>(`${this.baseUrl}/books/${book.id}`, book)
        .toPromise();
  }
}
