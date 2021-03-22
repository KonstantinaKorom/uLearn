package service;

import entities.AppUserProduct;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Date;

public interface UserProductService extends UserDetailsService {

    AppUserProduct saveOrder(AppUserProduct userProduct);

    AppUserProduct findOrdersById(int orderId);

    AppUserProduct findOrdersByUserId(int userId);

    AppUserProduct findOrdersByProductId(int productId);

    AppUserProduct findOrderByDate(Date date);

    AppUserProduct findClientsByTimesSold();

    AppUserProduct findProductsByTimesSold();


}
