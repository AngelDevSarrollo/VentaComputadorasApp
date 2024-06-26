package org.example.mundopc;

import org.example.mundopc.modelo.Computadora;
import org.example.mundopc.modelo.Monitor;
import org.example.mundopc.modelo.Raton;
import org.example.mundopc.modelo.Teclado;
import org.example.mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
//Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        //System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        //System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);
        //Creamos un objeto de tipo computadora
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo",
                monitorLenovo,tecladoLenovo, ratonLenovo);
        //System.out.println(computadoraLenovo);

        //Objeto computadora
        Monitor monitorDell = new Monitor ( "Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb","Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell,
                ratonDell);

        //Creamos una orden

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        //Computadora Mac
        Monitor monitorMac = new Monitor("Mac", 27);
        Teclado tecladoMac = new Teclado("bluetooth", "Mac");
        Raton ratonMac = new Raton("bluetooth", "Mac");
        Computadora computadoraIMac = new Computadora("iMac", monitorMac,
                tecladoMac, ratonMac);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraIMac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostrarOrden();


    }
}