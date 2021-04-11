import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { User } from '../interfaces/user';



@Injectable()
export class AuthenticationService {
    private currentUserSubject: BehaviorSubject<User>;
    public currentUser: Observable<User>;
    users: User[];
    
    constructor(private http: HttpClient) { 
        this.currentUserSubject = new BehaviorSubject<User>(JSON.parse(localStorage.getItem('currentUser')));
    this.currentUser = this.currentUserSubject.asObservable();
  }

  public get currentUserValue(): User {
    return this.currentUserSubject.value;
  }
    

    login(formData: FormData) {
        let HTTPOptions:Object = {

            headers: new HttpHeaders({
               
            }),
            responseType: 'text/html'
         }
        return this.http.post<any>('http://localhost:8080/login', formData, HTTPOptions) ;
    }

    logout() :void {    
        localStorage.setItem('isLoggedIn','false');    
        localStorage.removeItem('token');    
        } 
}