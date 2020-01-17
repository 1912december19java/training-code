import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComicCardComponent } from './comic-card/comic-card.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HeaderComponent } from './header/header.component';
import { ComicFormComponent } from './comic-form/comic-form.component';
import { LogoComponent } from './logo/logo.component';
import { FooterComponent } from './footer/footer.component';
import { AdColumnComponent } from './ad-column/ad-column.component';
import { ComicDeckComponent } from './comic-deck/comic-deck.component';
import { DeckPageComponent } from './deck-page/deck-page.component';
import { AddComicPageComponent } from './add-comic-page/add-comic-page.component';
import { AboutPageComponent } from './about-page/about-page.component';
import { EditComicPageComponent } from './edit-comic-page/edit-comic-page.component';

@NgModule({
  declarations: [
    AppComponent,
    ComicCardComponent,
    NavbarComponent,
    HeaderComponent,
    ComicFormComponent,
    LogoComponent,
    FooterComponent,
    AdColumnComponent,
    ComicDeckComponent,
    DeckPageComponent,
    AddComicPageComponent,
    AboutPageComponent,
    EditComicPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
