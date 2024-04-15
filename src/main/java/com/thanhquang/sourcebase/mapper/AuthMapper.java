package com.thanhquang.sourcebase.mapper;

import com.thanhquang.sourcebase.dto.request.auth.RegisterDto;
import com.thanhquang.sourcebase.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthMapper {

    AuthMapper INSTANCE = Mappers.getMapper( AuthMapper.class );

    @Mapping(target = "status", ignore = true)
    @Mapping(target = "userRoles", ignore = true)
    UserEntity toUserEntityRegister(RegisterDto registerDto);
}
