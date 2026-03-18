package Punto1;

import Punto1.Clientes.Cliente1;
import Punto1.Clientes.Cliente2;
import Punto1.Recomendaciones.stateDeAnimo;
import Punto1.Recomendaciones.TiempoDisponible;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de la empresa StreamZone");

        System.out.println("Recomendaciones para el cliente #1:");
        Cliente1 cliente1 = new Cliente1();
        //Uso de Recomendacion por popularidad.
        cliente1.obtenerRecomendaciones();
        //Cambio en tiempo de ejecucion.
        System.out.println("Ahora el cliente 1 desea que se recomiende por state de animo:");
        cliente1.recomendacion = new stateDeAnimo();
        cliente1.obtenerRecomendaciones();

        System.out.println("Recomendaciones para el cliente #2:");
        Cliente2 cliente2 = new Cliente2();
        //Uso de recomendacion por historial.
        cliente2.obtenerRecomendaciones();
        //Cambio en tiempo de ejecucion.
        System.out.println("Ahora el cliente 2 desea que se recomiende por el tiempo disponible:");
        cliente2.recomendacion = new TiempoDisponible();
        cliente2.obtenerRecomendaciones();
    }

}
