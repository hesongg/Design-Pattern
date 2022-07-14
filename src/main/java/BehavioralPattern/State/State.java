package BehavioralPattern.State;

public interface State {
    void connect();
    void disconnect();
    void sendText(String text);
}
