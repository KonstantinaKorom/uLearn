package groupproject.superapp.controller;

import groupproject.superapp.model.AppUserProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import groupproject.superapp.repository.UserProductRepo;
import groupproject.superapp.service.UserProductService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order")
public class UserProduct {

    @Autowired
    UserProductService userProductService;
    @Autowired
    UserProductRepo userProductRepo;


    @GetMapping("/showcart")
    public String showOrderPage(){

        return "mycart";
    }

    @PostMapping("/saveOrder")
    public String saveOrder(){

        return "redirect:/showcart";
    }

    @GetMapping("/showmyorders/{appUserId}")
    public List<AppUserProduct>  showOrders(int userId){
        List<AppUserProduct> orders= userProductRepo.findOrderByUserId();
     return orders;
    }
}
