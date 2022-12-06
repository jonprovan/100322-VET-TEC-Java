import { Component } from '@angular/core';

@Component({
  selector: 'app-deck',
  templateUrl: './deck.component.html',
  styleUrls: ['./deck.component.css']
})
export class DeckComponent {

  deck: any = [
    {
      sign: 'Taurus',
      symbol: 'Bull',
      element: 'Earth'
    },
    {
      sign: 'Leo',
      symbol: 'Lion',
      element: 'Fire'
    },
    {
      sign: 'Aquarius',
      symbol: 'Water Bearer',
      element: 'Air'
    },
    {
      sign: 'Libra',
      symbol: 'Scales',
      element: 'Air'
    },
    {
      sign: 'Cancer',
      symbol: 'Crab',
      element: 'Water'
    },
    {
      sign: 'Virgo',
      symbol: 'Virgin',
      element: 'Earth'
    }
  ];

}
