package BehavioralPattern.StrategyPattern;

public class VendingMachine {
    public void getBeverage(BeverageStrategy beverageStrategy){
        System.out.println("get beverage : " + beverageStrategy.get());
    }
}
