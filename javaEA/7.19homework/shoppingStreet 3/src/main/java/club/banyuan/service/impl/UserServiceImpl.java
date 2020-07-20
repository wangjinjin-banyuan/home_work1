package club.banyuan.service.impl;

import club.banyuan.dao.UserDao;
import club.banyuan.entity.User;
import club.banyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserDao userDao;


  @Override
  public int add(User user) {
    return userDao.add(user);
  }

  @Override
  public User getLoginUserByTwo(User user) {
    return userDao.getLoginUserByTwo(user);
  }

  @Override
  public User getLoginUser(String loginName) {
    return userDao.getLoginUser(loginName);
  }
}
