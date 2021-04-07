import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';



@Injectable()
export class AuthenticationService {
    constructor(private http: HttpClient) { }

    login(formData: FormData) {
        let HTTPOptions:Object = {

            headers: new HttpHeaders({
               
            }),
            responseType: 'text/html'
         }
        return this.http.post<any>('http://localhost:8080/login', formData, HTTPOptions) ;
    }

    logout() {
        // remove user from local storage to log user out
        localStorage.removeItem('currentUser');
    }
}