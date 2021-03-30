package groupproject.superapp.service;

import groupproject.superapp.model.AppProduct;

import java.util.List;

public interface AppProductService {

    AppProduct getAppProductByProductName(String name);

    List<AppProduct> getAllAppProducts();

}
