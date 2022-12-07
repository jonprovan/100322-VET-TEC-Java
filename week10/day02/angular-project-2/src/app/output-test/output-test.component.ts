import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-output-test',
  templateUrl: './output-test.component.html',
  styleUrls: ['./output-test.component.css']
})
export class OutputTestComponent {

  // create an EventEmitter to send an event to the parent component
  // @Output() indicates that this is an event being sent out
  // variable name does NOT require type
  // because the EventEmitter object DOES require a type
  @Output() eventToSend = new EventEmitter<string>();
  // taking back in the updated value from the parent component
  @Input() sentString!: string;

  // this variable is bound to the value of our input field
  stringToSend: string = '';

  // function to send the event
  sendStringEvent(): void {
    // this uses our EventEmitter to emit an event object
    // with the value of stringToSend packed in
    this.eventToSend.emit(this.stringToSend);
  }

}
