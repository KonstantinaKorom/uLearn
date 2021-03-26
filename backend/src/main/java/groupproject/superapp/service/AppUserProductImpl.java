package groupproject.superapp.service;

import groupproject.superapp.model.AppProduct;
import groupproject.superapp.model.AppUser;
import groupproject.superapp.model.AppUserProduct;
import groupproject.superapp.repository.AppUserProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class AppUserProductImpl implements AppUserProductService {
    @Autowired
    AppUserProductRepo upRepo;

    @Override
    public AppUserProduct saveOrder(AppUserProduct appUserProduct) {
        appUserProduct.setPurchaseDate(LocalDate.now());
        return null;
    }


    @Override
    public void findOrdersByUserId(String id) {
        upRepo.findById(id);

    }

    @Override
    public void showCart() {

    }

    @Override
    public List<AppUserProduct> fetchOrdersByProductId(String id) {
        return null;
    }

    @Override
    public List<AppProduct> fetchProductByNumberOfSales(int i) {
        return null;
    }

    @Override
    public List<AppProduct> fetchProductByNumberOfSalesAsc() {
        return null;
    }

    @Override
    public List<AppProduct> fetchProductByNumberOfSalesDesc() {
        return null;
    }

    @Override
    public List<AppUserProduct> fetchOrdersByDate(Date date) {
        return null;
    }

    @Override
    public List<AppUser> fetchUsersByOrderNumberDesc() {
        return null;
    }

    @Override
    public List<AppUser> fetchUsersByOrderNumberAsc() {
        return null;
    }

    @Override
    public List<AppUser> fetchUsersByOrderNumber(int i) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
