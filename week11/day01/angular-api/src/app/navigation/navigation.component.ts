import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent {

  userFirstName: string = '';

  constructor(private userService: UserService, private router: Router) {
    this.userService.user.subscribe(data => {
      this.userFirstName = data.firstName;
    });
  }

  // to log out
  logout(): void {
    this.userService.logoutUser();
    this.router.navigate(['../login']);
  }

}
