import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register-page',
  templateUrl: './register-page.component.html',
  styles: []
})
export class RegisterPageComponent implements OnInit {

  user: User =  new User('','');

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

  onSubmit() {
    this.userService.register(this.user.username, this.user.password);
  }
}
