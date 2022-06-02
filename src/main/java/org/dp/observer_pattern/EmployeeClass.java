package org.dp.observer_pattern;

public class EmployeeClass {

    public static class Sam implements Employee {
        @Override
        public void notify(String notice) {
            System.out.println("Sam received notice : " + notice);
        }
    }

    public static class David implements Employee {
        @Override
        public void notify(String notice) {
            System.out.println("David received notice : " + notice);
        }
    }

    public static class Sara implements Employee {
        @Override
        public void notify(String notice) {
            System.out.println("Sara received notice : " + notice);
        }
    }
}
