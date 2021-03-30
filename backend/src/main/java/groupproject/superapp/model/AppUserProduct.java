package groupproject.superapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="app_user_product")
public class AppUserProduct implements Serializable {

    @Id
    @NotNull
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name="UUID",
            strategy="org.hibernate.id.UUIDGenerator"
    )
    @Column(name="id")
    private String id;

    @NotNull
    @Column(name="payment")
    private String payment;

    @NotNull
    @Column(name = "purchase_date")
    //@Temporal(TemporalType.DATE)
    //@JsonFormat(pattern="dd/MM/yyyy")
    //@JsonFormat is not global, only for this class. Have to chack with the team to add a global formatter
    //Temporal data can have DATE,TIME, or TIMESTAMP precision
    //Use the @Temporal annotation to fine tune that
    private LocalDate purchaseDate;

    @ManyToMany( cascade = CascadeType.ALL)
    //TODO check the right cascade type
    //TODO check if I need to change fetch type
    @JoinColumn(name = "app_product_Id", referencedColumnName = "id")
    private List<AppProduct> appProducts;

    @ManyToOne
    //TODO check the right cascade type
    //TODO check if I need to change fetch type
    @JoinColumn(name = "app_user_Id", referencedColumnName = "id")
    private AppUser appUser;

    //TODO
    //@Transient methods that will return a total amount for that order
    // and the number of products in it.
    // Both represent calculated data, so there is no need to store it in the database.
    /*@Transient
    public List<AppProduct> getProduct(){
        return this.appProducts;
    }

    @Transient
    public Double getTotalPrice(){
        return appProducts.productPrice() *  appProducts.size();
    }

    @Transient
    public Double getTotalOrderPrice(){
    double sum=0D;
    List<AppProduct> orderProducts=getAppProducts();
    for(AppProduct op:orderProducts){
    sum+=op.getTotalPrice();
    }return sum;
    }
    @Transient
    public int getNumberOfProducts(){
        return this.appProducts.size();
    }

    @Transient
    public Double getTotalPrice(){
        return getAppProduct.* getQuantity();
    }*/


}
