package CreationalPattern.Prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animals animals1 = new Animals();
        animals1.loadAnimalData();

        List<String> aniList1 = animals1.getAmList();

        aniList1.forEach(System.out::println);

        //clone을 통해 비용 절감 가능
        Animals animals2 = (Animals) animals1.clone();

        List<String> aniList2 = animals2.getAmList();

        aniList2.add("Zebra");

        aniList2.forEach(System.out::println);
    }
}
