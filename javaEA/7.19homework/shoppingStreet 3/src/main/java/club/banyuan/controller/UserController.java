package club.banyuan.controller;

import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
  @Autowired
  private UserService userService;

  @RequestMapping("/register")
  public String register(User user) {
     userService.add(user);
     return "Login";
  }

  @RequestMapping("/login")
  public String login(User user, HttpSession session){
    User user1=userService.getLoginUserByTwo(user);
    session.setAttribute("user",user1);
    return "index";
  }



}
