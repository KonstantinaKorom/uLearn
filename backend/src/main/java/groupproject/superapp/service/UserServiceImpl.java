package groupproject.superapp.service;

import groupproject.superapp.model.AppUser;
import groupproject.superapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepo;


    @Override
    public AppUser findByEmail(String email) {

        return null;
    }

    @Override
    public void saveUser(AppUser user) {

    }

    @Override
    public void updateUser(AppUser user) {

    }

    @Override
    public List<AppUser> findAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(AppUser user) {

    }


}
