package StructuralPattern.decorator;

public abstract class ComputerDecorator implements Computer{
    Computer computer;

    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String decorate() {
        return computer.decorate();
    }
}
