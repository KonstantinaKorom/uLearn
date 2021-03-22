package groupproject.superapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

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

//    @GenericGenerator(
//            name = "UUID_gen",
//            strategy = "UUID")
//    @GeneratedValue(generator = "UUID_gen", strategy = GenerationType.AUTO)
//    private String id = UUID.randomUUID().toString();

    @javax.persistence.Id
    @Id
    @Column(name = "id", nullable = false, columnDefinition = "VARCHAR(36)", insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "uuid-char")
    private String userAppId;

    @NotEmpty
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty
    @Column(name = "last_name")
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
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;





}
