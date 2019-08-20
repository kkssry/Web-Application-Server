package webserver.controller;

import webserver.request.HttpRequest;
import webserver.response.HttpResponse;

public class ForwardController extends AbstractController {
    @Override
    public void doGet(HttpRequest httpRequest, HttpResponse httpResponse) {
        httpResponse.addHeader(CONTENT_TYPE, HTML_CONTENT_TYPE);
        httpResponse.forward(httpRequest.getPath());
    }
}
