import { Component } from '@angular/core';
import { Person } from '../models/person';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {

  people: any = [
    {
      firstName: 'Brian',
      lastName: 'Parmelee',
      dateOfBirth: '2022-12-06',
      favoriteColor: 'Yellow',
      bankAccountNumber: 1234567890,
      firstPet: 'PITA'
    },
    {
      firstName: 'Dylan',
      lastName: 'Howard',
      dateOfBirth: '1991-12-25',
      favoriteColor: 'Black',
      bankAccountNumber: 1223334444,
      firstPet: 'Ghost'
    },
    {
      firstName: 'Gentang',
      lastName: 'Funue',
      dateOfBirth: '1945-06-26',
      favoriteColor: 'White',
      bankAccountNumber: 675830513347,
      firstPet: 'None'
    }
  ]

  newPerson: Person = new Person('', '', '', '', 0, '');

  // function for adding a person to the table
  addPerson(): void {
    this.people.push({...this.newPerson});
    console.log(this.people[this.people.length - 1]);
  }

  // variable to trigger ngIf for custom validation
  isMeph: boolean = false;

  // custom validation method
  checkForMeph() {
    if (this.newPerson.firstName === 'Mephistopheles')
      this.isMeph = true;
    else
      this.isMeph = false;
  }

}
