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
@Table(name = "t_role")
public class RoleEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "ROLE_ID", nullable = false)
  private long roleId;

  @Basic
  @Column(name = "ROLE_NAME", nullable = false, length = 15)
  private String roleName;

  @Basic
  @Column(name = "REMARK", nullable = true, length = 100)
  private String remark;

  @Basic
  @Column(name = "CREATE_TIME", nullable = false)
  private Timestamp createTime;

  @Basic
  @Column(name = "MODIFY_TIME", nullable = true)
  private Timestamp modifyTime;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RoleEntity that = (RoleEntity) o;
    return roleId == that.roleId
        && Objects.equals(roleName, that.roleName)
        && Objects.equals(remark, that.remark)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(modifyTime, that.modifyTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, roleName, remark, createTime, modifyTime);
  }
}
