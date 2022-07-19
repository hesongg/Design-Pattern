package StructuralPattern.Flyweight;

public class Main {

    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();

        Fruit apple1 = fruitFactory.getFruit(FruitName.APPLE);
        Fruit apple2 = fruitFactory.getFruit(FruitName.APPLE);
        Fruit apple3 = fruitFactory.getFruit(FruitName.APPLE);

        Fruit banana1 = fruitFactory.getFruit(FruitName.BANANA);
        Fruit banana2 = fruitFactory.getFruit(FruitName.BANANA);

        Fruit melon1 = fruitFactory.getFruit(FruitName.MELON);
        Fruit melon2 = fruitFactory.getFruit(FruitName.MELON);

        //출력해보면, 각 Fruit 인스턴스가 한번만 생성되었고, Object Id가 각 과일마다 동일한 것을 확인 가능하다.
        apple1.printInfo();
        apple2.printInfo();
        apple3.printInfo();
        banana1.printInfo();
        banana2.printInfo();
        melon1.printInfo();
        melon2.printInfo();
    }
}
