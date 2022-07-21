package com.ngs.users.service.impl;

import com.common.rest.error.CommonException;
import com.ngs.users.dto.UserDto;
import com.ngs.users.mapper.UserMapper;
import com.ngs.users.repository.UserRepository;
import com.ngs.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.ngs.users.common.CustomErrorCode.USER_NOT_EXISTED;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  private final UserMapper userMapper;

  @Override
  public UserDto getByUsername(String username) {
    return this.userMapper.entityToDto(
        this.userRepository
            .findByUsername(username)
            .orElseThrow(() -> new CommonException(USER_NOT_EXISTED)));
  }
}
