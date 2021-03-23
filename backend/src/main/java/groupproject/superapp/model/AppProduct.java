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
@Table(name = "APP_PRODUCT")
public class AppProduct {

    @Id
    @GeneratedValue(generator = "uuid",strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ID")
    private String id;

    @NonNull
    @Column(name = "PRODUCT_NAME")
    private String productName;

    @NonNull
    @Column(name = "PRODUCT_TYPE")
    private String productType;

    @NonNull
    @Column(name = "PRODUCT_DESCRIPTION")
    private String productDescription;

    @NonNull
    @Column(name = "PRODUCT_PRICE")
    private BigDecimal productPrice;

    @NonNull
    @Column(name = "PRODUCT_FILE_PATH")
    private String productFilePath;
}
