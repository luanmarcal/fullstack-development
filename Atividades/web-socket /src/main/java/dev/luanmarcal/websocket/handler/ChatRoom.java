package dev.luanmarcal.websocket.handler;

import com.google.gson.Gson;
import dev.luanmarcal.websocket.models.PadoLabsMessage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatRoom extends AbstractWebSocketHandler {

    public final static List<WebSocketSession> sessionList = Collections.synchronizedList(new ArrayList<>());


    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        System.out.println("NEW SESSION CREATED...");
        session.sendMessage(new TextMessage("Você Logou! " + "Seu usuário é o: "
                + session.getAttributes().get("user").toString()));
        sessionList.add(session);

        //TODO CHECK IF NEEDED
        super.afterConnectionEstablished(session);

    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

        Gson gson = new Gson();

        PadoLabsMessage padoLabsMessage = gson.fromJson(message.getPayload(), PadoLabsMessage.class);

        System.out.println(padoLabsMessage);

        if(padoLabsMessage.getUser().equalsIgnoreCase(""))
        {
            for(WebSocketSession targetSession: sessionList)
            {
                targetSession.sendMessage(new TextMessage(padoLabsMessage.getMessage()));
            }
        }
        for(WebSocketSession targetSession: sessionList)
        {
            if (targetSession.getAttributes().get("user").toString().equalsIgnoreCase(padoLabsMessage.getUser()))
            {
                targetSession.sendMessage(new TextMessage(padoLabsMessage.getMessage()));
            }
        }

        super.handleTextMessage(session, message);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        sessionList.remove(session);
        System.out.println("//SESSIONS: ");
        sessionList.forEach(WebSocketSession -> {
            System.out.println(WebSocketSession.getAttributes().get("user").toString());
        });
        System.out.println("////////////////////////////////////////");
        super.afterConnectionClosed(session, status);
    }
}
