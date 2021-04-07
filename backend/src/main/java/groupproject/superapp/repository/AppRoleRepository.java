package groupproject.superapp.repository;

import groupproject.superapp.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, String> {

    AppRole findAppRoleByRoleName(String roleName);

}
