import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent {

  // this injects a FormBuilder to use in our class
  constructor(private formBuilder: FormBuilder) { }

  // creating a form group for a DnD character
  // create a form group
  characterForm = this.formBuilder.group(
    // the group is an object
    {
      // each property includes an initial value
      // each property includes its validators
      // each of these properties is a form control
      // an array with [0] initial value and [1] validators
      name: ['', Validators.compose([Validators.required, Validators.minLength(5)])],
      // if just one Validator is needed, just put it in as the second argument
      class: ['', Validators.required],
      race: ['', Validators.required],
      alignment: ['', Validators.required],
      primaryWeapon: ['', Validators.required],
      // if you need more than one, use Validators.compose
      // this takes as its argument an array of individual Validators
      characterLevel: [1, Validators.compose([Validators.required, Validators.min(1), Validators.max(20)])]
    }
  );

  // a getter for a property in a form group
  get name() {
    // HashMap-type syntax
    // returns the value, not the whole control array
    return this.characterForm.get('name')!;
  }

  get class() {
    return this.characterForm.get('class');
  }

  get race() {
    return this.characterForm.get('race');
  }

  get alignment() {
    return this.characterForm.get('alignment');
  }

  get primaryWeapon() {
    return this.characterForm.get('primaryWeapon');
  }

  get characterLevel() {
    return this.characterForm.get('characterLevel');
  }

  newCharacter: any = {
    name: '',
    class: '',
    race: '',
    alignment: '',
    primaryWeapon: '',
    characterLevel: 0
  };

  onSubmit(): void {
    this.newCharacter = this.characterForm.value;
  }

}


