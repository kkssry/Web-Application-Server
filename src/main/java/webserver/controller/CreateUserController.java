package webserver.controller;

import model.User;
import util.HttpRequestUtils;
import util.HttpResponseUtils;
import webserver.request.HttpRequest;
import webserver.response.HttpResponse;
import webserver.response.HttpStatusCode;
import webserver.response.ResponseHeader;
import webserver.service.UserService;

import java.util.HashMap;
import java.util.Map;

public class CreateUserController extends AbstractController {
    @Override
    public void doPost(HttpRequest httpRequest, HttpResponse httpResponse) {
        User user = HttpRequestUtils.createUser(httpRequest.getBody());
        UserService.addUser(user);
        httpResponse.sendRedirect("/index.html");
    }
}
