package webserver.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public class ResponseData {
    private static final Logger log = LoggerFactory.getLogger(ResponseData.class);
    private  DataOutputStream dos;

    public ResponseData(OutputStream out) {
        this.dos = new DataOutputStream(out);
    }

    public void addWriteStatusLine(String version, HttpStatusCode statusCode) throws IOException {
        dos.writeBytes(version + " " + statusCode.getHttpStatusNumber() + "\r\n");
    }

    public void addWriteHeader(Map<String, String> headers) throws IOException {
        for (String key : headers.keySet()) {
            dos.writeBytes(key + ": " + headers.get(key) + "\r\n");
        }
        dos.writeBytes("\r\n");
    }

    public void addResponseBody(byte[] body) {
        try {
            dos.write(body, 0, body.length);        // byte[] 배열의 내용물을 dos에 옮김
            dos.flush();
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }
}
