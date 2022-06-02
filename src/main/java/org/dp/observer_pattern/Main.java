package org.dp.observer_pattern;

import org.dp.observer_pattern.Employer;
import org.dp.observer_pattern.EmployeeClass.*;

public class Main {
    public static void main(String[] args) {
        Employer master = new EmployerClass();

        Employee sam = new Sam();
        Employee david = new David();
        Employee sara = new Sara();

        master.resiterObserver(sam);
        master.resiterObserver(david);
        master.resiterObserver(sara);

        master.notifyObserver("Today Notice is 'blabla...' ");

        master.removeObserver(sara);

        master.notifyObserver("Today Notice is 'Sara is Fired..' ");

        master.resiterObserver( (String notice) -> System.out.println("Lambda received notice : " + notice));

        master.notifyObserver("Today Notice is 'This is Lambda Example !' ");
    }
}
