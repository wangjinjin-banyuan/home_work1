package club.banyuan.dao;

import club.banyuan.entity.User;

public interface UserDao extends IBaseDao{
    public User register(User user);
    public User getLoginUser(String loginName,String pwd);
}
