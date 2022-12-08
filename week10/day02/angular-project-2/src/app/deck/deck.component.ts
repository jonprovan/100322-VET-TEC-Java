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
      id: 1,
      sign: 'Taurus',
      symbol: 'Bull',
      element: 'Earth'
    },
    {
      id: 2,
      sign: 'Leo',
      symbol: 'Lion',
      element: 'Fire'
    },
    {
      id: 3,
      sign: 'Aquarius',
      symbol: 'Water Bearer',
      element: 'Air'
    },
    {
      id: 4,
      sign: 'Libra',
      symbol: 'Scales',
      element: 'Air'
    },
    {
      id: 5,
      sign: 'Cancer',
      symbol: 'Crab',
      element: 'Water'
    },
    {
      id: 6,
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
          id: this.deck.length + 1,
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
    const newSign: Card = new Card(this.deck.length + 1,
                                   this.sign,
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

  // a function for updating a card 
  // when the user clicks the button in the card
  updateSign(newSign: string, index: number) {
    this.deck[index].sign = newSign;
  }

  // updating the card via ID
  updateSignViaId(newSign: any): void {
    // look through each card in our current deck
    for (let card of this.deck) {
      // if the card's id matches the emitted id
      if (card.id === newSign[1])
        // assign the new value for sign to the card's sign
        card.sign = newSign[0];
    }
  }

  cardNumber: number = 0;
  newSymbol: string = '';

  // function to change a card's symbol, finding it by id
  changeSymbol() {
    for (let card of this.deck) {
      if (card.id === this.cardNumber)
        card.symbol = this.newSymbol;
    }
  }

}
