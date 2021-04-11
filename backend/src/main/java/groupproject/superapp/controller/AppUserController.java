package groupproject.superapp.controller;


import groupproject.superapp.dto.AppUserDto;
import groupproject.superapp.mapper.UserMapper;
import groupproject.superapp.model.AppUser;
import groupproject.superapp.service.AppRoleService;
import groupproject.superapp.service.AppUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@Component
@AllArgsConstructor
@RestController
@RequestMapping(value = "api/users")
public class AppUserController {

    private final AppUserService userService;
    private final UserMapper userMapper;
    private final BCryptPasswordEncoder passwordEncoder;
    private final AppRoleService roleService;

    @PostMapping()
    public ResponseEntity saveNewUser(@RequestBody AppUserDto userDto) {
        log.info("get userDto: {}", userDto);
        AppUser appUser = userMapper.toEntity(userDto);
        appUser.setPassword(passwordEncoder.encode(userDto.getPassword()));
        appUser.setAppRole(roleService.getAppRoleByRoleName("USER"));
        userService.saveAppUser(appUser);
        log.info("saved User: {}", appUser);
        return ResponseEntity.ok(userDto);

    }
}
