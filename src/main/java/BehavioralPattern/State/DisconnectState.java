package BehavioralPattern.State;

public class DisconnectState implements State{
    private final TextSender textSender;

    public DisconnectState(TextSender textSender) {
        this.textSender = textSender;
    }

    @Override
    public void connect() {
        textSender.setConnectState(textSender.getConnectState());
        System.out.println("연결 성공 - 상태 변경 : connected");
    }

    @Override
    public void disconnect() {
        System.out.println("이미 연결이 종료되어 있습니다.");
    }

    @Override
    public void sendText(String text) {
        System.out.println("send text data failed ! connection is disconnected");
    }
}
