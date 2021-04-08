package groupproject.superapp.service;

import groupproject.superapp.model.AppProduct;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface AppProductService {

    AppProduct getAppProductByProductName(String name);

    List<AppProduct> getAllAppProducts();

    List<AppProduct> getAllProductsByProductType(String type);

    List<AppProduct> getAppProductsByProductPriceIsGreaterThan(@NonNull BigDecimal productPrice);

}
