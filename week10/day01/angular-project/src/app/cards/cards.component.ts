import { Component } from '@angular/core';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.css']
})
export class CardsComponent {

  // TypeScript wants you to declare variable types
  // do so with a colon after the variable name, then the type
  pokemonOneName: string = 'Charizard';
  pokemonOneType: string = 'Fire';
  pokemonOneColor: string = 'Burnt Umber';

  pokemonTwo: any = {
    name: 'Mimikyu',
    type: 'Ghost',
    color: 'Blanched Almond'
  }


  // same thing for functions
  // declare function name, tben a colon, then the return type
  myMethod(): string {
    console.log('I have a type now!');
    return '123';
  }

  // a function to change P1's name
  // we must type input parameters as well, in the same way
  changeName(newName: string): void {
    this.pokemonOneName = newName;
  }

  changeColor(newColor: string): void {
    this.pokemonTwo.color = newColor;
  }

}
