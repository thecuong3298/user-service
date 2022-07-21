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
@Table(name = "t_menu")
public class MenuEntity {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "MENU_ID", nullable = false)
  private long menuId;

  @Basic
  @Column(name = "PARENT_ID", nullable = false)
  private long parentId;

  @Basic
  @Column(name = "MENU_NAME", nullable = false, length = 50)
  private String menuName;

  @Basic
  @Column(name = "PATH", nullable = true, length = 255)
  private String path;

  @Basic
  @Column(name = "COMPONENT", nullable = true, length = 255)
  private String component;

  @Basic
  @Column(name = "PERMS", nullable = true, length = 50)
  private String perms;

  @Basic
  @Column(name = "ICON", nullable = true, length = 50)
  private String icon;

  @Basic
  @Column(name = "TYPE", nullable = false, length = 2)
  private String type;

  @Basic
  @Column(name = "ORDER_NUM", nullable = true, precision = 0)
  private Double orderNum;

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
    MenuEntity that = (MenuEntity) o;
    return menuId == that.menuId
        && parentId == that.parentId
        && Objects.equals(menuName, that.menuName)
        && Objects.equals(path, that.path)
        && Objects.equals(component, that.component)
        && Objects.equals(perms, that.perms)
        && Objects.equals(icon, that.icon)
        && Objects.equals(type, that.type)
        && Objects.equals(orderNum, that.orderNum)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(modifyTime, that.modifyTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        menuId,
        parentId,
        menuName,
        path,
        component,
        perms,
        icon,
        type,
        orderNum,
        createTime,
        modifyTime);
  }
}
