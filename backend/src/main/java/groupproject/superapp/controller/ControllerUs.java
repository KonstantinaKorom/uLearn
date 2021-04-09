//package groupproject.superapp.controller;

import groupproject.superapp.dto.AppUserDto;
import groupproject.superapp.mapper.UserMapper;
import groupproject.superapp.model.AppRole;
import groupproject.superapp.model.AppUser;
import groupproject.superapp.repository.AppUserRepository;
import groupproject.superapp.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

//import java.util.Optional;
//@CrossOrigin(origins = "http://localhost:4200")
//@RequiredArgsConstructor
//@RestController
//@RequestMapping("/user")
//public class ControllerUs {
//    private final AppUserService userService;
//
//
// private final AppUserRepository userRepo;
//
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<AppUser> getUser(@PathVariable(value = "id") String id){
//        Optional<AppUser> optionalUser = userRepo.findById(id);
//        if(!optionalUser.isPresent()){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//
//        AppUser user = optionalUser.get();
//        return new ResponseEntity(user, HttpStatus.OK);
//    }
//
//    private final UserMapper userMapper;
//    @GetMapping("/foo")
//    public ResponseEntity<AppUserDto> foo() {
//        Optional<AppUser> optionalUser = userRepo.findById("37e96629-8d13-11eb-8298-86fc5cd61d0e");
//        if (!optionalUser.isPresent()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//
//        AppUser user = optionalUser.get();
//        AppUserDto dto = userMapper.toDto(user);
//        dto.setEmail("gianadoumemalakia");
//        return new ResponseEntity(dto, HttpStatus.OK);

//        AppRole role = new AppRole();
//        role.setRoleName("useras");
//
//        AppUser user = new AppUser();
//        user.setFirstname("kakakaks");
//        user.setLastname("lal");
//        user.setUsername("kaka");
//        user.setPassword("kakaka");
//        user.setEmail("lalals");
//        user.setStatus(true);
//        user.setRole(role);
//
//
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println("USER " + user.toString());
//        //UserDto dto = UserMapper.MAPPER.convertToDto(user);
//
//        UserDto dto = userMapper.convertToDto(user);
//        System.out.println("DTO " + dto.toString());
//    }
//}






