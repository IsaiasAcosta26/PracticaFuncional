public class Entrada1 {
    private int id;
    private String producto;
    private double precio;

    public Entrada1(int id, String producto, double precio) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Entrada1{" +
                "producto='" + producto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
