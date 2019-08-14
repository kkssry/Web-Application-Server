package webserver;

import webserver.controller.*;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
    private static Map<String, Controller> controllers = new HashMap<>();

    static {
        controllers.put("/users/create", new CreateUserController());
        controllers.put("/users/login", new LoginController());
        controllers.put("/users/list", new ListUserController());
        controllers.put("/index", new HomeController());
    }

    public static Controller findController(String url) {
        return controllers.get(url);
    }
}
