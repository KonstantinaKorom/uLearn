package groupproject.superapp.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "app_user")
public class AppUser {


    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    @Column(name = "id", unique = true)
    private String id;

    @NonNull
    @Column(name = "first_name")
    private String firstName;

    @NonNull
    @Column(name = "last_name")
    private String lastName;

    @NonNull
    @Column(name = "username")
    private String username;

    @NonNull
    @Column(name = "password")
    private String password;

    
    @NonNull
    @Column(name = "email")
    private String email;

    @NonNull
    @Column(name = "status")
    private boolean status = false;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "role_id")
    private AppRole appRole;




}
