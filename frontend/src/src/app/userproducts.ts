import { User } from './user';
import { Product } from './interface/product';
export interface Userproducts{

    products: Product[];
    purchasedate: Date;
    user: User; 
}