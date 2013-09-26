package com.aikudu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends ControllerHelper {

  @RequestMapping("/")
  public Object root() {
    return "index";
  }

  @RequestMapping("/index.html")
  public Object index() {
    return "index";
  }

}
