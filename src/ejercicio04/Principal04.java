package ejercicio04;

//        Dada una cadena,devuelve una nueva cadena donde los últimos
//        3caracteres ahora están en mayúsculas.
//        Si la cadena tiene menos de 3caracteres,
//        escriba en mayúscula lo que esté allí.
//        Tenga en cuenta que
//        str.toUpperCase()devuelve la versión en mayúsculas de una cadena

import java.util.Locale;

public class Principal04 {
    public static void main(String[] args) {
        System.out.println(Principal04.Cadena("Hola esto es una cadena de texto"));
    }
    static String Cadena(String cadena) {
        String cadenaDeTexto = cadena.substring(cadena.length() - 3) .toUpperCase();
        return cadenaDeTexto;
    }

}
