package groupproject.superapp.service;

import groupproject.superapp.model.AppProduct;

import java.util.List;

public interface AppProductService {

    AppProduct getAppProductById(String id);

    List<AppProduct> getAllAppProducts();

    List<AppProduct> getAllAppProductsByUserId(String id);
}
