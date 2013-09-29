package com.aikudu;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Component;

import com.aikudu.dao.MongoDao;
import com.aikudu.model.User;
import com.aikudu.model.Version;

@Component
public class DataUpgrade implements InitializingBean {

  @Autowired
  private MongoDao mongoDao;
  @Autowired
  private Version version;

  private void upgrade() {
    nullToV1();
  }

  private void nullToV1() {
    Version version = mongoDao.createQuery("Version").findObject(Version.class);
    if (version == null) {
      // 初始化管理员
      String admin = "admin";
      User user = new User();
      user.setId(UUID.randomUUID().toString());
      user.setUsername(admin);
      user.setPassword(new ShaPasswordEncoder(256).encodePassword(admin, null));
      user.setNickname(admin);
      user.setFullname(admin);
      user.setGravatar(new Md5PasswordEncoder().encodePassword(admin, null));
      user.getRoles().add("ROLE_ADMIN");
      user.setEnabled(true);
      user.setCreated(new Date());
      user.setModified(new Date());
      mongoDao.createObject("User", user);
    }
    mongoDao.createObject("Version", this.version);
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    upgrade();
  }
}
