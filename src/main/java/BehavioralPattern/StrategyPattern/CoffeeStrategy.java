package BehavioralPattern.StrategyPattern;

public class CoffeeStrategy implements BeverageStrategy{
    private static final Beverage beverage = Beverage.COFFEE;

    @Override
    public Beverage get() {
        return beverage;
    }
}
