package groupproject.superapp.repository;

import groupproject.superapp.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);

    AppUser findAppUserById(String id);


}
