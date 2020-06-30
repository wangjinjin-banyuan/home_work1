package club.banyuan.service;

import club.banyuan.entity.User;
import club.banyuan.util.JdbcUtils;

import java.sql.*;

public class UserService {
    public User login(String loginName, String password) throws SQLException {
        Connection conn = JdbcUtils.getConnection("shoppingstreet");
        String sql = "select * from user where loginName=? and password=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1,loginName);
        pstm.setString(2,password);

        User user = null;
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            user = new User(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    null,rs.getInt(5),
                    rs.getString(6),rs.getString(7));
        }
        JdbcUtils.close(conn,pstm,rs);
        return user;
    }

    public User register(User user) throws SQLException {
        String sql = "insert into user(id,loginName,userName,password,sex,email,mobile) values(null,?,?,?,?,?,?)";
        Connection conn = JdbcUtils.getConnection("shoppingstreet");
        PreparedStatement pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        pstm.setString(1,user.getLoginName());
        pstm.setString(2,user.getUserName());
        pstm.setString(3,user.getPassword());
        pstm.setInt(4,user.getSex());
        pstm.setString(5,user.getEmail());
        pstm.setString(6,user.getMobile());

        int i = pstm.executeUpdate();
        if(i>0){
            ResultSet rs = pstm.getGeneratedKeys();
            if(rs.next()){
                user.setId((int)rs.getLong(1));
                return user;
            }
        }
        JdbcUtils.close(conn,pstm);
        return null;
    }
}
