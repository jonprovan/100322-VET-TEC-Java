import { Injectable } from '@angular/core';
import { Product } from '../models/product';
import { PRODUCTS } from '../mock-data/PRODUCTS';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { environment } from 'src/environments/environment'

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  // base url from environment.ts
  url: string = environment.apiURL;

  constructor(private httpClient: HttpClient) { }

  // Get products
  getProducts(): Observable<Product[]> {
    const url = this.url + "/products";
    console.log(url);
    return this.httpClient.get<Product[]>(url);
  }

  // Mock data implementation of service
  // getProducts(): Observable<Product[]> {
  //   const products = of(PRODUCTS); 
  //   return products;
  // }
}
