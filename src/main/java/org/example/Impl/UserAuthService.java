package org.example.Impl;

import org.example.Dao.UserDao;
import org.example.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : OOP
 * @CreatedDate : 10/12/2024, Tuesday
 **/
public class UserAuthService implements UserDao {

    private static List<User> usersList = new ArrayList<>();
    static {
        usersList.add(new User("test","test"));
        usersList.add(new User("test1","test"));
        usersList.add(new User("test2","test"));
    }

    @Override
    public User login(User user) {
        for (User individualUser : usersList ) {
            if (individualUser.getUsername().equals(user.getUsername()) && individualUser.getPassword().equals(user.getPassword())) {
                return individualUser;
            }
        }
        return null;
    }
}
