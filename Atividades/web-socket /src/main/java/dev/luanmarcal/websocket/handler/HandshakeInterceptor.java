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

        String user = request.getURI().toString();

        String userToConnect = user.substring(user.lastIndexOf("/") + 1);

        if(userToConnect.equalsIgnoreCase(""))
        {
            userToConnect = getSuperHero();
        }
        attributes.put("user", userToConnect);


        return super.beforeHandshake(request, response, wsHandler, attributes);
    }

    protected String getSuperHero() {

        String[] superHero = {"Batman" , "Hulk", "The Flash", "Cpt America"};

        Random random = new Random();

        return superHero[random.nextInt(superHero.length)];
    }

}
