package com.aikudu.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

  @RequestMapping("/admin/book/delete")
  public Object delete(@RequestParam String id) {
    isRole("ROLE_ADMIN");
    bookService.deleteBook(id);
    return ok();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/admin/book/edit")
  public Object edit(@RequestParam String id, Model model) {
    isRole("ROLE_ADMIN");
    model.addAttribute("book", bookService.getBook(id));
    return "v2/book/edit";
  }

}
