package club.banyuan;

import club.banyuan.entity.Order;
import club.banyuan.entity.User;
import club.banyuan.service.BuyService;
import club.banyuan.service.UserService;

import java.sql.SQLException;

public class TestMain {
    public static void main(String[] args) {
        //UserUI();
        BuyService buyService = new BuyService();
        try {
            Order order = buyService.createOrder(24,"华为");
            System.out.println(order.getId() +"  "+order.getCost());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void UserUI() {
        User newUser = new User(null,"fff","realName","123",1,"dfs@sdf.com","12345666673");
        UserService userService = new UserService();
        try {
            User user = userService.register(newUser);
            System.out.println(user.getId());
        } catch (Exception ex) {
            System.out.println("register faile");
            ex.printStackTrace();
        }
        try {
            User user = userService.login("fff","123");
            System.out.println(user.getId());
        } catch (Exception ex) {
            System.out.println("login sfaile");
            ex.printStackTrace();
        }
    }
}
