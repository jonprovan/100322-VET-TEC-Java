import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

// each component is a TS class
// just a constructor function on steroids
// we declare variables and functions inside of it
// just like the simpler classes we did in JS

export class AppComponent {
  title = 'angular-project-2';
}
