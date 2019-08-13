package webserver;

import webserver.request.HttpRequest;
import webserver.response.HttpResponse;

public class Dispatcher {
    private HttpRequest httpRequest;
    private HttpResponse httpResponse;

    public Dispatcher(HttpRequest httpRequest, HttpResponse httpResponse) {
        this.httpRequest = httpRequest;
        this.httpResponse = httpResponse;
    }

    public void dispatch() {
        HandlerMapping.findController(httpRequest.getPath()).service(httpRequest, httpResponse);
    }
}
