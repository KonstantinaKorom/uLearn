import { PaymentService } from './../service/payment.service';
import {ProductService} from "../service/product.service";
import {Component, OnInit} from "@angular/core";
import {Product} from "../interfaces/product";
import {SelectItem} from "primeng/api";
import {PrimeNGConfig} from "primeng/api";
import { stringify } from '@angular/compiler/src/util';

@Component({
    selector: "app-products",
    templateUrl: "./products.component.html",
    styleUrls: ["./products.component.scss"],
})
export class ProductsComponent implements OnInit {

    products: Product[];

    sortOptions: SelectItem[];

    sortKey: string;

    sortField: string;
    
    sortOrder: number;

    constructor(
        private productService: ProductService,
        private primengConfig: PrimeNGConfig,
        private paymentService: PaymentService
    ) {
    }

    ngOnInit() {
        this.productService
            .getProducts()
            .subscribe(data => {
                this.products = data
            });

        this.sortOptions = [
            {label: "Price High to Low", value: "!price"},
            {label: "Price Low to High", value: "price"},
        ];

        this.primengConfig.ripple = true;
    }

    onSortChange(event) {
        let value = event.value;

        if (value.indexOf("!") === 0) {
            this.sortOrder = -1;
            this.sortField = value.substring(1, value.length);
        } else {
            this.sortOrder = 1;
            this.sortField = value;
        }
    }


    getProductsByType(productType){
        this.productService.getProductsByType(productType);
    }

    
    buy(product){
        this.paymentService.makePayment(product.productPrice).subscribe(
            res =>{
                window.location = res.href;
            }

        )
    }

}
