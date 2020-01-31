import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  //TODO: change back to false
  public isLoggedIn: boolean = true;
  public loggedInUser: User = new User('','');

  register(username: string, password:string) {
    this.http.post('http://localhost:9999/users', new User(username, password))
        .subscribe((response: number)=>{
          console.log(`registered as user ${response}`);
        });
  }

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
