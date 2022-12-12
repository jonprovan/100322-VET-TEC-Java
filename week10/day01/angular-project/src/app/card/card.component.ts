// to use @Input(), we need to import it
import { Component, Input } from '@angular/core';

// @Component is a decorator telling Angular to treat this class as a component
//  It provides configuration metadata that determines how the component should be processed, instantiated, and used at runtime.
@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})

export class CardComponent {

  // @Input is a
  // Decorator that marks a class field as an input property and supplies configuration metadata
  
  // this looks for an input property with the name pokemon
  // and allows the input value to become the value of the variable
  @Input() pokemon: any;

}
