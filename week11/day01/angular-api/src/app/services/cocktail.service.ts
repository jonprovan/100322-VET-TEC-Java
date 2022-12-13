import { Injectable } from '@angular/core';
// need these two imports for HTTP requests
// Client is what allows us to make them
// Response is what allows us to handle what comes back
import { HttpClient, HttpResponse } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CocktailService {

  url: string = environment.apiURL;

  constructor(private httpClient: HttpClient) { }

  // function to get one random cocktail from the API
  // and load it into our cocktails variable
  // returns an Observable HTTPResponse
  getRandom(): Observable<HttpResponse<any>> {
    const randomURL = this.url + 'random.php';
    return this.httpClient.get<any>(randomURL, { observe: 'response'});
  }
}
