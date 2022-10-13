package dev.luanmarcal.websocket.models;

public class PadoLabsMessage {

    private String user;
    private String message;

    public PadoLabsMessage() {
    }

    public String getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PadoLabsMessage{" +
                "user='" + user + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
