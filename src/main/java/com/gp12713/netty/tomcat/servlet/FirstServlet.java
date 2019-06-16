package com.gp12713.netty.tomcat.servlet;

import com.gp12713.netty.tomcat.http.GPRequest;
import com.gp12713.netty.tomcat.http.GPResponse;
import com.gp12713.netty.tomcat.http.GPServlet;

public class FirstServlet extends GPServlet {
    @Override
    protected void doPost(GPRequest request, GPResponse response) throws Exception {
        response.write("This is First Servlet");
    }

    @Override
    protected void doGet(GPRequest request, GPResponse response) throws Exception {
        this.doPost(request,response);
    }
}
