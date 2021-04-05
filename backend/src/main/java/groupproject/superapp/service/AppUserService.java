package groupproject.superapp.service;


import groupproject.superapp.model.AppUser;
import groupproject.superapp.model.ConfirmationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface AppUserService extends UserDetailsService {


    //    AppUser findUserByEmail(String email);
//
//    //void createAccount(UserDto userDto) ;
//
//    AppUser findAppUserByUsername(String username);
//
   void saveAppUser(AppUser appUser);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    void confirmUser(ConfirmationToken confirmationToken);

    void sendComfirmationMail(String userMail, String token);

//
//    List<AppUser> findAllUsers();
//
//    void deleteUser(String id); //allazei to status se false
}
