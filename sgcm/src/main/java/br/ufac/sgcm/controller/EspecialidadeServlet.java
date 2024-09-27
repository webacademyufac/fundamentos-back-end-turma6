package br.ufac.sgcm.controller;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import java.util.*;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.ufac.sgcm.model.Especialidade;

public class EspecialidadeServlet extends HttpServlet {
    public void service(ServletRequest req, ServletResponse res) {
        String termoBusca = req.getParameter("busca");
        List<Especialidade> registros = new ArrayList<>();
        EspecialidadeController controller = new EspecialidadeController();
        registros = controller.get(termoBusca);
        // JSON
        res.setContentType("application/json");
        res.setCharacterEncoding("utf-8");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(registros);
            PrintWriter saida = res.getWriter();
            saida.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
