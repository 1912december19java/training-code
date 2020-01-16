import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SqaureOneComponent } from './sqaure-one/sqaure-one.component';
import { SqaureTwoComponent } from './sqaure-two/sqaure-two.component';
import { BootstrapTesterComponent } from './bootstrap-tester/bootstrap-tester.component';
import { ChildExampleComponent } from './child-example/child-example.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SqaureOneComponent,
    SqaureTwoComponent,
    BootstrapTesterComponent,
    ChildExampleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
