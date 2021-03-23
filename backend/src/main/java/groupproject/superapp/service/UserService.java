package groupproject.superapp.service;

import groupproject.superapp.model.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {
    AppUser findByEmail(String email);

    void saveUser(AppUser user);

    void updateUser(AppUser user);

    List<AppUser> findAllUsers();

}
