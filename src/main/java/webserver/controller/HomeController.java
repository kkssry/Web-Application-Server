package webserver.controller;

import webserver.request.HttpRequest;
import webserver.response.HttpResponse;

public class HomeController extends AbstractController {
    @Override
    public void doGet(HttpRequest httpRequest, HttpResponse httpResponse) {
        httpResponse.forward("/index.html");
    }
}
