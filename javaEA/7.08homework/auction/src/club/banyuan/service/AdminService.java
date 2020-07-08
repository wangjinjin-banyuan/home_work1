package club.banyuan.service;

import club.banyuan.entity.Administrator;
import club.banyuan.entity.User;
import java.sql.SQLException;

public interface AdminService {
  public Administrator login(String username, String password) throws SQLException;
}
