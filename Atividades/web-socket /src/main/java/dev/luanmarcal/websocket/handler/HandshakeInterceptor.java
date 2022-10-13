package dev.luanmarcal.websocket.handler;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;
import java.util.Random;

public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor {

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {

        attributes.put("user", getSuperHero());
        String path = request.getURI().getPath();
        System.out.println(path);

        return super.beforeHandshake(request, response, wsHandler, attributes);
    }

    protected Object getSuperHero() {

        String[] superheros = {"SuperMan", "Flash", "SpiderMan"};

        Random random = new Random();
        return superheros[random.nextInt(superheros.length)];
    }

}
