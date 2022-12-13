import { Component } from '@angular/core';
import { CocktailService } from '../services/cocktail.service';

@Component({
  selector: 'app-cocktails',
  templateUrl: './cocktails.component.html',
  styleUrls: ['./cocktails.component.css']
})
export class CocktailsComponent {

  cocktails: any = {};

  constructor(private cocktailService: CocktailService) {
    this.cocktails = this.cocktailService.cocktails;
  }

}
