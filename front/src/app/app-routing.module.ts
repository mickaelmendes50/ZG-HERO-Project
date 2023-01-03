import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./home/home.component";
import {NivelGuiaComponent} from "./nivel-guia/nivel-guia.component";
import {NivelItemComponent} from "./nivel-item/nivel-item.component";

const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: "full"},
  {path:'home', component: HomeComponent},
  {path:'nivel-guia', component: NivelGuiaComponent},
  {path:'nivel-item', component:NivelItemComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
