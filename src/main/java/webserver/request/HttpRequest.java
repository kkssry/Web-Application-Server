package webserver.request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private RequestLine requestLine;
    private RequestHeader requestHeader;
    private RequestBody requestBody;

    public HttpRequest(RequestLine requestLine, RequestHeader requestHeader, RequestBody requestBody) {
        this.requestLine = requestLine;
        this.requestHeader = requestHeader;
        this.requestBody = requestBody;
    }

    public String getHeader(String key) {
        return requestHeader.getHeaderValue(key);
    }

    public String getMethod() throws IOException {
        return requestLine.getMethod();
    }

    public String getPath() throws IOException {
        return requestLine.getUrl();
    }

    public String getParameter(String key) {
        return requestLine.getParam(key);
    }
}
