package Punto1.Recomendaciones;

public class Historial implements Recomendacion{
    //Estrategia concreta de la recomendación.
    @Override
    public void generarRecomendacion(){
        System.out.println("Recomendacion por historial.");
    }
}
