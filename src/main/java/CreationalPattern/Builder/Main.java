package CreationalPattern.Builder;

public class Main {
    public static void main(String[] args) {
        Person peter = new Person.PersonBuilder("Peter")
                .setHeight(180)
                .setWeight(70)
                .build();

        System.out.println(peter.getName());
        System.out.println(peter.getHeight());
        System.out.println(peter.getWeight());
        System.out.println(peter.getHobby());
    }
}
