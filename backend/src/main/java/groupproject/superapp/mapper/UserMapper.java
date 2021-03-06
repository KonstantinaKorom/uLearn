package groupproject.superapp.mapper;


import groupproject.superapp.dto.AppUserDto;
import groupproject.superapp.model.AppUser;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface UserMapper extends GeneralMapper<AppUser, AppUserDto>{


}


