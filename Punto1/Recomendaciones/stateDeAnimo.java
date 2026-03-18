package Punto1.Recomendaciones;

public class stateDeAnimo implements Recomendacion {
    //Estrategia concreta de la recomendación.
    @Override
    public void generarRecomendacion(){
        System.out.println("Recomendacion por state de animo.");
    }

}
