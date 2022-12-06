import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeckComponent } from './deck/deck.component';
import { FormComponent } from './form/form.component';
import { HomeComponent } from './home/home.component';

// this variable contains an array of objects
// each object outlines a route
// each route dictates what is fed into the router outlet
const routes: Routes = [
  // a empty-string path will be what is loaded into your 
  // router outlet by default
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'form',
    component: FormComponent
  },
  {
    path: 'deck',
    component: DeckComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
