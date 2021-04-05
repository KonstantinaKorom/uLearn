import { AlertService } from '../alert.service';
import { Component, OnInit } from "@angular/core";
import { Validators } from "@angular/forms";
import { FormBuilder, FormGroup } from "@angular/forms";
import { ActivatedRoute, Router } from "@angular/router";
import { User } from "../user";
import { UserService } from "../user.service";


@Component({
  selector: "register-form",
  templateUrl: "./register.component.html",
  styleUrls: ["./register.component.scss"],
})
export class RegisterComponent implements OnInit {
  user!: User;
  registerForm!: FormGroup;
  submitted = false;
  loading = false;

  constructor(
    private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserService,
    private alertService: AlertService
  ) {}

  ngOnInit(): void {
    this.registerForm = this.formBuilder.group({
      firstName: [null, Validators.required],
      lastName: [null, Validators.required],
      username: [null, Validators.required],
      password: [null, [Validators.required, Validators.minLength(8)]],
      email: [null, [Validators.required, Validators.email]],
    });
  }
  get registerFormControls() {
    return this.registerForm.controls;
  }

  // onSubmit() {
  //   this.submitted = true;
  //   this.loading = true;
  //   if (this.registerForm.valid) {
  //     this.userService.save(this.user).subscribe(
  //       data => {
  //         this.alertService.success('Registration successful', true);
  //         this.router.navigate(['/login']);
  //       },
  //       (error) => {
  //         this.alertService.error(error);
  //         this.loading = false;
  //       }
  //     );
  //   }
  // }

  
  register() {
    this.loading = true;
    this.userService.create(this.model)
        .subscribe(
            data => {
                // set success message and pass true paramater to persist the message after redirecting to the login page
                this.alertService.success('Registration successful', true);
                this.router.navigate(['/login']);
            },
            error => {
                this.alertService.error(error);
                this.loading = false;
            });
}
}

