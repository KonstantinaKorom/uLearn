package groupproject.superapp.service;

import groupproject.superapp.model.AppProduct;
import groupproject.superapp.repository.AppProductRepo;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Service
public class AppProductServiceImpl implements AppProductService {

    private final AppProductRepo appProductRepo;

    @Override
    public AppProduct getAppProductByProductName(String name) {
        return appProductRepo.findAppProductByProductName(name);
    }

    @Override
    public List<AppProduct> getAllAppProducts() {
        return appProductRepo.findAll();
    }

    @Override
    public List<AppProduct> getAllProductsByProductType(String type) {
        return appProductRepo.findAppProductsByProductType(type);
    }

    @Override
    public List<AppProduct> getAppProductsByProductPriceIsGreaterThan(@NonNull BigDecimal price) {
        return appProductRepo.findAppProductsByProductPriceIsGreaterThan(price);
    }


}
