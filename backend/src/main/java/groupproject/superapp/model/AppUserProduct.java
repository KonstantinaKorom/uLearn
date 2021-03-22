package groupproject.superapp.model;

import entities.AppProduct;
import entities.AppUser;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "app_user_product", schema = "superapp")
public class AppUserProduct implements Serializable {
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment")
    private String payment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "purchase_date")
    @Temporal(TemporalType.DATE)
    private Date purchaseDate;
    @JoinColumn(name = "app_product_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AppProduct appProductId;
    @JoinColumn(name = "app_user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AppUser appUserId;


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

    public AppProduct getAppProductId() {
        return appProductId;
    }

    public void setAppProductId(AppProduct appProductId) {
        this.appProductId = appProductId;
    }

    public AppUser getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(AppUser appUserId) {
        this.appUserId = appUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUserProduct that = (AppUserProduct) o;
        return Objects.equals(id, that.id) && Objects.equals(payment, that.payment) && Objects.equals(purchaseDate, that.purchaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, payment, purchaseDate);
    }
}
