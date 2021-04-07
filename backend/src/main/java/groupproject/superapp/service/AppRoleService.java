package groupproject.superapp.service;

import groupproject.superapp.model.AppRole;
import org.springframework.stereotype.Service;

@Service
public interface AppRoleService {

    AppRole getAppRoleByRoleName(String roleName);
}
