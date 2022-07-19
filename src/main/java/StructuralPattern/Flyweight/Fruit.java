package StructuralPattern.Flyweight;

public class Fruit {
    private final FruitName fruitName;

    public Fruit(FruitName fruitName) {
        this.fruitName = fruitName;
    }

    void printInfo(){
        System.out.println("::: Print Info ::: Fruit = " + fruitName + " , Object = " + this);
    }
}
