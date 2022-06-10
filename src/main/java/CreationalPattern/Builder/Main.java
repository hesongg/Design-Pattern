package CreationalPattern.Builder;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("peter test");

        Person peter = new Person.PersonBuilder("Peter")
                .setHeight(180)
                .setWeight(70)
                .build();

        System.out.println(peter.getName());
        System.out.println(peter.getHeight());
        System.out.println(peter.getWeight());
        System.out.println(peter.getHobby());


        /**
         * lombok 사용해본 예제
         * @Builder 사용 시 단순하게 객체를 생성할때는 문제가 없을 것 같지만..
         * 복잡하게 객체를 생성하는 내용이 있다면 그냥 커스텀해서 Builder패턴을 구현하는게 좋을 것 같음
         */
        //@Builder 롬복을 사용할때 이렇게 생성자로 객체를 생성하는것을 막기위해서
        //@AllArgsConstructor(access = AccessLevel.PRIVATE) 부분 추가 필요
        //PersonLombok lom = new PersonLombok("lom", 170, 60, "soccer");

        System.out.println("lom1 test");

        PersonLombok lom1 = PersonLombok.builder("lom1")
                .name("lomlmo") // 롬복 문제점 1. 필수 파라미터를 받으려고 .builder 를 만들었지만 .name으로 다시 정의 가능
                .weight(100)
                .build();

        System.out.println(lom1.getName());
        System.out.println(lom1.getHeight());
        System.out.println(lom1.getWeight());
        System.out.println(lom1.getHobby());
        
        
        //@Builder 롬복으로 구현하니 문제점..
        System.out.println("lom2 test");

        // 롬복 문제점 2. 필수 파라미터를 받으려고 .builder 를 만들었지만.. 이렇게 객체생성 필수 파라미터 무시할 가능성이 있음
        PersonLombok lom2 = new PersonLombok.PersonLombokBuilder()
                .height(180)
                .build();

        System.out.println(lom2.getName());
        System.out.println(lom2.getHeight());
        System.out.println(lom2.getWeight());
        System.out.println(lom2.getHobby());
    }
}
