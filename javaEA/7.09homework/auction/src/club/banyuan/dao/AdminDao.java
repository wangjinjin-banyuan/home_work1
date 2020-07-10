package club.banyuan.dao;

import club.banyuan.entity.Administrator;
import club.banyuan.entity.User;

public interface AdminDao extends IBaseDao {
  public Administrator getLoginAdmin(String loginName,String pwd);
}
