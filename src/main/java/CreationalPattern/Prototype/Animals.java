package CreationalPattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Animals implements Cloneable{
    private final List<String> amList;

    public Animals(){
        amList = new ArrayList<>();
    }

    public Animals(List<String> list){
        this.amList = list;
    }

    //예시는 단순한 List 데이터 추가이지만 실제로는 비용이 ㅁㄶ
    public void loadAnimalData(){
        amList.add("Cat");
        amList.add("Dog");
        amList.add("Bat");
        amList.add("Horse");
        amList.add("Mouse");
    }

    public List<String> getAmList() {
        return amList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<>();

        amList.forEach(tempList::add);

        return new Animals(tempList);
    }
}
