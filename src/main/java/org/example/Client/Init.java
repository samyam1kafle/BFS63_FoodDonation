package org.example.Client;

import org.example.Dao.UserDao;
import org.example.Impl.UserAuthService;
import org.example.pojo.User;

import java.util.Scanner;

/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : OOP
 * @CreatedDate : 10/12/2024, Tuesday
 **/
public class Init {

    private static Scanner sc = new Scanner(System.in);
    private static UserDao userDao = new UserAuthService();
    public static void init() {
        System.out.println("1: Login \n" +
                "2: Register");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter your username!");
                String uName = sc.nextLine();
                System.out.println("Enter your password!");
                String uPwd = sc.nextLine();
                User user = new User();
                user.setUsername(uName);
                user.setPassword(uPwd);
                User currentUser = userDao.login(user);
                System.out.println(currentUser.toString());
                break;
        }

    }
}
