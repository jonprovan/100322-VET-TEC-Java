import { Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})

// we implement the OnInit interface just like we would in Java
// we must provide implementation for the ngOnInit() function in this class
// OnInit allows us to run code after the component is initialized

// we implement the OnChanges interface as well
// we must provide implemention for the ngOnChanges function
// OnChanges allows us to run code whenever one of the data members changes
export class CardComponent implements OnInit, OnChanges {

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


  // this method will execute AFTER the data-bound properties have been initialized
  ngOnInit() {
    console.log("Card Component Initialized!");
    // this function DOES have access to the component instance's data members
    console.log(this.card.sign);
    const section = document.getElementById('bg');
    section!.id = this.card.id;
    switch (this.card.element) {
      case 'Fire':
        section!.style.backgroundColor = 'red';
        break;
      case 'Earth':
        section!.style.backgroundColor = 'tan';
        break;
      case 'Air':
        section!.style.backgroundColor = 'lightgray';
        break;
      case 'Water':
        section!.style.backgroundColor = 'lightblue';
        break;  
    }
  }

  // this function will execute whenever one of the data members changes
  // EVEN IF the state for that member is maintained elsewhere
  ngOnChanges(changes: SimpleChanges): void {
    console.log('Inside ngOnChanges method...');
    console.log(changes);
  }


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
