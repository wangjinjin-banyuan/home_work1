package club.banyuan.dao;

import club.banyuan.entity.User;

public interface UserDao {
  public int add(User user);
  public User getLoginUserByTwo(User user);
  public User getLoginUser(String loginName);
}
