import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {
  http: any;
  url!: string;

  constructor() { }

  // tslint:disable-next-line: typedef
  makePayment(price: string) {
    return this.http.post(this.url + 'paypal/make/payment?sum=' + price, {})
      .map((response: Response) => response.json());
  }


  // tslint:disable-next-line: typedef
  completePayment(paymentId: string, payerId: string) {
    return this.http.post(this.url + 'paypal/complete/payment?paymentId=' + paymentId + '&payerId=' + payerId , {})
      .map((response: Response) => response.json());
  }
}
