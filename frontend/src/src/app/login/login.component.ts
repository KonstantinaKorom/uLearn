import { AuthenticationService } from './../authentication.service';
import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { AlertService } from '../alert.service';


@Component({
    selector: 'login-form',
    templateUrl: 'login.component.html',
    styleUrls: ['./login.component.scss']
})

export class LoginComponent implements OnInit {
   loginForm!: FormGroup;
    submitted = false;
   
   constructor(
    private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router){}

    ngOnInit(): void {
      this.loginForm = this.formBuilder.group({
        username: [null, Validators.required],
        password: [null, Validators.required]
      })
    }

    get formControl() {
        return this.loginForm.controls;
      }

      onLogin(): void {
        // console.log(this.loginForm.value);
        this.submitted = true;
        if (this.loginForm.valid) {
          console.log(this.loginForm.value);
          localStorage.setItem("user-Data", JSON.stringify(this.loginForm.value));
          this.router.navigate(["/"]);
        }
      }
}