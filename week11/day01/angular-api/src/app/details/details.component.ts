import { Component } from '@angular/core';
import { CocktailService } from '../services/cocktail.service';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent {

  pipeString: string = 'aBcDeFgHiJk';
  // for the date pipe, the input format can vary
  pipeDate: string = '12/1/2022';

  rawCocktail: any = {};
  cocktail: any = {};

  constructor(private cocktailService: CocktailService) {
    this.cocktailService.getRandom().subscribe(data => {
      this.cocktail = data.body.drinks[0];
    })
  }

  // cleanCocktail(): void {
  //   for (let property in this.rawCocktail) {
  //     if (this.rawCocktail[property] != null)
  //       this.cocktail.property = this.rawCocktail[property];
  //   }
  // }

}
