import { Component } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-header-aside',
  templateUrl: './header-aside.component.html',
  styleUrls: ['./header-aside.component.css']
})
export class HeaderAsideComponent {

  userName: string = '';

  // access the service via the constructor
  constructor(private userService: UserService) {

    // this returns the new data whenever the thing we're subscribing
    // to changes state
    userService.user.subscribe(data => {
      console.log(data);
      this.userName = data.firstName;
    })
    
  }

}
