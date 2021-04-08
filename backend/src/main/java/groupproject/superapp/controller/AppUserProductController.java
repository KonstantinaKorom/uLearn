package groupproject.superapp.controller;


import groupproject.superapp.model.AppUserProduct;
import groupproject.superapp.repository.AppUserProductRepo;
import groupproject.superapp.service.AppProductService;
import groupproject.superapp.service.AppUserProductService;
import groupproject.superapp.service.AppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@CrossOrigin(origins="http://localhost:4200")
//check what origin to add
@RestController
@RequestMapping("/order")
public class AppUserProductController {
    private AppUserProductRepo userProductRepo;
    private AppUserProductService userProductService;
    private AppProductService productService;
    private AppUserService userService;

    //save order
    @PostMapping("/save")
    public ResponseEntity<AppUserProduct> create(@RequestBody AppUserProduct appUserProduct){
        appUserProduct=userProductRepo.save(appUserProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(appUserProduct);
    }

    //Get orders by user id and descending date
    //@GetMapping("/orders/{userId}")
    //public List<AppUserProduct> getOrdersByUser(@PathVariable(value="userId") String userId){
    //  List<AppUserProduct> orders=userProductRepo.findAllByUserIdOrderCreateDateDesc(userId);
    //return orders;
    //}

    //get all orders
    @GetMapping("/orders" )
    public List<AppUserProduct> fetchOrdersByUser(){
        List<AppUserProduct> myOrders=new ArrayList<>();
        userProductService.getAllOrders();
        return myOrders;
    }
}