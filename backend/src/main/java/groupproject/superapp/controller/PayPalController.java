package groupproject.superapp.controller;



import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import groupproject.superapp.utils.PayPalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/paypal")
public class PayPalController {

    private final PayPalClient payPalClient;

    @Autowired
    PayPalController(PayPalClient payPalClient) {
        this.payPalClient = payPalClient;
    }

    @PostMapping(value = "/make/payment")
    public Map<String, Object> makePayment(@RequestParam("price") String price) {
        return payPalClient.createPayment(price);
    }

    @PostMapping(value = "/complete/payment")
    public Map<String, Object> completePayment(HttpServletRequest request) {
        return payPalClient.completePayment(request);
    }

}
