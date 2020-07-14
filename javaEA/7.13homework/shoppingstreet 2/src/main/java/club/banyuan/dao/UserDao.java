package club.banyuan.dao;

import club.banyuan.entity.User;

public interface UserDao {
    public int add(User user);
    public User getLoginUserbybyTwo(String loginName, String pwd);
    public User getLoginUser(String loginName);
}
