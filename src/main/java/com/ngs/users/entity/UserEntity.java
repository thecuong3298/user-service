package com.ngs.users.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "t_user")
public class UserEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "USER_ID", nullable = false)
  private long userId;

  @Basic
  @Column(name = "USERNAME", nullable = false, length = 50)
  private String username;

  @Basic
  @Column(name = "PASSWORD", nullable = false, length = 128)
  private String password;

  @Basic
  @Column(name = "DEPT_ID", nullable = true)
  private Long deptId;

  @Basic
  @Column(name = "EMAIL", nullable = true, length = 128)
  private String email;

  @Basic
  @Column(name = "MOBILE", nullable = true, length = 20)
  private String mobile;

  @Basic
  @Column(name = "STATUS", nullable = false, length = 1)
  private String status;

  @Basic
  @Column(name = "CREATE_TIME", nullable = false)
  private Timestamp createTime;

  @Basic
  @Column(name = "MODIFY_TIME", nullable = true)
  private Timestamp modifyTime;

  @Basic
  @Column(name = "LAST_LOGIN_TIME", nullable = true)
  private Timestamp lastLoginTime;

  @Basic
  @Column(name = "SSEX", nullable = true, length = 1)
  private String ssex;

  @Basic
  @Column(name = "DESCRIPTION", nullable = true, length = 100)
  private String description;

  @Basic
  @Column(name = "AVATAR", nullable = true, length = 100)
  private String avatar;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserEntity that = (UserEntity) o;
    return userId == that.userId
        && Objects.equals(username, that.username)
        && Objects.equals(password, that.password)
        && Objects.equals(deptId, that.deptId)
        && Objects.equals(email, that.email)
        && Objects.equals(mobile, that.mobile)
        && Objects.equals(status, that.status)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(modifyTime, that.modifyTime)
        && Objects.equals(lastLoginTime, that.lastLoginTime)
        && Objects.equals(ssex, that.ssex)
        && Objects.equals(description, that.description)
        && Objects.equals(avatar, that.avatar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        userId,
        username,
        password,
        deptId,
        email,
        mobile,
        status,
        createTime,
        modifyTime,
        lastLoginTime,
        ssex,
        description,
        avatar);
  }
}
