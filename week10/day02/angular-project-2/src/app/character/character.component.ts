import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-character',
  templateUrl: './character.component.html',
  styleUrls: ['./character.component.css']
})
export class CharacterComponent {

  @Input() name: string = '';
  @Input() class: string = '';
  @Input() race: string = '';
  @Input() alignment: string = '';
  @Input() primaryWeapon: string = '';
  @Input() characterLevel: number = 0;
  

}
