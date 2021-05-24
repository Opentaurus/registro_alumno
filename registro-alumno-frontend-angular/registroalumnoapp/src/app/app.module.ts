import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutes } from './app.routing';
import { RouterModule } from '@angular/router';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppComponent } from './app.component';
import { MainComponent } from './@registroalumno/shared/main/main.component';
import { OtherComponent } from './@registroalumno/shared/other/other.component';
import { CommonModule } from "@angular/common";
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    OtherComponent,
  ],  
  exports: [
    CommonModule,        
    HttpClientModule
],
  imports: [        
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(AppRoutes, { useHash: true }),
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

