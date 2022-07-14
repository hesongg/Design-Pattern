package StructuralPattern.Proxy;

public class ServiceProxy implements ServiceInterface{

    private ServiceInterface service;

    @Override
    public void doService() {
        //프록시 객체로 서비스 수행시간을 계산하고 로그를 남기는 기능을 구현한다.
        System.out.println("::: Start Proxy :::");

        long startTime = System.currentTimeMillis();

        if(service == null){
            service = new Service();
        }

        service.doService();

        long endTime = System.currentTimeMillis();

        long result = endTime - startTime;

        System.out.println("::: End Proxy ::: Service Performance Time = " + result + " ms");
    }
}
