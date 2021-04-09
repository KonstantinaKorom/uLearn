package groupproject.superapp.service;

import groupproject.superapp.model.AppRole;
import groupproject.superapp.repository.AppRoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AppRoleServiceImpl implements AppRoleService{

    private final AppRoleRepository appRoleRepository;

    @Override
    public AppRole getAppRoleByRoleName(String roleName) {
        return appRoleRepository.findAppRoleByRoleName(roleName);
    }

}
