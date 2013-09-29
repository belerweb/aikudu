package com.aikudu.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;


public class User implements Serializable {

  private static final long serialVersionUID = 9125098466490195551L;

  private String id;
  private String mobile;// 手机号
  private String email;// 电子邮件
  private String username;// 用户名
  private String password;// 密码

  private String activationCode;// 帐户激活码
  private String phoneCode;// 手机激活码
  private String emailCode;// 电子邮件激活码
  private Boolean enabled = Boolean.FALSE;// 帐户是否激活

  private String fullname;// 姓名
  private String nickname;// 昵称
  private String gravatar;// gravatar
  private String source;// 注册来源
  private String lastLoginIP;// 最后登录IP
  private Date created;// 注册时间
  private Date modified;// 最后更新时间
  private List<String> roles = new ArrayList<>();// 角色

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getActivationCode() {
    return activationCode;
  }

  public void setActivationCode(String activationCode) {
    this.activationCode = activationCode;
  }

  public String getPhoneCode() {
    return phoneCode;
  }

  public void setPhoneCode(String phoneCode) {
    this.phoneCode = phoneCode;
  }

  public String getEmailCode() {
    return emailCode;
  }

  public void setEmailCode(String emailCode) {
    this.emailCode = emailCode;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getGravatar() {
    return gravatar;
  }

  public void setGravatar(String gravatar) {
    this.gravatar = gravatar;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getLastLoginIP() {
    return lastLoginIP;
  }

  public void setLastLoginIP(String lastLoginIP) {
    this.lastLoginIP = lastLoginIP;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getModified() {
    return modified;
  }

  public void setModified(Date modified) {
    this.modified = modified;
  }

  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public List<SimpleGrantedAuthority> getWrapperRoles() {
    List<SimpleGrantedAuthority> roles = new ArrayList<>();
    for (String role : this.roles) {
      roles.add(new SimpleGrantedAuthority(role));
    }
    return roles;
  }

  public static class UserWrapper extends org.springframework.security.core.userdetails.User {
    private static final long serialVersionUID = -2466927911565414318L;
    private User user;

    public UserWrapper(String username, User user) {
      super(username, user.getPassword(), user.getEnabled(), true, true, true, user
          .getWrapperRoles());
      this.user = user;
    }

    public User getDetail() {
      return user;
    }
  }

}
