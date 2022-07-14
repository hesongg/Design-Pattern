package BehavioralPattern.State;

public class TextSender {
    private final State connectState;
    private final State disconnectState;

    private State currentState;

    public TextSender() {
        this.connectState = new ConnectState(this);
        this.disconnectState = new DisconnectState(this);
        this.currentState = disconnectState;
    }

    public void setConnectState(State state){
        currentState = state;
    }

    public State getConnectState(){
        return this.connectState;
    }

    public State getDisconnectState() {
        return this.disconnectState;
    }

    public void doConnect(){
        currentState.connect();
    }

    public void doDisconnect(){
        currentState.disconnect();
    }

    public void doSendText(String text){
        currentState.sendText(text);
    }
}
