import { Component } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
// import here to post to our service
import { UserService } from '../services/user.service';
// must import the environment to use its contents
import { environment } from 'src/environments/environment';
import { User } from '../models/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent {

  // here we initialize a class variable with the
  // environment variable's value
  envTestVariable: string = environment.envTestVariable;

  // must include the FormBuilder here to have access to it
  // same thing for our UserService
  constructor(private fb: FormBuilder,
              private userService: UserService,
              private router: Router) {}

  registrationForm = this.fb.group(
    {
      firstName: ['', Validators.compose([Validators.minLength(3), 
                                          Validators.maxLength(20), 
                                          Validators.required])],
      lastName: ['', Validators.compose([Validators.minLength(3), 
                                         Validators.maxLength(20), 
                                         Validators.required])],
      email: ['', Validators.compose([Validators.required,
                                      Validators.email])],
      password: ['', Validators.compose([Validators.required,
                                         Validators.minLength(8),
                                         Validators.maxLength(8)])],
      confirmPassword: ['', Validators.compose([Validators.required,
                                                Validators.minLength(8),
                                                Validators.maxLength(8)])]
    }
  );

  get firstName() {
    return this.registrationForm.get('firstName');
  }

  get lastName() {
    return this.registrationForm.get('lastName');
  }

  get email() {
    return this.registrationForm.get('email');
  }

  get password() {
    return this.registrationForm.get('password');
  }

  get confirmPassword() {
    return this.registrationForm.get('confirmPassword');
  }

  formTest: any = {
    firstName: 'firstName',
    lastName: 'lastName',
    email: 'email',
    password: 'password',
    confirmPassword: 'confirmPassword'
  }

  // to apply form values to my formTest variable for display
  // old version!!
  // onSubmit(): void {
  //   this.formTest = this.registrationForm.value;
  //   this.userService.updateUser(this.registrationForm.value);
  // }

  // new version!
  onSubmit(): void {
    this.userService.registerUser(new User(this.firstName?.value!,
                                           this.lastName?.value!,
                                           this.email?.value!,
                                           this.password?.value!));
    // using our imported router, we navigate to the component at the specified path
    this.router.navigate(['../login']);
  }

  // a boolean to keep track of whether the passwords match
  passwordsMatch: boolean = false;

  // a function to check if the passwords match
  checkPasswords(): void {
    // if the passwords match, passwordsMatch becomes true
    // otherwise, it becomes false
    this.passwordsMatch = 
      (this.password!.value === this.confirmPassword!.value);
  }

}
