package BehavioralPattern.State;

public class Main {
    public static void main(String[] args) {
        TextSender textSender = new TextSender();

        //연결이 종료되어있으므로 이미 종료되어있다고 출력된다.
        textSender.doDisconnect();

        //연결이 종료되어있으므로 메시지 전송이 실패한다.
        textSender.doSendText("메시지 전송");

        //연결이 종료되어있으므로 연결이 성공한다. - 상태 변경
        textSender.doConnect();

        //연결이 되어있으므로 메시지 전송 성공한다.
        textSender.doSendText("연결 후 메시지 전송...");

        //연결이 되어있으므로 이미 연결되어있다고 출력한다.
        textSender.doConnect();

        //연결이 되어있으므로 연결이 정상적으로 종료된다. - 상태 변경
        textSender.doDisconnect();

        //연결이 종료되었으므로 메시지 전송이 실패한다.
        textSender.doSendText("연결 종료 후 메시지 전송...");
    }
}
