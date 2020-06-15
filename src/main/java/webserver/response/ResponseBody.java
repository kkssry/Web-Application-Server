package webserver.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataOutputStream;
import java.io.IOException;

public class ResponseBody {
    private static final Logger log = LoggerFactory.getLogger(ResponseBody.class);
    private byte[] body;

    public ResponseBody(byte[] body) {
        this.body = body;
    }

    public byte[] getBody() {
        return body;
    }

    public String getBodyLength() {
        return String.valueOf(body.length);
    }
}
