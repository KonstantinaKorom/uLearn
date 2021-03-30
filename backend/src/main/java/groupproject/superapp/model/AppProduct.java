package groupproject.superapp.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "app_product")
public class AppProduct {

    @Id
    @GeneratedValue(generator = "uuid", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ID")
    private String id;

    @NonNull
    @Column(name = "product_name")
    private String productName;

    @NonNull
    @Column(name = "product_type")
    private String productType;

    @NonNull
    @Column(name = "product_description")
    private String productDescription;

    @NonNull
    @Column(name = "product_price")
    private BigDecimal productPrice;

    @NonNull
    @Column(name = "product_file_path")
    private String productFilePath;
}
