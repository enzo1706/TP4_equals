package TP5_hashSet;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        Producto p1 = new Producto("A1", "Laptop", 1200);
        Producto p2 = new Producto("A2", "Mouse", 25);
        Producto p3 = new Producto("A1", "Notebook", 1150); // mismo código que p1


        productos.add(p1);
        productos.add(p2);
        productos.add(p3);


        for (Producto p : productos) {
            System.out.println(p);
        }
    }

}
