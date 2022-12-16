import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CocktailsComponent } from './cocktails/cocktails.component';
import { DetailsComponent } from './details/details.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RequestsComponent } from './requests/requests.component';

const routes: Routes = [
  {
    path: '',
    component: LoginComponent
  },
  {
    path: 'register',
    component: RegisterComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'cocktails',
    component: CocktailsComponent
  },
  {
    path: 'details',
    component: DetailsComponent
  },
  
  // this allows us to include a parameter in the route itself
  // this parameter can be accessed by the receiving component
  // the colon indicates that the following string is a parameter
  {
    path: 'details/:id',
    component: DetailsComponent
  },
  {
    path: 'requests',
    component: RequestsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
