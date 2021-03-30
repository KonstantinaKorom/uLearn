package groupproject.superapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppProductDto {

    private String id;
    private String productName;
    private String productType;
    private String productDescription;
    private String productPrice;
    private String productFilePath;
}
