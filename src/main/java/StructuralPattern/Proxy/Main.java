package StructuralPattern.Proxy;

public class Main {
    public static void main(String[] args) {
        //ServiceInterface service = new Service();
        //service.doService();

        ServiceInterface serviceProxy = new ServiceProxy();
        serviceProxy.doService();
    }
}
