package groupproject.superapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppUserDto {

    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;


}
