package groupproject.superapp.repository;

import groupproject.superapp.model.AppProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppProductRepo extends JpaRepository<AppProduct, String> {

}
