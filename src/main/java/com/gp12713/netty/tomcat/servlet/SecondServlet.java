package com.gp12713.netty.tomcat.servlet;

import com.gp12713.netty.tomcat.http.GPRequest;
import com.gp12713.netty.tomcat.http.GPResponse;
import com.gp12713.netty.tomcat.http.GPServlet;

public class SecondServlet extends GPServlet {
    @Override
    protected void doPost(GPRequest request, GPResponse response) throws Exception {
        response.write("This is Second Servlet");
    }

    @Override
    protected void doGet(GPRequest request, GPResponse response) throws Exception {
        this.doPost(request,response);
    }
}
