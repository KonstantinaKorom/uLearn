import { AuthenticationService } from "./../authentication.service";
import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
  selector: "login-form",
  templateUrl: "login.component.html",
  styleUrls: ["./login.component.scss"],
})
export class LoginComponent implements OnInit {
  loginForm!: FormGroup;
  submitted = false;
  loginFailed = false;
hide = true;
  constructor(
    private authService: AuthenticationService,
    private formBuilder: FormBuilder,
    private router: Router
  ) {
  
  }

  ngOnInit(): void {
    this.loginForm = this.formBuilder.group({
      username: [null, Validators.required],
      password: [null, Validators.required],
    });
  }

  get formControl() {
    return this.loginForm.controls;
  }

  onLogin(): void {
    const formData = new FormData();
    formData.append("username", this.loginForm.value.username);
    formData.append("password", this.loginForm.value.password);
    this.submitted = true;
    if (this.loginForm.valid) {
      this.authService.login(formData).subscribe(
        (res) => {
         this.router.navigateByUrl("/home");
        },
        (error) => {
          this.loginFailed = true;
        }
      );
    }

    // this.authService.setLoggedIn(true); // HERE ******************************
  }

  redirect() {
    this.router.navigate(['./register']);
  }
}