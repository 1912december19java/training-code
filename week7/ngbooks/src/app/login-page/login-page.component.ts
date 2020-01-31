import { Component, OnInit } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styles: []
})
export class LoginPageComponent implements OnInit {

  user: User = new User('','');

  constructor() { }

  ngOnInit() {
  }

}
