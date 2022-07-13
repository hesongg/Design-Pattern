package StructuralPattern.decorator;

public class DefaultComputer implements Computer{

    @Override
    public String decorate() {
        return "컴퓨터의 본체가 있다.";
    }
}
