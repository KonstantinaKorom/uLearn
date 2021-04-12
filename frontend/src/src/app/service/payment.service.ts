import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {
  
  url!: '';

  constructor(private http: HttpClient) { }

  
  makePayment(price: string) {
    return this.http.post<any>('http://localhost:8080/paypal/make/payment?price=' + price, {})
   // .map((response: Response) => response.json())
    
  }


  // tslint:disable-next-line: typedef
  completePayment(paymentId: string, payerId: string) {
    return this.http.post(this.url + 'paypal/complete/payment?paymentId=' + paymentId + '&payerId=' + payerId , {})
     // .map((response: Response) => response.json());
  }
}
