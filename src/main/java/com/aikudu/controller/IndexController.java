package com.aikudu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends ControllerHelper {

  @RequestMapping("/")
  public Object root() {
    return "v1/index";
  }

  @RequestMapping("/index.html")
  public Object index() {
    return "v1/index";
  }

  @RequestMapping("/login.html")
  public Object login() {
    return "v1/login";
  }

  @RequestMapping("/signup.html")
  public Object signup() {
    return "v1/signup";
  }

  @RequestMapping("/redirect")
  public Object redirect() {
    return "redirect:/";
  }

}
