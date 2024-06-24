package org.example.mundopc;

import org.example.mundopc.modelo.Monitor;
import org.example.mundopc.modelo.Raton;
import org.example.mundopc.modelo.Teclado;

public class Main {
    public static void main(String[] args) {
//Crear objetos
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);



    }
}