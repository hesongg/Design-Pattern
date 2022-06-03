package CreationalPattern.Singleton;

/**
 * Java 진영에서 가장 많이사용되는 LazyHolder 를 사용하는 싱글톤 패턴 <p>
 * private static class인 LazyHolder 안에 instance를 final로 선언
 * <p></p>
 * JVM 의 클래스 초기화 과정에서 원자성을 보장하는 원리를 이용하는 방식이다.<p>
 * getInstance() 가 호출되면 LazyHolder의 instance 변수에 접근 ->
 * 이때 LazyHolder 가 static class 이기 때문에 클래스의 초기화 과정이 이루어짐 </p>
 * Synchronized 를 사용하지 않아도 JVM 자체가 보장하는 원자성을 사용하여 Thread Safe하게 싱글톤 패턴을 구현
 */

public class SingletonClassLazyHolder {
    //생성자를 외부에서 호출하지 못하게 private로 지정한다.
    private SingletonClassLazyHolder(){}

    // private static inner class 인 LazyHolder
    private static class LazyHolder {
        // LazyHolder 클래스 초기화 과정에서 JVM이 Thread=Safe 하게 instance 를 생성
        private static final SingletonClassLazyHolder instance = new SingletonClassLazyHolder();
    }

    // LazyHolder 의 instance 에 접근하여 반환
    public static SingletonClassLazyHolder getInstance(){
        return LazyHolder.instance;
    }

    public void print(){
        System.out.println("I'm Singleton - LazyHolder");
    }
}
