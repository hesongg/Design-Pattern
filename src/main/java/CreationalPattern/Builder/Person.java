package CreationalPattern.Builder;

public class Person {
    //필수 파라미터
    private final String name;

    //옵션 파라미터
    private final int height;
    private final int weight;
    private final String hobby;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getHobby() {
        return hobby;
    }

    private Person(PersonBuilder builder){
        this.name = builder.name;
        this.height = builder.height;
        this.weight = builder.weight;
        this.hobby = builder.hobby;
    }

    public static class PersonBuilder {
        //필수 파라미터
        private final String name;

        //옵션 파라미터
        private int height;
        private int weight;
        private String hobby;

        public PersonBuilder(String name){
            this.name = name;
        }

        public PersonBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public PersonBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PersonBuilder setWeight(String hobby) {
            this.hobby = hobby;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
