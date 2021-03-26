package groupproject.superapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="app_user_product")
public class AppUserProduct implements Serializable {

    @Id
    @Basic(optional = false)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name="UUID",
            strategy="org.hibernate.id.UUIDGenerator"
    )
    @Column(name="id")
    private String id;

    @Basic(optional=false)
    @Column(name="payment")
    private String payment;

    @Basic(optional=false)
    @Column(name = "purchase_date")
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="dd/MM/yyyy")
    //Temporal data can have DATE,TIME, or TIMESTAMP precision
    //Use the @Temporal annotation to fine tune that
    private LocalDate purchaseDate;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    //TODO check the right cascade type
    //TODO check if I need to change fetch type
    @JoinColumn(name = "app_product_Id", referencedColumnName = "id")
    private AppProduct appProduct;

    @ManyToOne(optional = false)
    //TODO check the right cascade type
    //TODO check if I need to change fetch type
    @JoinColumn(name = "app_user_Id", referencedColumnName = "id")
    private AppUser appUser;

    /*
    @Transient
    pubic Double getTotalPrice(){
    return getAppProduct.*getQuantity();
    }

    @Transient
    public Double getTotalOrderPrice(){
    double sum=0D;
    List<AppUserProduct> orderProducts=getOrderProducts();
    for(AppUserProduct op:orderProducts){
    sum+=op.getTotalPrice();
    }return sum;
    }
     */


}
