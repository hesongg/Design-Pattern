package StructuralPattern.decorator;

public class MouseDecorator extends ComputerDecorator{
    public MouseDecorator(Computer computer) {
        super(computer);
    }

    private String addMouse(){
        return " 마우스 추가.";
    }

    @Override
    public String decorate() {
        return super.decorate() + addMouse();
    }
}
