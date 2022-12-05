// to use @Input(), we need to import it
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})

export class CardComponent {

  // this looks for an input property with the name pokemon
  // and allows the input value to become the value of the variable
  @Input() pokemon: any;

}
