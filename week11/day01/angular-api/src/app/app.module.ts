import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
// for template-driven and reactive-forms to work
// FormsModule is for ngModel, ReactiveFormsModule for form groups
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
// we need this to make http GET requests to our API
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { NavigationComponent } from './navigation/navigation.component';
import { MastheadComponent } from './masthead/masthead.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderAsideComponent } from './header-aside/header-aside.component';
import { RegisterComponent } from './register/register.component';
import { CocktailsComponent } from './cocktails/cocktails.component';
import { DetailsComponent } from './details/details.component';
import { RequestsComponent } from './requests/requests.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    NavigationComponent,
    MastheadComponent,
    FooterComponent,
    HeaderAsideComponent,
    RegisterComponent,
    CocktailsComponent,
    DetailsComponent,
    RequestsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    // must add here to use elsewhere in our site
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
