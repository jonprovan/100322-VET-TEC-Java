import { Component } from '@angular/core';
import { CocktailService } from '../services/cocktail.service';

@Component({
  selector: 'app-cocktails',
  templateUrl: './cocktails.component.html',
  styleUrls: ['./cocktails.component.css']
})
export class CocktailsComponent {

  cocktails: any = [];

  firstLetterToSearch: string = '';
  stringToSearch: string = '';

  constructor(private cocktailService: CocktailService) {
    // here we subscribe to the return of a method
    this.cocktailService.getRandom().subscribe(data => {
      // seeing what's in the response
      console.log(data);
      // assigning the desired portion of the response to our local variable
      this.cocktails = data.body.drinks;
    })
  }

  // function to display a random cocktail
  displayRandom() {
    this.cocktailService.getRandom().subscribe(data => {
      console.log(data);
      this.cocktails = data.body.drinks;
    })
  }

  // function to display the results of our service's getByFirstLetter function
  searchByFirstLetter(): void {
    this.cocktailService.getByFirstLetter(this.firstLetterToSearch).subscribe(data => {
      console.log(data);

      if (data.status == 404)
        console.log('Unsuccessful request!')
      else
        this.cocktails = data.body.drinks;
    });
  }

  // function to display results of our service's getBySearchString function
  searchByString(): void {
    this.cocktailService.getBySearchString(this.stringToSearch).subscribe(data => {
      console.log(data);
      this.cocktails = data.body.drinks;
    });
  }

  // function to display results of our service's getByAlcoholic function
  searchByAlcoholic(alcoholic: boolean): void {
    this.cocktailService.getByAlcoholic(alcoholic).subscribe(data => {
      console.log(data);
      this.cocktails = data.body.drinks;
    });
  }
}
