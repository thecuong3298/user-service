package com.ngs.users.service;

import com.ngs.users.dto.UserDto;

public interface UserService {

  UserDto getByUsername(String username);
}
