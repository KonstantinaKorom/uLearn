package groupproject.superapp.service;

import groupproject.superapp.dto.UserDto;
import groupproject.superapp.mapper.UserMapper;
import groupproject.superapp.model.AppRole;
import groupproject.superapp.model.AppUser;
import groupproject.superapp.repository.AppRoleRepo;
import groupproject.superapp.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional

public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepo userRepo;
 //   private final PasswordEncoder passwordEncoder;

    @Override
    public AppUser findUserByEmail(String email) {
        return userRepo.findAppUserByEmail(email);
    }

    @Override
    public AppUser findAppUserByUsername(String username) {
        return userRepo.findAppUserByUsername(username);
    }
private final AppRoleRepo roleRepo;
    @Override
    public void createAccount(UserDto userDto) {
//        String hashedPassword = passwordEncoder.encode(userDto.getPassword());
//        AppUser user = userMapper.convertToEntity(userDto);
//        user.setPassword(hashedPassword);
//        user.setStatus(true);
//
//        user.setRole(roleRepo.findById("1").get());

    }


    @Override
    public void updateUser(AppUser user) {

    }

    @Override
    public List<AppUser> findAllUsers() {
        return userRepo.findAll();
    }


    @Override
    public void deleteUser(String id) {
        userRepo.findById(id).get().setStatus(false);
    }



}
