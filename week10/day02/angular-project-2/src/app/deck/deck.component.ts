import { Component } from '@angular/core';
import { Card } from '../models/card';

@Component({
  selector: 'app-deck',
  templateUrl: './deck.component.html',
  styleUrls: ['./deck.component.css']
})
export class DeckComponent {

  // creating three variables to store our form inputs and giving them starting values
  sign: string = '';
  symbol: string = '';
  element: string = '';

  stringToDisplay: string = '';

  // creating a deck of sign cards to start with
  deck: any = [
    {
      sign: 'Taurus',
      symbol: 'Bull',
      element: 'Earth'
    },
    {
      sign: 'Leo',
      symbol: 'Lion',
      element: 'Fire'
    },
    {
      sign: 'Aquarius',
      symbol: 'Water Bearer',
      element: 'Air'
    },
    {
      sign: 'Libra',
      symbol: 'Scales',
      element: 'Air'
    },
    {
      sign: 'Cancer',
      symbol: 'Crab',
      element: 'Water'
    },
    {
      sign: 'Virgo',
      symbol: 'Virgin',
      element: 'Earth'
    }
  ];

  // function to add a sign to the list of cards
  addSign(): void {
    // adds the card to the deck array using the variable values from the .ts file
    this.deck.push(
        {
          sign: this.sign,  // each one calls its corresponding variable
          symbol: this.symbol,
          element: this.element
        }
    );
  }

  addSignUsingModel(): void {
    // inside a function, so must use let/const
    // type of the variable is the model itself -- Card
    // then the new keyword and the constructor
    const newSign: Card = new Card(this.sign,
                                   this.symbol, 
                                   this.element);
    // then we just add the new object
    this.deck.push(newSign);
  }

  // create a function that executes when the event we're
  // listening for fires
  updateString(newString: string): void {
    this.stringToDisplay = newString;
  }

}
