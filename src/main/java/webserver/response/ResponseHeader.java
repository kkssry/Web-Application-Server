package webserver.response;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ResponseHeader {
    private Map<String,String> headers;

    public ResponseHeader(Map<String, String> headers) {
        this.headers = headers;
    }

    void addWriteHeader(DataOutputStream dos) throws IOException {
        for (String key : headers.keySet()) {
            dos.writeBytes(key +": " + headers.get(key));
        }
    }
}
