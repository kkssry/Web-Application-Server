package webserver.controller;

import webserver.request.HttpRequest;
import webserver.response.HttpResponse;

public abstract class AbstractController implements Controller {
    @Override
    public void service(HttpRequest httpRequest, HttpResponse httpResponse) {
        if (httpRequest.getMethod().equals("GET")) {
            doGet(httpRequest, httpResponse);
        }

        if (httpRequest.getMethod().equals("POST")) {
            doPost(httpRequest, httpResponse);
        }
    }

    public void doGet(HttpRequest httpRequest, HttpResponse httpResponse) {
    }

    public void doPost(HttpRequest httpRequest, HttpResponse httpResponse) {
    }
}
