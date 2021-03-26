package groupproject.superapp.controller;

import groupproject.superapp.model.AppProduct;
import groupproject.superapp.model.AppUserProduct;
import groupproject.superapp.repository.AppUserProductRepo;
import groupproject.superapp.service.AppUserProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/order")
public class AppUserProductController {
    @Autowired
    AppUserProductRepo userProductRepo;

    @Autowired
    AppUserProductService userProductService;

    //show cart
    @GetMapping("/mycart")
   public String showCart(
            //@RequestParam("userId") AppUser myuser,
            @RequestParam("productId") List<AppProduct> myProducts,
            @RequestParam("order_date") @DateTimeFormat(pattern = "dd/MM/yyyy")LocalDate purchaseDate,
            Model model
            ){
        //model.addAttribute("userId", myuser);
        model.addAttribute("productId", myProducts);
        model.addAttribute("order_date", purchaseDate);
        return "showcart";
    }

    //save order in dbase
    @PostMapping("/submitorder")
        public ResponseEntity<Object> createOrder(@RequestBody AppUserProduct userProduct){
        return null;
    }

    @GetMapping(produces={MediaType.APPLICATION_JSON_VALUE})
    public List<AppUserProduct> findAll(){
        return userProductRepo.findAll();
    }
}
