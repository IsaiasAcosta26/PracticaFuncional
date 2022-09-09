package ejercicio02;

public class Empleado {

//    Atributos
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int hijos;
    private double monto;
    private String ciudad;
    private String pais;

//    Comtructor
    public Empleado(int id, String nombre, String apellido, int edad, int hijos, double monto, String ciudad, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hijos = hijos;
        this.monto = monto;
        this.ciudad = ciudad;
        this.pais = pais;
    }


//    set y get
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public double getMonto() {
        return monto;
    }

    public final void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;



    }
    //        toString()
    public String toString(){
        return "\n" +
                "id = " + id +
                " Nombre = " + nombre +
                " Apellido = " + apellido +
                " Edad = " + edad +
                " Hijo = " + hijos +
                " Monto = " + monto +
                " Ciudad = " + ciudad +
                " Pais = " + pais;
    }
}
