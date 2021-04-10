import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Product } from './product';
import {Injectable} from "@angular/core";


@Injectable()
export class ProductService {


    status: string[] = ['OUTOFSTOCK', 'INSTOCK', 'LOWSTOCK'];
    
    private environment = environment;

    
  constructor(private http: HttpClient) { }

  getProducts() {
      return this.http.get<Product[]>(this.environment.products);
  }

 
}
