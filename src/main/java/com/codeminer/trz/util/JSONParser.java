package com.codeminer.trz.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;

public class JSONParser extends ObjectMapper {

    public <T> T jsonRequestToObject(HttpServletRequest request, Class<T> classeRetorno) {
        String json = UtilRequest.getRequest(request);
        return jsonToObject(json, classeRetorno);
    }

    public <T> T jsonRequestToObject(HttpServletRequest request, String nomeParametroRequest, Class<T> classeRetorno) {
        String json = UtilRequest.getRequestParameter(request, nomeParametroRequest);
        return jsonToObject(json, classeRetorno);
    }

    public <T> T jsonToObject(String json, Class<T> classeRetorno) {
        try {
            return readValue(json, classeRetorno);
        } catch (Exception e) {
            throw new RuntimeException("Não é possível converter o json para objeto.", e);
        }
    }

    public String objetoParaJson(Object objeto) {
        try {
            return writeValueAsString(objeto);
        } catch (Exception e) {
            throw new RuntimeException("Não é possível converter o objeto para json.", e);
        }
    }

}
