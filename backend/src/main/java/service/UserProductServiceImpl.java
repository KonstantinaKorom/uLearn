package service;

import entities.AppUserProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.UserProductRepo;

import java.util.Date;


@Service
@Transactional
public class UserProductServiceImpl implements UserProductService {
    UserProductRepo userProductRepo;

    public AppUserProduct saveOrder() {
        return saveOrder();
    }

    public AppUserProduct saveOrder(AppUserProduct userProduct) {
        return null;
    }

    @Override
    public AppUserProduct findOrdersById(int orderId) {
        return null;
    }

    @Override
    public AppUserProduct findOrdersByUserId(int userId) {
        return null;
    }

    @Override
    public AppUserProduct findOrdersByProductId(int productId) {
        return null;
    }

    @Override
    public AppUserProduct findOrderByDate(Date date) {
        return null;
    }

    @Override
    public AppUserProduct findProductsBySalesAmount() {
        return null;
    }

    @Override
    public AppUserProduct findClientsBySalesAmmount() {
        return null;
    }

    @Override
    public AppUserProduct findClientsByTimesSold() {
        return null;
    }

    @Override
    public AppUserProduct findProductsByTimesSold() {
        return null;
    }

    @Override
    public AppUserProduct updateOrder(AppUserProduct userProduct) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
