import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor(private userService: UserService, private router: Router) {}

  email: string = '';
  password: string = '';

  // function to log the user in if they're in the array of users
  login(): void {
    const users = this.userService.users;

    for (let user of users) {
      if (user.email === this.email && user.password === this.password)
        this.userService.loginUser(user);
    }

    this.router.navigate(['../cocktails']);
  }

  devLogin() {
    this.userService.loginUser(this.userService.users[0]);
    this.router.navigate(['../cocktails']);
  }

}
