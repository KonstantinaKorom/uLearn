import { Component, OnInit } from '@angular/core';
import { Validators } from '@angular/forms';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../interfaces/user';
import { UserService } from '../service/user.service';

@Component({
  selector: "register-form",
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
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
  // tslint:disable-next-line: typedef
  get registerFormControls() {
    return this.registerForm.controls;
  }

  // tslint:disable-next-line: typedef
  onSubmit() {
    this.submitted = true;
    if (this.registerForm.invalid) {
      return;
    }
      this.loading = true;
      this.userService.create(this.registerForm.value).subscribe(
        (data) => {
          
          this.router.navigate(['/login']);
          console.log(this.registerForm.value);
        },
        (error) => {
          this.loading = false;
        }
      ) 
  }

  redirect() {
  this.router.navigate(['/login']);
  }
}
