package groupproject.superapp.repository;

import groupproject.superapp.model.AppProduct;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface AppProductRepo extends JpaRepository<AppProduct, String> {

    AppProduct findAppProductByProductName(String name);

    List<AppProduct> findAppProductsByProductPriceIsGreaterThan(@NonNull BigDecimal productPrice);

    List<AppProduct> findAppProductsByProductType(String type);

}
