import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  public isLoggedIn: boolean = false;
  public loggedInUser: User = new User('','');

  attemptLogIn(username: string, password: string) {
    const loggingInAsUser = new User(username, password);
    this.http.post('http://localhost:9999/users/login', loggingInAsUser)
        .subscribe((response: boolean)=>{
          if(response) {
            this.isLoggedIn = true;
            this.loggedInUser = loggingInAsUser;
          } else {
            this.isLoggedIn = false;
            this.loggedInUser = new User('','');
          }
        });
  }

  logOut() {
    this.isLoggedIn = false;
    this.loggedInUser = new User('','');
  }
}
