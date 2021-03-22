package entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "app_product", schema = "superapp", catalog = "")
public class AppProduct {
    private String id;
    private String productName;
    private String productType;
    private String productDescription;
    private BigDecimal productPrice;
    private String productFilePath;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_type")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "product_description")
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Basic
    @Column(name = "product_price")
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "product_file_path")
    public String getProductFilePath() {
        return productFilePath;
    }

    public void setProductFilePath(String productFilePath) {
        this.productFilePath = productFilePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppProduct that = (AppProduct) o;
        return Objects.equals(id, that.id) && Objects.equals(productName, that.productName) && Objects.equals(productType, that.productType) && Objects.equals(productDescription, that.productDescription) && Objects.equals(productPrice, that.productPrice) && Objects.equals(productFilePath, that.productFilePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, productType, productDescription, productPrice, productFilePath);
    }
}
