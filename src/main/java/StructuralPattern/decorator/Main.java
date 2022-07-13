package StructuralPattern.decorator;

public class Main {
    public static void main(String[] args) {
        Computer defaultComputer = new DefaultComputer();

        System.out.println("defaultComputer = " + defaultComputer.decorate());

        Computer computerWithKeyboard = new KeyboardDecorator(defaultComputer);

        System.out.println("computerWithKeyboard = " + computerWithKeyboard.decorate());

        Computer computerWithKeyboardAndMouse =
                new MouseDecorator(computerWithKeyboard);

        System.out.println("computerWithKeyboardAndMouse = " + computerWithKeyboardAndMouse.decorate());
        
        //new 로만 해보면
        Computer finalComputer = new MouseDecorator(new KeyboardDecorator(new DefaultComputer()));

        System.out.println("finalComputer.decorate() = " + finalComputer.decorate());
    }
}
