package groupproject.superapp.mapper;

import groupproject.superapp.dto.AppProductDto;
import groupproject.superapp.model.AppProduct;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        builder = @Builder(disableBuilder = true))
public interface ProductMapper extends GeneralMapper<AppProduct, AppProductDto> {


}
