import { Component } from '@angular/core';
import { RequestsService } from '../services/requests.service';

@Component({
  selector: 'app-requests',
  templateUrl: './requests.component.html',
  styleUrls: ['./requests.component.css']
})

export class RequestsComponent {

  // array to store our response
  responseBody: any = [];

  requestObject: any = {
    id: '',
    title: '',
    body: '',
    userId: ''
  }

  constructor(private requestsService: RequestsService) {
    this.requestsService.getAll().subscribe(data => {
      console.log(data.body);
      this.responseBody = data.body;
    })
  }

  // get -- returns an array of all records
  getAll(): void {
    this.requestsService.getAll().subscribe(data => {
      console.log(data);
      this.responseBody = data.body;
    })
  }

  // create -- returns the record we sent as it now exists on the DB
  create(): void {
    this.requestsService.create({ title: this.requestObject.title,
                                  body: this.requestObject.body,
                                  userId: this.requestObject.userId }).subscribe(data => {
      console.log(data);
      this.responseBody = [data.body];
    })
  }

  // update -- returns the record we sent as it now exists on the DB
  // the id sent in the update MUST be one that's in the database
  update(): void {
    this.requestsService.update(this.requestObject).subscribe(data => {
      console.log(data);
      this.responseBody = [data.body];
    })
  }

  // delete -- returns nothing for this API, but gives a successful status code
  delete(): void {
    this.requestsService.delete(this.requestObject.id).subscribe(data => {
      console.log(data);
      this.responseBody = [data.body];
    })
  }
  

}
