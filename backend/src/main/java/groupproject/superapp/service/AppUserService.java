package groupproject.superapp.service;


import groupproject.superapp.model.AppUser;
import org.springframework.stereotype.Service;

@Service
public interface AppUserService {

   void saveAppUser(AppUser appUser);

   AppUser getAppUserByUsername(String username);
}
