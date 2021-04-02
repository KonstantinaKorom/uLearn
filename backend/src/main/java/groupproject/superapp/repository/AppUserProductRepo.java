package groupproject.superapp.repository;

import groupproject.superapp.model.AppUserProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserProductRepo extends JpaRepository<AppUserProduct,String> {
    List<AppUserProduct> findAllByUserIdOrderCreateDateDesc(String appUserId);
}
