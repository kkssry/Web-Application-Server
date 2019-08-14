package util;

import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import model.User;
import webserver.request.RequestBody;
import webserver.request.RequestHeader;
import webserver.request.RequestLine;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HttpResponseUtils {
    public static final String HTTP_VERSION_1_1 = "HTTP/1.1";
}
