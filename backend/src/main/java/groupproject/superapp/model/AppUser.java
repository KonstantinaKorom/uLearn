package groupproject.superapp.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "app_user")
public class AppUser implements UserDetails {


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

    
    @NonNull
    @Column(name = "email")
    private String email;

    @NonNull
    @Column(name = "status")
    private boolean status = false;

    @NonNull
    @Builder.Default
    private AppRole role = AppRole.USER;

    @Builder.Default
    private Boolean locked = false;

    @Builder.Default
    private Boolean enabled = false;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        final SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(role.name());
        return Collections.singletonList(simpleGrantedAuthority);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
