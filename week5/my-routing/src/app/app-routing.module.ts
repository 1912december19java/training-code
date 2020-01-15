import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppleComponent } from './apple/apple.component';
import { CarrotComponent } from './carrot/carrot.component';
import { PineappleComponent } from './pineapple/pineapple.component';

//routes is what we modify in this file.  It is an array
// of Route objects.  Each object has, at minimum a 'path'
// and a 'component'.  When your user navigates to the path
// provided, the component associated with that path
// will be displayed in a router-outlet.
const routes: Routes = [
  {
    path: "apple",
    component: AppleComponent,
  },
  {
    path: "carrot",
    component: CarrotComponent,
  },
  {
    path: "pineapple",
    component: PineappleComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
