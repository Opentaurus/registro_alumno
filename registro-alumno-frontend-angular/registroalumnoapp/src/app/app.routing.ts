/************************************
 *** PASCUAL PEREZ ROMERO         ***
 *** pascual.perez@opentaurus.com ***
 ************************************/
 import { Routes } from '@angular/router';
 import { MainComponent } from './@registroalumno/shared/main/main.component';
 import { OtherComponent } from './@registroalumno/shared/other/other.component';

 export const AppRoutes: Routes = [
   {
     path: 'registroalumno',
     component: MainComponent,
     children: [
      {
        path: 'home',
      loadChildren: () => import('./@registroalumno/pages/home/home.module').then(m => m.HomeModule),
      },        
      {
        path: '',
        pathMatch: 'full',
        redirectTo: 'home'
      }
     ]
   },
   {
     path: 'registroalumno',
     component: OtherComponent,
     children: [
       {
        path: 'login',
        loadChildren: () => import('./@registroalumno/pages/login/login.module').then(m => m.LoginModule),       
       }
     ]
   },
   {
     path: '',
     pathMatch: 'full',
     redirectTo: 'registroalumno'
   }
 ];
 