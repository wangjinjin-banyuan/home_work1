package club.banyuan.dao;

import club.banyuan.entity.Administrator;

public interface AdminDao extends IBaseDao {
  public Administrator getLoginAdmin(String loginName,String pwd);
}
