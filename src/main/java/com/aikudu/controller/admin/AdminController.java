package com.aikudu.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aikudu.controller.ControllerHelper;

@Controller
public class AdminController extends ControllerHelper {

  @RequestMapping("/admin")
  public Object admin() {
    isRole("ROLE_ADMIN");
    return "v2/admin";
  }

}
