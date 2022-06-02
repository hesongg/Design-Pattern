package org.dp.observer_pattern;

// Observer 패턴에서의 Subject 인터페이스
public interface Employer {
    void resiterObserver(Employee employee);
    void removeObserver(Employee employee);

    void notifyObserver(String notice);
}
