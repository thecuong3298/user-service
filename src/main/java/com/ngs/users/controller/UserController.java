package com.ngs.users.controller;

import com.common.dto.ResponseWrapper;
import com.ngs.users.dto.UserDto;
import com.ngs.users.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Tag(name = "Quản lý user")
@RequestMapping("user")
@RestController
public class UserController {

  private final UserService userService;

  @Operation(summary = "Lấy thông tin user theo username")
  @GetMapping("getByUsername")
  public ResponseWrapper<UserDto> getUserInfo(String username) {
    return new ResponseWrapper<>(this.userService.getByUsername(username));
  }
}
