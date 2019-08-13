package webserver.response;

import java.io.DataOutputStream;
import java.io.OutputStream;

public class HttpResponse {
    private OutputStream out;

    public HttpResponse(OutputStream out) {
        this.out = out;
    }
}
