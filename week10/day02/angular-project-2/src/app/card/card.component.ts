import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent {

  // @ indicates a decorator
  @Input() card: any;

  // we want to create a button and a field inside each card
  // we want to use them to update a property on the card
  // in order to do this, we have to send data to the deck component
  // we're gonna need an Output, a variable, and a function

  // a new event that contains a string
  @Output() updateSignEvent = new EventEmitter<string>();
  @Output() updateSignViaIdEvent = new EventEmitter<any>();

  // a variable to hold the value of our input field
  newSign: string = '';
  newSignViaId: string = '';

  // a function to run when we click the button
  updateSign(): void {
    this.updateSignEvent.emit(this.newSign);
  }

  // a function to update the sign via its ID
  updateSignViaId(): void {
    // we feed in an array to the emitter
    // the array contains the new string value and the card's id
    this.updateSignViaIdEvent.emit([this.newSignViaId, this.card.id]);
  }

}
