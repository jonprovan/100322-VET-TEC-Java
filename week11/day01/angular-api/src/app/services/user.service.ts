// to create a service, use ng g service <nameofservice>
// remember that Angular tacks on .service to the name
// so just use the name without any mention of service

// an injectable is something Angular can insert wherever we need it
import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { User } from '../models/user';

// services have the @Injectable() decorator
@Injectable({
  providedIn: 'root'
})

// still a class, still exported
// we can use a service to do and/or hold anything
// we want to access in a non-parent/child way
export class UserService {

  constructor() { }

  // an array of pre-existing users we can add to as people register
  users: User[] = [
    new User('Raymond', 'Hernandez', 'numberonealcoholic@aa.com', 'tequila1'),
    new User('Brian', 'Parmalee', 'thebigcheeze@aol.com', 'cheezplz'),
    new User('admin', 'istrator', 'admin@gmail.com', 'tsinimda')
  ]

  // a BehaviorSubject is something whose state change is tracked
  // as if shifts from one thing to another
  private currentUser = new BehaviorSubject<User>(new User('','','',''));

  // this sets up the user variable to refer to the contents
  // of the userSubject variable as something whose changes
  // we can watch and respond to
  user = this.currentUser.asObservable();

  // this accomplishes the same goal
  // getUserSubject(): any {
  //   return this.currentUser.asObservable();
  // }

  // to update the data inside the BehaviorSubject
  loginUser(newUser: User): void {
    // this takes the input object
    // and stores it as the next state of the subject
    this.currentUser.next(newUser);
  }

  logoutUser(): void {
    this.currentUser.next(new User('','','',''));
  }

  // to add a user to our array for future login
  // using our new class as a parameter type
  registerUser(newUser: User) {
    this.users.push(newUser);
  }


  // we CAN set up and grab values from variables as normal
  // BUT it's more difficult to respond to changes

  // userVariable: any = {
  //   firstName: 'Default',
  //   lastName: 'User',
  //   email: '123@abc.com',
  //   password: '12345',
  //   confirmPassword: '12345'
  // }


}
