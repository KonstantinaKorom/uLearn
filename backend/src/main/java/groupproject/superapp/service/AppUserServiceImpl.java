package groupproject.superapp.service;


import groupproject.superapp.model.AppUser;
import groupproject.superapp.model.ConfirmationToken;
import groupproject.superapp.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository appUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final EmailSenderService emailSenderService;

    @Override
    public void saveAppUser(AppUser user) {

        final String encryptedPassword = bCryptPasswordEncoder.encode(user.getPassword());

        user.setPassword(encryptedPassword);

        final AppUser createdUser = appUserRepository.save(user);

        final ConfirmationToken confirmationToken = new ConfirmationToken(user);

        ConfirmationTokenService.saveConfirmationToken(confirmationToken);

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Optional<AppUser> optionalUser = appUserRepository.loadUserByUsername(username);

        if (optionalUser.isPresent()){
            return optionalUser.get();
        }
        else{
              throw new UsernameNotFoundException((MessageFormat.format("User with username {0} cannot be found.", username)));
        }
    }

    public void confirmUser(ConfirmationToken confirmationToken) {

        final AppUser user = confirmationToken.getUser();

        user.setEnabled(true);

        appUserRepository.save(user);

        ConfirmationTokenService.deleteConfirmationToken(confirmationToken.getId());

    }

    public void sendComfirmationMail(String userMail, String token){

        final SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(userMail);
        mailMessage.setSubject("Mail Confirmation Link!");
        mailMessage.setFrom("<MAIL>");
        mailMessage.setText(
                "Thank you for registering. Please click on the below link to activate your account." + "http://localhost:8080/sign-up/confirm?token="
                        + token);

        emailSenderService.sendEmail(mailMessage);
    }


    //    private final UserMapper userMapper;
//    private final UserRepo userRepo;

    //   private final PasswordEncoder passwordEncoder;
//
//    @Override
//    public AppUser findUserByEmail(String email) {
//        return userRepo.findAppUserByEmail(email);
//    }
//
//    @Override
//    public AppUser findAppUserByUsername(String username) {
//        return userRepo.findAppUserByUsername(username);
//    }
//
//    private final AppRoleRepo roleRepo;
//
////    @Override
////    public void createAccount(UserDto userDto) {
////
////    }
//
//
//    @Override
//    public void saveUser(AppUserDto appUserDto) {
//
//    }
//
//    @Override
//    public List<AppUser> findAllUsers() {
//        return userRepo.findAll();
//    }
//
//
//    @Override
//    public void deleteUser(String id) {
//        userRepo.findById(id).get().setStatus(false);
//    }


}
