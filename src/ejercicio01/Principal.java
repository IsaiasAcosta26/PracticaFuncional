package ejercicio01;

import java.util.function.Function;

public class Principal {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.setTitulo("El Alquimista");
        libro1.setISBN(978840818);
        libro1.setAutor("Paulo Coelho");
        libro1.setPagina(192);

        libro2.setTitulo("La quinta montaña");
        libro2.setISBN(958840810);
        libro2.setAutor("Paulo Coelho");
        libro2.setPagina(233);

        System.out.println(libro1 + "\n");
        System.out.println(libro2 + "\n");

        if (libro1.getPagina() > libro2.getPagina()) {
            System.out.println("El libro 1 tiene " + libro1.getPagina() +
                    " paginas siendo mayor a libro 2");
            System.out.println(libro1);
        } else {
            System.out.println("El libro 2 tiene " + libro2.getPagina() +
                    " paginas siendo mayor a libro 1 ");
            System.out.println(libro2);
        }
    }
}
