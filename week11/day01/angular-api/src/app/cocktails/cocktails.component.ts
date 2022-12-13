import { Component } from '@angular/core';
import { CocktailService } from '../services/cocktail.service';

@Component({
  selector: 'app-cocktails',
  templateUrl: './cocktails.component.html',
  styleUrls: ['./cocktails.component.css']
})
export class CocktailsComponent {

  cocktails: any = [];

  constructor(private cocktailService: CocktailService) {
    // here we subscribe to the return of a method
    this.cocktailService.getRandom().subscribe(data => {
      // seeing what's in the response
      console.log(data);
      // assigning the desired portion of the response to our local variable
      this.cocktails = data.body.drinks;
    })
  }

}
