package groupproject.superapp.repository;

import groupproject.superapp.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<AppUser, String> {
    @Query("SELECT u FROM AppUser u WHERE u.username = :username")
    AppUser findAppUserByUsername(String username);

    @Query("SELECT u FROM AppUser u WHERE u.email = :email")
    AppUser findAppUserByEmail(String email);


}
