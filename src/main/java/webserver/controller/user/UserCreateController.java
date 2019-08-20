package webserver.controller.user;

import model.User;
import util.HttpRequestUtils;
import webserver.controller.AbstractController;
import webserver.request.HttpRequest;
import webserver.response.HttpResponse;
import webserver.service.UserService;

public class UserCreateController extends AbstractController {
    @Override
    public void doPost(HttpRequest httpRequest, HttpResponse httpResponse) {
        User user = HttpRequestUtils.createUser(httpRequest.getBody());
        UserService.addUser(user);
        httpResponse.sendRedirect("/index.html");
    }
}
