import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { GoodbyeComponent } from './goodbye/goodbye.component';
import { GermanChocolateCakeComponent } from './german-chocolate-cake/german-chocolate-cake.component';

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    GoodbyeComponent,
    GermanChocolateCakeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
