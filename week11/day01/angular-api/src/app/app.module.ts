import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
// for template-driven and reactive-forms to work
// FormsModule is for ngModel, ReactiveFormsModule for form groups
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { NavigationComponent } from './navigation/navigation.component';
import { MastheadComponent } from './masthead/masthead.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderAsideComponent } from './header-aside/header-aside.component';
import { RegisterComponent } from './register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    NavigationComponent,
    MastheadComponent,
    FooterComponent,
    HeaderAsideComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    // must add here to use elsewhere in our site
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
