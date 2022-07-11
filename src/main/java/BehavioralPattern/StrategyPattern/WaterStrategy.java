package BehavioralPattern.StrategyPattern;

public class WaterStrategy implements BeverageStrategy{
    private static final Beverage beverage = Beverage.WATER;

    @Override
    public Beverage get() {
        return beverage;
    }
}
