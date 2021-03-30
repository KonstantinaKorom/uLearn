package groupproject.superapp.service;

import groupproject.superapp.model.AppProduct;
import groupproject.superapp.repository.AppProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AppProductServiceImpl implements AppProductService{

    private final AppProductRepo appProductRepo;

    @Override
    public AppProduct getAppProductByProductName(String name) {
        return appProductRepo.findAppProductByProductName(name);
    }

    @Override
    public List<AppProduct> getAllAppProducts() {
       return appProductRepo.findAll();
    }

}
