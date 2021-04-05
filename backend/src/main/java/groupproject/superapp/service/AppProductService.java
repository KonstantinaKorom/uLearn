package groupproject.superapp.service;

import groupproject.superapp.model.AppProduct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppProductService {

    AppProduct getAppProductByProductName(String name);

    List<AppProduct> getAllAppProducts();

}
