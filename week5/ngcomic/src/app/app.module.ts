import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap'

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
import { ComicCarouselComponent } from './comic-carousel/comic-carousel.component';

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
    EditComicPageComponent,
    ComicCarouselComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
