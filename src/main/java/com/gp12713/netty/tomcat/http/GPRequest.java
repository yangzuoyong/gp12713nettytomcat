package com.gp12713.netty.tomcat.http;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.QueryStringDecoder;

import java.util.List;
import java.util.Map;

public class GPRequest {
    private ChannelHandlerContext ctx;
    private HttpRequest req;

    public GPRequest(ChannelHandlerContext ctx, HttpRequest req) {
        this.ctx = ctx;
        this.req = req;
    }
    public String getUrl(){return req.uri();}
    public String getMethod(){return req.method().name();}
    public Map<String, List<String>> getParameters(){
        return (new QueryStringDecoder(req.uri())).parameters();
    }
    public String getParameter(String name){
        Map<String,List<String>> params = getParameters();
        return null==params.get(name)? null:params.get(name).get(0);
    }
}
