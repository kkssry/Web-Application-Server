package webserver.controller;

import model.User;
import util.HttpRequestUtils;
import webserver.request.HttpRequest;
import webserver.response.HttpResponse;
import webserver.service.UserService;

public class CreateUserController extends AbstractController {
    @Override
    public void doPost(HttpRequest httpRequest, HttpResponse httpResponse) {
        User user = HttpRequestUtils.createUser(httpRequest.getBody());
        UserService.addUser(user);


    }
}
