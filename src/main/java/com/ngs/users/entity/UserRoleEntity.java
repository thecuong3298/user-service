package com.ngs.users.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "t_user_role")
public class UserRoleEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "ID", nullable = false)
  private long id;

  @Basic
  @Column(name = "USER_ID", nullable = false)
  private long userId;

  @Basic
  @Column(name = "ROLE_ID", nullable = false)
  private long roleId;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserRoleEntity that = (UserRoleEntity) o;
    return userId == that.userId && roleId == that.roleId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, roleId);
  }
}
