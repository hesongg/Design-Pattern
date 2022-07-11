package BehavioralPattern.StrategyPattern;

public class CokeStrategy implements BeverageStrategy{
    private static final Beverage beverage = Beverage.COKE;

    @Override
    public Beverage get() {
        return Beverage.COKE;
    }
}
