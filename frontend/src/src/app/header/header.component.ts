import { Router } from '@angular/router';
import { Component } from '@angular/core';
import { AuthGuard } from '../auth.guard';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent {

  logButton = ''
 
  constructor(private authGuard: AuthGuard, private router: Router) {
    if (authGuard.isLoggedIn()) {
      this.logButton = "Logout";
    }
    else {
      this.logButton = "Login"
    }
  }

  log() {
    if (this.authGuard.isLoggedIn()) {

      localStorage.removeItem("isLoggedIn");
      window.location.href = "http://localhost:8080/logout";
      this.logButton = "Login";   
    } else {
      this.router.navigate(['./login']);
    }
  }



  // slashProducts(){
  //   if(this.authGuard.isLoggedIn() === false){

  //   }
  // }
  // prodButton(){
  //   false -> this.authGuard.isLoggedIn()
  // }
}
