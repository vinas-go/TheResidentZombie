package com.codeminer.trz.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

public class UtilRequest {

    public static String getRequest(HttpServletRequest request) {
        try {
            return request.getReader().lines().collect(Collectors.joining());
        } catch (IOException e) {
            return "";
        }
    }

    public static String getRequestParameter(HttpServletRequest request, String parameter) {
        if (request.getParameter(parameter) == null) {
            return "";
        } else {
            return request.getParameter(parameter).trim();
        }
    }
}
