package CreationalPattern.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonClass sc = SingletonClass.getInstance();

        sc.print();

        SingletonClassLazyHolder sclh = SingletonClassLazyHolder.getInstance();

        sclh.print();
    }
}
