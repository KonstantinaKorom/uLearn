package groupproject.superapp.repository;

import groupproject.superapp.model.AppUserProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserProductRepo extends JpaRepository<AppUserProduct, Integer> {




    List<AppUserProduct> findOrderByUserId();
}
