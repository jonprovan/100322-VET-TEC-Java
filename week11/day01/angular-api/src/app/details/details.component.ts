import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CocktailService } from '../services/cocktail.service';
import { UserService } from '../services/user.service';

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

  // in our constructor, we load both the CocktailService and ActivatedRoute
  // ActivatedRoute allows us to access the parameters of the current browser route
  constructor(private cocktailService: CocktailService,
              private activatedRoute: ActivatedRoute,
              private userService: UserService) {
                
    // we subscribe to the CocktailService's getById function, using the id from the route
    this.cocktailService.getById(this.activatedRoute.snapshot.params['id']).subscribe(data => {
      console.log(data.body.drinks[0]);
      this.rawCocktail = data.body.drinks[0];
      this.cleanCocktail();
    })

    // this is using a value passed through the service

    // this.cocktailService.detailsCocktailObservable.subscribe(data => {
    //   this.rawCocktail = data;
    //   this.cleanCocktail();
    // })
  }

  cleanCocktail(): void {
    for (let property in this.rawCocktail) {
      if (this.rawCocktail[property])
        this.cocktail[property] = this.rawCocktail[property];
    }
  }

  // to add the detailed cocktail to our favorites
  addToFavorites(): void {
    this.userService.addToFavorites(this.rawCocktail);
  }

}
