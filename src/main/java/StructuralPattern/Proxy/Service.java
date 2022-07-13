package StructuralPattern.Proxy;

import java.util.Random;

public class Service implements ServiceInterface{
    @Override
    public void doService() {
        //특정 서비스를 수행한다. 수행시간이 1~3초만큼 랜덤으로 걸린다고 하자.
        Random random = new Random();

        int performanceTime = random.nextInt(2000) + 1000;

        try{
            System.out.println("Real Service Start!");
            Thread.sleep(performanceTime);
            System.out.println("Real Service End!");
        }catch (InterruptedException e){
            System.out.println("Service Fail");
        }

    }
}
