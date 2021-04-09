package groupproject.superapp.controller;

import groupproject.superapp.dto.AppProductDto;
import groupproject.superapp.mapper.ProductMapper;
import groupproject.superapp.model.AppProduct;
import groupproject.superapp.service.AppProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Component
@AllArgsConstructor
@RestController
@RequestMapping(value = "api/products")
public class AppProductController {

    private final AppProductService productService;
    private final ProductMapper productMapper;

    @GetMapping("/{name}")
    public AppProductDto getProductByProductName(@PathVariable(value = "name") String productName) {
        AppProduct product = productService.getAppProductByProductName(productName);
        AppProductDto productDto = productMapper.toDto(product);
        return productDto;
    }

    @GetMapping("/products")
    public List<AppProductDto> getAllProducts() {
        List<AppProduct> products = productService.getAllAppProducts();
        List<AppProductDto> productsDto = productMapper.toDto(products);
        return productsDto;
    }

    @GetMapping("/products/{type}")
    public List<AppProductDto> getAllProductsByProductType(@PathVariable(value = "type") String product_type) {
        List<AppProduct> products = productService.getAllProductsByProductType(product_type);
        List<AppProductDto> productsDto = productMapper.toDto(products);
        return productsDto;
    }

    @GetMapping("product/price/{price}")
    public List<AppProductDto> getAppProductsByProductPriceIsGreaterThan(@PathVariable(value = "price") BigDecimal price) {
        List<AppProduct> products = productService.getAppProductsByProductPriceIsGreaterThan(price);
        List<AppProductDto> productsDto = productMapper.toDto(products);
        return productsDto;
    }


}
