package groupproject.superapp.service;


import groupproject.superapp.model.AppUserProduct;
import groupproject.superapp.repository.AppUserProductRepo;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class AppUserProductServiceImpl implements  AppUserProductService{

    private AppUserProductRepo appUserProductRepo;

    @Override
    public List<AppUserProduct> getAllOrders() {
        return this.appUserProductRepo.findAll();
    }

    @Override
    public AppUserProduct saveOrder(AppUserProduct appUserProduct) {
        appUserProduct.setPurchaseDate(Date.valueOf(LocalDate.now()));
        return this.appUserProductRepo.save(appUserProduct);
    }

//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        return null;
//    }
}

