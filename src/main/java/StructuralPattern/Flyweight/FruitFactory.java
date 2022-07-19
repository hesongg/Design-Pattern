package StructuralPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FruitFactory {
    private final Map<FruitName, Fruit> fruitMap = new HashMap<>();

    public Fruit getFruit(FruitName fruitName){

        Optional<Fruit> fruit = Optional.ofNullable(fruitMap.get(fruitName));

        return fruit.orElseGet(() -> createNewInstance(fruitName));
    }

    private Fruit createNewInstance(FruitName fruitName){
        System.out.println("신규 생성하는 과일 : " + fruitName);

        Fruit newFruit = new Fruit(fruitName);

        fruitMap.put(fruitName, newFruit);

        return newFruit;
    }

}
