import { User } from './user';
import { Product } from './product';
export interface Userproducts{

    products: Product[];
    purchasedate: Date;
    user: User; 
}