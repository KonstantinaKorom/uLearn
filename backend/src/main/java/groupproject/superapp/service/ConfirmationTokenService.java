package groupproject.superapp.service;

import groupproject.superapp.model.ConfirmationToken;
import groupproject.superapp.repository.ConfirmationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

   private static ConfirmationTokenRepository confirmationTokenRepository;

    public static void saveConfirmationToken(ConfirmationToken confirmationToken) {

        confirmationTokenRepository.save(confirmationToken);
    }

    public static void deleteConfirmationToken(String id){

        confirmationTokenRepository.deleteById(id);
    }


}
