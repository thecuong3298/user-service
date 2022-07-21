package com.ngs.users.mapper;

import com.common.mapper.BaseMapper;
import com.ngs.users.dto.UserDto;
import com.ngs.users.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.WARN,
    typeConversionPolicy = ReportingPolicy.ERROR)
public interface UserMapper extends BaseMapper<UserEntity, UserDto> {}
