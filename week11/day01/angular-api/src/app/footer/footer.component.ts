import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})

export class FooterComponent implements OnInit {

  email: string = '';
  mailToString = '';

  constructor(private userService: UserService) {}

  ngOnInit(): void {
    this.userService.user.subscribe(data => {
      this.email = data.email;
      this.mailToString = 'mailto:' + this.email;
    });
  }

}
