//import java.util.*;
//
//public class Entrada implements Interfas{
//    int id;
//    String nombre;
//    String Pellido;
//    String zonaVenta;
//    String Venta;
//    String pais;
//
//
//    @Override
//    public int id() {
//        return id();
//    }
//
//    @Override
//    public String nombre() {
//        return nombre();
//    }
//
//    @Override
//    public String apellido() {
//        return apellido();
//    }
//
//    @Override
//    public String zonaVenta() {
//        return zonaVenta();
//    }
//
//    @Override
//    public String Ventas() {
//        return Ventas();
//    }
//
//    @Override
//    public String pais() {
//        return pais();
//    }
//}
//
public class Entrada {
    private int id;
    private String nombre;
    private double edad;

    public Entrada(int id, String nombre, double edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getedad() {
        return edad;
    }

    public void setedad(double edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localData=" + edad +
                '}';
    }
}