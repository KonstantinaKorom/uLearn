package groupproject.superapp.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "app_user_product")
public class AppUserProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(generator="UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "payment")
    private String payment;
    @Basic(optional = false)
    @Column(name = "purchase_date")
    @Temporal(TemporalType.DATE)
    //Temporal data can have DATE, TIME, or TIMESTAMP precision
    //Use the @Temporal annotation to fine tune that.
    private Date purchaseDate;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    //TODO check the right cascade type
    //TODO chech if I need to change fetch type
    @JoinColumn(name = "app_product_Id", referencedColumnName = "id")
    private List<AppProduct> appProduct;

    @ManyToOne(optional = false)
    //TODO check the right cascade type
    //TODO chech if I need to change fetch type
    @JoinColumn(name = "app_user_Id", referencedColumnName = "id")
    private AppUser appUser;

    public AppUserProduct() {
    }

    public AppUserProduct(String id) {
        this.id = id;
    }

    public AppUserProduct(String id, String payment, Date purchaseDate) {
        this.id = id;
        this.payment = payment;
        this.purchaseDate = purchaseDate;
    }

    public AppUserProduct(String id, String payment, Date purchaseDate, List<AppProduct> appProduct, AppUser appUser) {
        this.id = id;
        this.payment = payment;
        this.purchaseDate = purchaseDate;
        this.appProduct = appProduct;
        this.appUser = appUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public List<AppProduct> getAppProduct() {
        return appProduct;
    }

    public void setAppProduct(List<AppProduct> appProduct) {
        this.appProduct = appProduct;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AppUserProduct)) {
            return false;
        }
        AppUserProduct other = (AppUserProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Order ")
                .append("Id= ").append(id).append(",")
                .append("payment= ").append(payment).append(",")
                .append("Date= ").append(purchaseDate).append(",")
                .append("Product=").append(appProduct).append(",")
                .append("User=").append(appUser);

        return builder.toString();
    }
}
