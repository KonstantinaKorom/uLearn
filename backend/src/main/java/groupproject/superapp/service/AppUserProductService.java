package groupproject.superapp.service;

import groupproject.superapp.model.AppUserProduct;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface AppUserProductService extends UserDetailsService {

    //user methods
    //The commented methods with not happen at back end but at front end.
    //An order JSON object will be send and the save method of the controller will save it to the dabse
    //void appProductToCart(AddToCartDTO addToCartDTO, String userId);
    //CartCost listCartit(String userId);
    //AppUserProductDTO getDtoFromCart(AppUserProduct appUserProduct);
    //void showCart(AppUser appuser);

    List<AppUserProduct> getAllOrders();

    AppUserProduct saveOrder(AppUserProduct appUserProduct);

    //List<AppUserProduct> findAllByUserIdOrderCreateDateDes(String userId);

    //admin methods

    //List<AppUserProduct> fetchProductByProductId(String id);

    //List<AppProduct> fetchProductByNumberOfSalesAsc();

    //List<AppProduct> fetchProductByNUmberOfSalesDesc();

    //List<AppUserProduct> fetchOrdersByDate();
    //TODO check if i set a certain date or a period of a date (from to)
    //TODO check if i need another  method to find orders by year or month

    //List<AppUser> fetchUsersByOrderNumberDesc();

    //List<AppUser> fetchUsersByOrderNumberAsc();
}

