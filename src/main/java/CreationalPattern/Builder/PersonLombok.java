package CreationalPattern.Builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class PersonLombok {
    //필수 파라미터
    private String name;

    //옵션 파라미터
    private int height;
    private int weight;
    private String hobby;


    public static PersonLombokBuilder builder(String name) throws IllegalAccessException {
        if(name == null){
            throw new IllegalAccessException("필수 파라미터 누락");
        }
        return new PersonLombokBuilder().name(name);
    }
}
