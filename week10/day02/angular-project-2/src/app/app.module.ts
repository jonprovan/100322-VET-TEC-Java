import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { NavComponent } from './nav/nav.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { FormComponent } from './form/form.component';
import { DeckComponent } from './deck/deck.component';
import { CardComponent } from './card/card.component';
import { OutputTestComponent } from './output-test/output-test.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { CharacterComponent } from './character/character.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NavComponent,
    FooterComponent,
    HomeComponent,
    FormComponent,
    DeckComponent,
    CardComponent,
    OutputTestComponent,
    ReactiveFormComponent,
    CharacterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
