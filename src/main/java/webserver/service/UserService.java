package webserver.service;

import db.DataBase;
import model.User;

public class UserService {

    public static void addUser(User user) {
        DataBase.addUser(user);
    }
}
