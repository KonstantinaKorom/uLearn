package groupproject.superapp.service;

import groupproject.superapp.model.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService{
    AppUser findByEmail(String email);

    void saveUser(AppUser user);

    void updateUser(AppUser user);

    List<AppUser> findAllUsers();

    void deleteUser(AppUser user); //allazei to status se 0
}
