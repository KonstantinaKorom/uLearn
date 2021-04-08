package groupproject.superapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import groupproject.superapp.model.AppUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppUserProductDto implements Serializable {
    private String id;
    private String payment;
    private Date purchaseDate;
    private List<AppProductDto> products;
    private AppUser appUser;

}
