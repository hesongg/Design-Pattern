package BehavioralPattern.State;

public class ConnectState implements State{
    private final TextSender textSender;

    public ConnectState(TextSender textSender) {
        this.textSender = textSender;
    }

    @Override
    public void connect() {
        System.out.println("이미 연결되어 있습니다.");
    }

    @Override
    public void disconnect() {
        textSender.setConnectState(textSender.getDisconnectState());
        System.out.println("연결 종료 - 상태 변경 : disconnected");
    }

    @Override
    public void sendText(String text) {
        System.out.println("send text data success ! text = " + text);
    }
}
