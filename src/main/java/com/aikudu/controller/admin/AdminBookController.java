package com.aikudu.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aikudu.controller.ControllerHelper;
import com.aikudu.service.BookService;

@Controller
public class AdminBookController extends ControllerHelper {

  @Autowired
  private BookService bookService;

  @RequestMapping("/admin/book/all")
  public Object all(@RequestParam(defaultValue = "0") int page, Model model) {
    isRole("ROLE_ADMIN");
    int pageSize = 10;
    model.addAttribute("result", bookService.queryBooks(page, pageSize));
    return "v2/book/all";
  }

  @RequestMapping("/admin/book/add")
  public Object add(@RequestParam String name) {
    isRole("ROLE_ADMIN");
    if (name.length() > 64) {
      return error("书名不能超过64个字");
    }
    bookService.addBook(name);
    return ok();
  }

}
