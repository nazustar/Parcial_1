package Punto_2;

public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer o1 = new SpecializedObserver("Carolina Niño");
        Observer o2 = new ConcreteObserver("Samuel Pérez");
        Observer o3 = new ConcreteObserver("Roberto Mena");
        subject.addObserver(o1);
        subject.addObserver(o2);
        subject.addObserver(o3);
        subject.setState("Llegaron vehiculos nuevos, se evidencia su llegada");
        subject.setState("Cambios en las rutas por mantenimiento");
        subject.setState("Congestion vehicular actual");
    }
}