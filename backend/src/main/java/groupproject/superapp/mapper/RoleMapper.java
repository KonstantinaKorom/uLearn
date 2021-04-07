package groupproject.superapp.mapper;

import groupproject.superapp.dto.AppRoleDto;
import groupproject.superapp.model.AppRole;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface RoleMapper extends GeneralMapper<AppRole, AppRoleDto>{
}
