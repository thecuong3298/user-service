package com.ngs.users.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class UserDto {
  @Schema(description = "ID user", required = true, example = "1")
  private long userId;

  @Schema(description = "User name", required = true, example = "admin")
  private String username;

  @Schema(
      description = "Mật khẩu",
      required = true,
      example = "admin",
      accessMode = Schema.AccessMode.WRITE_ONLY)
  private String password;

  @Schema(description = "Id phòng", required = true, example = "2")
  private Long deptId;

  @Schema(description = "Email", required = true, example = "admin@ngs.vn")
  private String email;

  @Schema(description = "Số điện thoại", required = true, example = "0987654341")
  private String mobile;

  @Schema(description = "Trạng thái", required = true, example = "1")
  private String status;

  @Schema(
      description = "Ngày tạo",
      required = true,
      example = "2022-05-20T22:28:21Z",
      accessMode = Schema.AccessMode.READ_ONLY)
  private Timestamp createTime;

  @Schema(
      description = "Ngày cập nhật",
      example = "2022-05-20T22:28:21Z",
      accessMode = Schema.AccessMode.READ_ONLY)
  private Timestamp modifyTime;

  @Schema(
      description = "Lần đăng nhập cuối",
      example = "2022-05-20T22:28:21Z",
      accessMode = Schema.AccessMode.READ_ONLY)
  private Timestamp lastLoginTime;

  @Schema(description = "Giới tính", required = true, example = "1")
  private String sex;

  @Schema(description = "Mô tả")
  private String description;

  @Schema(description = "Avatar", required = true, example = "admin.jpg")
  private String avatar;
}
