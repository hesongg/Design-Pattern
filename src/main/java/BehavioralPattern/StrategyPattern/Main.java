package BehavioralPattern.StrategyPattern;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // 구현해놓은 클래스를 이용하여 각각 다른 전략을 적용
        vendingMachine.getBeverage(getCoffee());
        vendingMachine.getBeverage(getCoke());
        vendingMachine.getBeverage(getWater());

        //람다 이용
        vendingMachine.getBeverage(
                () -> Beverage.CIDAR
        );
    }

    private static WaterStrategy getWater() {
        return new WaterStrategy();
    }

    private static CokeStrategy getCoke() {
        return new CokeStrategy();
    }

    private static CoffeeStrategy getCoffee() {
        return new CoffeeStrategy();
    }
}
