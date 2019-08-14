package webserver.response;

import util.HttpResponseUtils;

import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class HttpResponse {
    private StatusLine statusLine;
    private ResponseHeader responseHeader;
    private ResponseBody responseBody;
    private DataOutputStream dos;

    public HttpResponse(DataOutputStream dos) {
        this.dos = dos;
    }

    public void addHeader(String s) {
    }

    private void addStatusLine(String httpVersion, HttpStatusCode statusCode) {
        statusLine = new StatusLine(httpVersion, statusCode);
    }

    private void addResponseHeader(Map<String, String> responseHeader) {
        this.responseHeader = new ResponseHeader(responseHeader);
    }

    private void addResponseBody(String url) {
        try {
            this.responseBody = new ResponseBody(Files.readAllBytes(Paths.get("./webapp" + url)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendRedirect(String url) {
        addStatusLine(HttpResponseUtils.HTTP_VERSION_1_1, HttpStatusCode.OK);
        addResponseHeader(response3xxHeader());
        writeResponseMessage();
    }

    private void writeResponseMessage() {
        try {
            statusLine.addWriteStatusLine(dos);
            responseHeader.addWriteHeader(dos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String, String> response3xxHeader() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Location", "/index.html");
        return headers;
    }

    public void forward(String url) {
        addStatusLine(HttpResponseUtils.HTTP_VERSION_1_1, HttpStatusCode.OK);
        addResponseHeader(response3xxHeader());
        writeResponseMessage();
        addResponseBody(url);
        responseBody.responseBody(dos);
    }
}
