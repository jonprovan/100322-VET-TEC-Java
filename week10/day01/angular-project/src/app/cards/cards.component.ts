import { Component } from '@angular/core';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.css']
})
export class CardsComponent {

  
  pokemonList: any = [
    {
      name: 'Charizard',
      type: 'Fire',
      color: 'Burnt Umber'
    },
    {
      name: 'Mimikyu',
      type: 'Ghost',
      color: 'Blanched Almond'
    },
    {
      name: 'Arcanine',
      type: 'Fire',
      color: 'Orange, Cream & Black'
    },
    {
      name: 'Ampharos',
      type: 'Electric',
      color: 'Black & Yellow'
    }
  ];

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

  pokemonThree: any = {
    name: 'Arcanine',
    type: 'Fire',
    color: 'Orange, Cream & Black'
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
    this.pokemonThree.color = newColor;
  }

  addPokemon(name: string, type: string, color: string): void {
    this.pokemonList.push({ name: name, type: type, color: color});
  }

}
