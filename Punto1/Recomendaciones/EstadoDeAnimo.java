package Punto1.Recomendaciones;

public class EstadoDeAnimo implements Recomendacion {
    //Estrategia concreta de la recomendación.
    @Override
    public void generarRecomendacion(){
        System.out.println("Recomendacion por estado de animo.");
    }

}
