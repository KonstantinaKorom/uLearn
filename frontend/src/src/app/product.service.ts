import { Product } from './interface/product';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private baseUrl = 'http://localhost:8080/api/products';
  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<any> {
    return this.http.get<Product[]>(`${this.baseUrl}/product`);
  }

  getProductByName(name: string): Observable<any> {
    return this.http.get<Product[]>(`${this.baseUrl}/product/` + name);
  }

  getAllProductsByType(type: string): Observable<any> {
    return this.http.get<Product[]>(`${this.baseUrl}/product/` + type);
  }

  getProductsByPriceGreaterThan(price: number): Observable<any> {
    return this.http.get<Product[]>(`${this.baseUrl}/product/price` + price);

  }

}
