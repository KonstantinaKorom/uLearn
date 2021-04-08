package groupproject.superapp.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
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
    // @Temporal(TemporalType.DATE)
    private Date purchaseDate;

    //@Column(name="app_product_id")
    //private String productId;

    //@Column(name="app_user_id")
    //private String userId;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinColumn(name = "app_product_Id", referencedColumnName = "id")
    private List<AppProduct> appProducts;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "app_user_Id", referencedColumnName = "id")
    private AppUser appUser;

}
