package com.codeminer.trz.survivor.controller;

import com.codeminer.trz.survivor.dto.SurvivorDTO;
import com.codeminer.trz.survivor.service.SurvivorService;
import com.codeminer.trz.survivor.service.impl.SurvivorServiceImpl;
import com.codeminer.trz.util.JSONParser;
import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/survivor")
public class SuvivorController extends HttpServlet {

    private final JSONParser JSONParser = new JSONParser();
    private SurvivorService survivorService;

    public SuvivorController() {
        if (survivorService == null) {
            survivorService = new SurvivorServiceImpl();
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            SurvivorDTO survivorDTO = JSONParser.jsonRequestToObject(request, SurvivorDTO.class);
            response.getWriter().println(JSONParser.objetoParaJson(survivorService.insert(survivorDTO)));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("bem vindo!");
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("bem vindo!");
    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("bem vindo!");
    }
}
