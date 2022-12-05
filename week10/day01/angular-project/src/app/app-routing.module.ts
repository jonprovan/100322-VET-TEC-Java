import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CardsComponent } from './cards/cards.component';
import { HomeComponent } from './home/home.component';

// place components with paths in here to allow your app to send
// them to the router outlet
const routes: Routes = [
  // each path is an object with two properties
  // path: string name of path you want to use
  // component: name of the component you want to load
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'cards',
    component: CardsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
