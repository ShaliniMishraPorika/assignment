import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TemplateDrivenFormsComponent } from './template-driven-forms/template-driven-forms.component';
import { ReactiveDrivenFormsComponent } from './reactive-driven-forms/reactive-driven-forms.component';
import { HeaderComponent } from './header/header.component';


const routes: Routes = [

  
  {path: 'header',component:HeaderComponent},
  
  {path: 'template-driven-forms', component:TemplateDrivenFormsComponent},
  {path: 'reactive', component:ReactiveDrivenFormsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
