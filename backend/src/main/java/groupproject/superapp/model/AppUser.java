package groupproject.superapp.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "app_user")
//@NamedQueries({
//        @NamedQuery(name = "AppUser.findAll", query = "SELECT u FROM AppUser u"),
//        @NamedQuery(name = "AppUser.findById", query = "SELECT u FROM AppUser u WHERE u.id = :id"),
//        @NamedQuery(name = "AppUser.findByUsername", query = "SELECT u FROM AppUser u WHERE u.username = :username")
//})
public class AppUser implements Serializable {

//    @GenericGenerator(
//            name = "UUID_gen",
//            strategy = "UUID")
//    @GeneratedValue(generator = "UUID_gen", strategy = GenerationType.AUTO)
//    private String id = UUID.randomUUID().toString();
//@Column(name = "id", nullable = false, columnDefinition = "VARCHAR(36)", insertable = false, updatable = false)
//@GeneratedValue(strategy = GenerationType.AUTO)
//@Type(type = "uuid-char")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    @Column(name = "id", unique = true)
    private String id;

    @NonNull
    @Column(name = "first_name")
    private String firstname;

    @NonNull
    @Column(name = "last_name")
    private String lastname;

    @NonNull
    @Column(name = "username")
    private String username;

    @NonNull
    @Column(name = "password")
    private String password;

    @Email
    @NonNull
    @Column(name = "email")
    private String email;

    @NonNull
    @Column(name = "status")
    private boolean status;

    @NonNull
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    @ManyToOne
    private AppRole role;


}
