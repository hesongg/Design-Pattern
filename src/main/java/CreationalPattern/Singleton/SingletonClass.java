package CreationalPattern.Singleton;

public class SingletonClass {
    //Instance
    private static SingletonClass instance = new SingletonClass();

    //생성자를 외부에서 호출하지 못하게 private로 지정한다.
    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("I'm Single");
    }
}
