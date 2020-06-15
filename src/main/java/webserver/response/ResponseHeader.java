package webserver.response;

import java.util.HashMap;
import java.util.Map;

public class ResponseHeader {
    private Map<String, String> headers = new HashMap<>();

    public void addHeader(String header, String value) {
        headers.put(header, value);
    }

    public Map<String, String> getHeaders() {
        return headers;
    }
}
