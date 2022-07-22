package com.bank.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontControllerServlet extends HttpServlet {
    private HandlerMapping mappings;

    @Override
    public void init(ServletConfig config) throws ServletException {

        String propLocation = config.getInitParameter("propLocation");

        mappings = new HandlerMapping(propLocation);
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uri = request.getRequestURI();


        try {
            Controller control = mappings.getController(uri);

            if (control != null) {

                String callPage = control.handleRequest(request, response);

                if (callPage.startsWith("redirect:")) {
                    callPage = callPage.substring("redirect:".length());
                    response.sendRedirect(request.getContextPath() + callPage);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher(callPage);
                    dispatcher.forward(request, response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}