package BehavioralPattern.TemplateMethodPattern;

public abstract class IceCoffee implements Coffee{
    public void makeCoffee() {
        boilWater();
        putEspresso();
        putIce();
        putExtra();
    }

    public void boilWater() {
        System.out.println("물을 끓인다.");
    }

    public void putEspresso() {
        System.out.println("커피 원액을 넣는다.");
    }

    private void putIce() {
        System.out.println("얼음을 넣는다.");
    }

    public abstract void putExtra();
}
