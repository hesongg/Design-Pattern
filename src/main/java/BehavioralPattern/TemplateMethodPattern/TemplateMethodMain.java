package BehavioralPattern.TemplateMethodPattern;

public class TemplateMethodMain {
    public static void main(String[] args) {
        Coffee iceAmericano = new IceAmericano();
        Coffee iceHazelnutAmericano = new IceHazelnutAmericano();
        Coffee iceLatte = new IceLatte();

        iceAmericano.makeCoffee();
        iceHazelnutAmericano.makeCoffee();
        iceLatte.makeCoffee();
    }
}
