package club.banyuan.controller;

import club.banyuan.dao.AddressDao;
import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {
  @Autowired
  private AddressDao addressDao;

  @RequestMapping("/address")
  public String register(Integer userId) {
    addressDao.getAddressbyUserId(userId);
    return "";
  }
}
