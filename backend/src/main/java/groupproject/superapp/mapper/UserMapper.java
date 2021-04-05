package groupproject.superapp.mapper;


import groupproject.superapp.dto.AppUserDto;
import groupproject.superapp.model.AppUser;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface UserMapper extends GeneralMapper<AppUser, AppUserDto>{


//@Mapping(target = "status", ignore = true)
//@Mapping(target = "role", ignore = true)
//    UserDto convertToDto(AppUser user);
//
//
//    AppUser convertToEntity(UserDto userDto);
}



//@Mapper(componentModel = "spring")
//public abstract class UserMapper {
//
//        @Mapping(target = "fullname", qualifiedByName = "fullNameByFirstAndLastName")
//
//
//    public abstract UserDto convertToDto(AppUser user);
//
//    @InheritConfiguration(name = "convertToDto")
//   public abstract AppUser convertToModel(UserDto userDto);
//
//    @Named("fullNameByFirstAndLastName")
//    String fullNameByFirstAndLastName(AppUser user) {
//            return user.getFirstName() + ' ' + user.getLastName();
//    }
//
//}


//ModelMapper
//@Component
//public class AppUserConverter {


//    private ModelMapper modelMapper;
//
//    public AppUserDto convertToDto(AppUser user) {
//        AppUserDto userDto = modelMapper.map(user, AppUserDto.class);
//        return userDto;
//  }
//
//    public AppUser convertToEntity(AppUserDto userDto){
//        AppUser user = modelMapper.map(userDto, AppUser.class);
//        return user;
//    }

//    public AppUser convertToEntity(AppUser user) {
//
//        return AppUserDto.builder().
//                id(user.getId())
//                .firstname(user.getFirstName())
//                .lastname(user.getLastName())
//                .username(user.getUsername())
//                .password(user.getPassword())
//                .email(user.getEmail())
//                .status(user.isStatus())
//                .role(user.getRole())
//                .build();
//
//    }


//}
