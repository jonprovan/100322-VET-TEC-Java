import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-name-card',
  templateUrl: './name-card.component.html',
  styleUrls: ['./name-card.component.css']
})
export class NameCardComponent {

  @Input() name: string = '';
  @Input() location: string = '';

  @Output() teamChangeEvent = new EventEmitter<string>();

  changeTeam(destination: string): void {
    this.teamChangeEvent.emit(destination);
  }

}
