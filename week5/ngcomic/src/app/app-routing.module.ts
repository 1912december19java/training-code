import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DeckPageComponent } from './deck-page/deck-page.component';
import { AddComicPageComponent } from './add-comic-page/add-comic-page.component';
import { EditComicPageComponent } from './edit-comic-page/edit-comic-page.component';
import { AboutPageComponent } from './about-page/about-page.component';


const routes: Routes = [
  {
    path : 'deck',
    component : DeckPageComponent,    
  },
  {
    path : 'add',
    component : AddComicPageComponent,
  },
  {
    path : 'edit',
    component : EditComicPageComponent,
  },
  {
    path : 'about',
    component : AboutPageComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
