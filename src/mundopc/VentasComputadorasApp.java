package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentasComputadorasApp {
    public static void main(String[] args) {
        // Crear objetos
        Raton ratonHP = new Raton("USB" , "HP");
        //System.out.println(ratonHP);
        Teclado tecladoHP = new Teclado("USB" , "HP");
        //System.out.println(tecladoHP);
        Monitor monitorHP = new Monitor("HP" , 32);
        //System.out.println(monitorHP);
        //Crear objetos tipo Computadora
        Computadora computadoraHP = new Computadora("Computadora HP" , monitorHP ,
                tecladoHP , ratonHP);
        //System.out.println(computadoraHP);

        //Orden Computadora Dell
        Raton ratonDell = new Raton("Bluetooth" , "Dell");
        Teclado tecladoDell = new Teclado("Bluetooth" , "Dell");
        Monitor monitorDell = new Monitor("Dell" , 24);
        Computadora computadoraDell = new Computadora("Computadora Dell" , monitorDell
                , tecladoDell ,ratonDell);
        // Orden Computadora Mac
        Raton ratonMac = new Raton("USB" , "Mac");
        Teclado tecladoMac = new Teclado("USB" , "Mac");
        Monitor monitorMac = new Monitor("Mac" , 27);
        Computadora computadoraMac = new Computadora("Computadora Mac" , monitorMac
                , tecladoMac ,ratonMac);



        // Se crea una Orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        // Se crea una segunda orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraMac);
        orden2.agregarComputadora(computadoraHP);
        System.out.println();
        orden2.mostrarOrden();






    }
}
