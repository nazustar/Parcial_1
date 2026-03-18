package Punto_2;

public class SpecializedObserver implements Observer {

    private String name;

    public SpecializedObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " processed update: " + message);
    }
}