package groupproject.superapp.repository;


import groupproject.superapp.model.AppUserProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserProductRepo extends JpaRepository<AppUserProduct,String> {

    /* @Query(value = " SELECT purchase_date,product_type,product_price,product_file_path"
            +" FROM app_user_product, app_product"
            +" WHERE app_user_product.app_product_id=app_product.id"
            +" AND  app_user_id='?'"
            +" ORDER BY  purchase_date DESC",nativeQuery=true)
    List<AppUserProduct> findAppUserProductByAppUser(String UserId);*/

    //List<AppProduct> fetchProductByNUmberOfSalesAsc();
    //List<AppProduct> fetchProductByNumberOfSalesDesc();
    //List<AppUserProduct> fetchOrdersByDate();
    //List<AppUser> fetchUsersByOrderNumberDesc();
    //List<AppUser> fetchUsersByOrderNumberAsc();
}
