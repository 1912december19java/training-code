import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Comic } from './comic';

@Injectable({
  providedIn: 'root'
})
export class ComicService {

  constructor(private http : HttpClient) { }

  getAllComics() : Observable<Comic[]> {
    return this.http.get<Comic[]>(
      'http://localhost:8080/comicappv2/api/comics'
    )
  }

  async promiseGetAllComics() : Promise<Comic[]> {
    return await this.http.get<Comic[]>(
      'http://localhost:8080/comicappv2/api/comics'
    ).toPromise();
  }

  sendComic(comic : Comic) : void {
    this.http.post('http://localhost:8080/comicappv2/api/comics',
      comic).subscribe((data)=>{console.log(data)});
  }
}
