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
@Table(name = "t_role_menu")
public class RoleMenuEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "ID", nullable = false)
  private long id;

  @Basic
  @Column(name = "ROLE_ID", nullable = false)
  private long roleId;

  @Basic
  @Column(name = "MENU_ID", nullable = false)
  private long menuId;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RoleMenuEntity that = (RoleMenuEntity) o;
    return roleId == that.roleId && menuId == that.menuId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, menuId);
  }
}
