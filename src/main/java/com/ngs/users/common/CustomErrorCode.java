package com.ngs.users.common;

import com.common.rest.response.ErrorCodeResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CustomErrorCode implements ErrorCodeResponse {
  USER_NOT_EXISTED("N404", "User không tồn tại");

  private final String code;
  private final String message;
}
