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
       /*El home*/
     ]
   },
   {
     path: 'registroalumno',
     component: OtherComponent,
     children: [
       {
        /*El login*/  
       }
     ]
   },
   {
     path: '',
     pathMatch: 'full',
     redirectTo: 'registroalumno'
   }
 ];
 