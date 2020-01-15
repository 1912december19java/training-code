import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MySecondComponentComponent } from './my-second-component/my-second-component.component';
import { CitylistComponent } from './citylist/citylist.component';

@NgModule({
  declarations: [
    AppComponent,
    MySecondComponentComponent,
    CitylistComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
