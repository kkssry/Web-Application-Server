package webserver.controller;

import webserver.request.HttpRequest;
import webserver.response.HttpResponse;

public class FontController extends AbstractController {
    @Override
    public void doGet(HttpRequest httpRequest, HttpResponse httpResponse) {
        httpResponse.addHeader(CONTENT_TYPE, FONT_CONTENT_TYPE);
        httpResponse.forward(httpRequest.getPath());
    }
}
