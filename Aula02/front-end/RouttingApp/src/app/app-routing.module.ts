import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ElementHomeComponent } from './elements/element-home/element-home.component';
import { CardComponent } from './elements/card/card.component';
import { NotFoundComponent } from './not-found/not-found.component';

const routes: Routes = [

  { path: 'home', component: ElementHomeComponent },
  { path: 'cards', component: CardComponent },
  { path: '',   redirectTo: '/home', pathMatch: 'full' }, // redirect to 
  { path: '**', component: NotFoundComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
