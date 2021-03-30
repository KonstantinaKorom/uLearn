package groupproject.superapp.service;

import groupproject.superapp.model.AppProduct;
import groupproject.superapp.model.AppUser;
import groupproject.superapp.model.AppUserProduct;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Date;
import java.util.List;

public interface AppUserProductService extends UserDetailsService {

     AppUserProduct saveOrder(AppUserProduct appUserProduct);

     void findOrdersByUserId(String id);

     void showCart();

     List<AppUserProduct> fetchOrdersByProductId(String id);

     List<AppProduct> fetchProductByNumberOfSales(int i);

    List<AppProduct> fetchProductByNumberOfSalesAsc();

    List<AppProduct> fetchProductByNumberOfSalesDesc();


     List<AppUserProduct> fetchOrdersByDate();
     //TODO check if I set a certain date or a period of date(from to)
    //TODO check if I need another method to find orders by year or month

    List<AppUser> fetchUsersByOrderNumberDesc();

    List<AppUser> fetchUsersByOrderNumberAsc();

    List<AppUser> fetchUsersByOrderNumber(int i);










}
