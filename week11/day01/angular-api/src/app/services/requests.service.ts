import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RequestsService {

  url: string = 'https://jsonplaceholder.typicode.com/posts';

  constructor(private httpClient: HttpClient) { }

  // four main types of HTTP request

  /**
   * CRUD = create, read, update, delete
   * 
   * POST (create)
   * GET (read)
   * PUT (update)
   * DELETE (delete)
   */

  // to get all records
  // same format as before
  getAll(): Observable<HttpResponse<any>> {
    return this.httpClient.get<any>(this.url, { observe: 'response' });
  }

  // to create a record
  // the post method takes three arguments -- url, object to post, what to observe
  create(object: any): Observable<HttpResponse<any>> {
    return this.httpClient.post<any>(this.url, object, { observe: 'response' });
  }

  // to update a record
  // the put method takes three arguments -- url (including the id), object to update, what to observe
  update(object: any): Observable<HttpResponse<any>> {
    return this.httpClient.put<any>(this.url + '/' + object.id, object, { observe: 'response' });
  }

  // to delete a record
  // the delete method takes two arguments -- url (including the id), what to observe
  delete(id: string): Observable<HttpResponse<any>> {
    return this.httpClient.delete<any>(this.url + '/' + 'abc', { observe: 'response' });
  }

}
