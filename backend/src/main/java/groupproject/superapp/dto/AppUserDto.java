package groupproject.superapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import groupproject.superapp.model.AppRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppUserDto implements Serializable {

    private String id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String email;
//    private boolean status;
//    private AppRole role;

}
