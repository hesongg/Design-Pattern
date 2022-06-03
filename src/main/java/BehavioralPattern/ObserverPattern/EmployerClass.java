package BehavioralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployerClass implements  Employer{
    private final List<Employee> employees = new ArrayList<>();

    @Override
    public void resiterObserver(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void removeObserver(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void notifyObserver(String notice) {
        for(Employee e : employees){
            e.notify(notice);
        }
    }
}
