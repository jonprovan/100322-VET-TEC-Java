import { Component } from '@angular/core';
import { UserService } from './services/user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-api';

  defaultUser: boolean = true;

  // every injectable is a singleton
  // this means there's only ever ONE of it
  // no matter how many times we call it
  constructor(private userService: UserService) {
    this.userService.user.subscribe(data => {
      if (data.firstName === 'Default')
        this.defaultUser = true;
      else
        this.defaultUser = false;
    });
  };
}
