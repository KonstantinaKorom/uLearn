package groupproject.superapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "app_user")
@NamedQueries({
        @NamedQuery(name = "AppUser.findAll", query = "SELECT u FROM AppUser u"),
        @NamedQuery(name = "AppUser.findById", query = "SELECT u FROM AppUser u WHERE u.id = :id"),
        @NamedQuery(name = "AppUser.findByUsername", query = "SELECT u FROM AppUser u WHERE u.username = :username")
})
public class AppUser implements Serializable {

    @Id
    @Column(name = "id", nullable = false, unique = true)  //unique is not required
    @GenericGenerator(
            name = "UUID_gen",
            strategy = "UUID")
    @GeneratedValue(generator = "UUID_gen", strategy = GenerationType.IDENTITY)
    private String id = UUID.randomUUID().toString();

    @NotEmpty
    @Column(name = "firstname")
    private String firstName;

    @NotEmpty
    @Column(name = "lastname")
    private String lastName;

    @NotEmpty
    @Column(name = "username")
    private String username;

    @NotEmpty
    @Column(name = "password")
    private String password;

    @NotEmpty
    @Column(name = "email")
    private String email;

    @NotEmpty
    @Column(name = "status")
    private long status;

    @NotEmpty
    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;


}
