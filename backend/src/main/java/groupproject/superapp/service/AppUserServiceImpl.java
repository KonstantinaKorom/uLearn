package groupproject.superapp.service;


import groupproject.superapp.model.AppUser;
import groupproject.superapp.repository.AppUserRepository;
import lombok.AllArgsConstructor;



import org.springframework.stereotype.Service;



@AllArgsConstructor
@Service
public class AppUserServiceImpl implements AppUserService {

    private final AppUserRepository appUserRepository;


    @Override
    public void saveAppUser(AppUser user) {
        appUserRepository.save(user);
    }

    @Override
    public AppUser getAppUserByUsername(String username){
        return appUserRepository.findAppUserByUsername(username);
    }



}
