package Punto_2;

public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}