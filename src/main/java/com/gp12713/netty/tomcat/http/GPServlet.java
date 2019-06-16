package com.gp12713.netty.tomcat.http;

public abstract class GPServlet {
    public void service(GPRequest request,GPResponse response) throws Exception{
        //由service方法来决定，是调用doGet或者调用doPost
        if("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request,response);
        } else{
            doPost(request,response);
        }
    }

    protected abstract void doPost(GPRequest request, GPResponse response)throws Exception;

    protected abstract void doGet(GPRequest request, GPResponse response)throws Exception;
}
