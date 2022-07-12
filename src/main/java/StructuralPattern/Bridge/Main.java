package StructuralPattern.Bridge;

public class Main {

    public static void main(String[] args) {
        Shape blackCircle = new Circle(new Black());
        Shape blueSquare = new Square(new Blue());
        Shape whiteTriangle = new Triangle(new White());

        blackCircle.applyShape();
        blueSquare.applyShape();
        whiteTriangle.applyShape();

        /*
         출력 결과

         검은색 동그라미를 출력한다.
         파란색 사각형을 출력한다.
         흰색 사각형을 출력한다.
        */

    }
}
