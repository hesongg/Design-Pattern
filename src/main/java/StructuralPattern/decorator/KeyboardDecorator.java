package StructuralPattern.decorator;

public class KeyboardDecorator extends ComputerDecorator{
    public KeyboardDecorator(Computer computer) {
        super(computer);
    }

    private String addKeyboard(){
        return " 키보드 추가.";
    }

    @Override
    public String decorate() {
        return super.decorate() + addKeyboard();
    }
}
