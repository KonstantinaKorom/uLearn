import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { ReactiveFormsModule } from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';


import { UserService } from './service/user.service';
import { AlertService } from './service/alert.service';

import { AlertComponent } from './alert/alert.component';
import { LoginComponent } from './login/login.component';
// import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './register/register.component';
import { ProductsComponent } from './products/products.component';
import {PasswordModule} from 'primeng/password';
import { HeaderComponent } from './header/header.component';
@NgModule({
  declarations: [AppComponent,  RegisterComponent,
     AlertComponent,
    LoginComponent,
    //  HomeComponent,
     ProductsComponent,
    HeaderComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule, PasswordModule
  ],
  providers: [UserService, AlertService],
  bootstrap: [AppComponent],
})
export class AppModule {}
