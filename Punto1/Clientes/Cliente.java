package Punto1.Clientes;

import Punto1.Recomendaciones.Recomendacion;

public abstract class Cliente {
    public Recomendacion recomendacion;

    public void obtenerRecomendaciones(){
        recomendacion.generarRecomendacion();
    }
}
