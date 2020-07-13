package club.banyuan.service.Impl;

import club.banyuan.dao.AdminDao;
import club.banyuan.dao.Impl.AdminDaoImpl;
import club.banyuan.dao.Impl.UserDaoImpl;
import club.banyuan.dao.UserDao;
import club.banyuan.entity.Administrator;
import club.banyuan.service.AdminService;
import club.banyuan.util.JdbcUtils;
import java.sql.SQLException;

public class AdminServiceImpl implements AdminService {

  @Override
  public Administrator login(String adminName, String password) throws SQLException {
    AdminDao adminDao = new AdminDaoImpl(JdbcUtils.getConnection());
    return adminDao.getLoginAdmin(adminName,password);
  }
}
