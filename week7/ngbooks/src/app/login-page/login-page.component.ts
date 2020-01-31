import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styles: []
})
export class LoginPageComponent implements OnInit {

  user: User = new User('','');

  constructor(public userService : UserService) { }

  ngOnInit() {
  }

  onSubmit() {
    this.userService.attemptLogIn(this.user.username, this.user.password);
    this.user = new User('','');
    }

}
