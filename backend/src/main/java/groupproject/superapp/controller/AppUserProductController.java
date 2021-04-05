//package groupproject.superapp.controller;
//
//import groupproject.superapp.model.AppProduct;
//import groupproject.superapp.model.AppUser;
//import groupproject.superapp.model.AppUserProduct;
//import groupproject.superapp.repository.AppUserProductRepo;
//import groupproject.superapp.service.AppProductService;
//import groupproject.superapp.service.AppUserProductService;
//import groupproject.superapp.service.UserService;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@CrossOrigin(origins="http://localhost:4200")
////check what origin to add
//@RestController
//@RequestMapping("/api/cart")
//public class AppUserProductController {
//    private AppUserProductRepo userProductRepo;
//    private AppUserProductService userProductService;
//    private AppProductService productService;
//    private UserService userService;
//
//    //add product to cart
//    @GetMapping("/shoppingcart/addproduct/{productId}")
//    public void addProductToCart(@PathVariable("productId") String productId){
//        //productService.findById(productId).ifPresent(userProductService::addProductToCart);
//    }
//
//    //remove product from cart
//    //@GetMapping("/shoppingcart/removeproduct/{productid}")
//    //public ModelAndView removeProductFromCart(@PathVariable("productId") String productId){
//        //producyService.findById(productId).ifPresent(userProductService::removeProductFromCart);
//        //return showCart();
//    //}
//
//    //show cart
//    @GetMapping("/mycart")
//    public ModelAndView showCart(){
//        List<AppProduct> cartProducts;
//        //A method to check if the cart is 0 not to complete the order
//        //If not possible in backend then front end with js
//        //I need to Authenticate the user
//        //AppUser appUser=userService.getCurrentlyLoggedInUser(authentication);
//        ModelAndView modelAndView=new ModelAndView(("/shoppingcart"));
//        //modelAndView.addObject("cartProducts",userProductService.getProductsInCart())
//        return modelAndView;
//    }
//
//    //save order
//    //@PostMapping("/completeOrder")
//    //if()
//        //public AppUserProduct createOrder(@RequestBody AppUserProduct userProduct){
//        //return userProductRepo.save(userProduct);
//        //}
//
//    //get all my orders by dateDesc
//    @GetMapping("/myorders")
//    public List<AppUserProduct> fetchOrdersByUser(String userId){
//        List<AppUserProduct> myOrders=new ArrayList<>();
//        userProductRepo.findAllByUserIdOrderCreateDateDesc(userId);
//        return myOrders;
//    }
//}
