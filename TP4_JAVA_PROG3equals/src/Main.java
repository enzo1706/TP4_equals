import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        Producto p1 = new Producto("A1", "Laptop", 1200);
        Producto p2 = new Producto("A2", "Mouse", 25);
        Producto p3 = new Producto("A1", "Notebook", 1150); // mismo código que p1

        agregarProducto(productos, p1);
        agregarProducto(productos, p2);
        agregarProducto(productos, p3);


        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public static void agregarProducto(List<Producto> lista, Producto nuevo) {
        if (!lista.contains(nuevo)) {
            lista.add(nuevo);
            System.out.println("Producto agregado: " + nuevo.getNombre());
        } else {
            System.out.println("Producto duplicado (no agregado): " + nuevo.getNombre());
        }
    }
}