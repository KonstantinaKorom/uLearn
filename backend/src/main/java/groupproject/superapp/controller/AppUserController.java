package groupproject.superapp.controller;


import groupproject.superapp.model.AppUser;
import groupproject.superapp.model.ConfirmationToken;
import groupproject.superapp.repository.ConfirmationTokenRepository;
import groupproject.superapp.service.AppUserService;
import groupproject.superapp.service.ConfirmationTokenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Component
@AllArgsConstructor
@RestController
@RequestMapping(value = "api/users")
public class AppUserController {

    private final AppUserService userService;
    private final ConfirmationTokenService confirmationTokenService;
    private final ConfirmationTokenRepository confirmationTokenRepository;

//    @PostMapping("/register")
//    public ResponseEntity saveNewUser(@RequestBody AppUser appUser){
//        userService.saveAppUser(appUser);
//        return ResponseEntity.ok(appUser);
//    }


    @PostMapping("/register")
    String signUp(AppUser user) {

        userService.saveAppUser(user);

        return "redirect:/login";
    }

    @GetMapping("/confirm")
    String confirmMail(@RequestParam("token") String token) {

        Optional<ConfirmationToken> optionalConfirmationToken = confirmationTokenService.findById(token.);

        optionalConfirmationToken.ifPresent(userService::confirmUser);

        return "/login";
    }
}
