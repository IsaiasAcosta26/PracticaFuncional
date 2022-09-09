package ejercicio02;

import ejercicio01.Principal;
import groovy.json.JsonOutput;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.lang.Math.E;

public class principal02 {
    public static void main(String[] args) {



        final ArrayList<Empleado> empleado = new ArrayList<>();
        Empleado E01 = new Empleado(1, "Alexander ", "Perez ", 19, 0, 56000, "Santo Domingo", "Republica Dominicana");
        final Empleado E02 = new  Empleado(2, "Alfre ", "Perez ", 23, 1, 10000000, "Santo Domingo", "Republica Dominicana");
       final Empleado E03 = new Empleado(3, "Jose ", "Perez ", 23, 0, 25000000, "Francias", "Pariz");
//        E03 = E02;

       Empleado E04 = new Empleado(4, "Isaias ", "Acosta Lorenso ", 19, 0, 6000, "Santo Domingo", "Republica Dominicana");
        Empleado E05 = new Empleado(5, "Cristal ", "Acosta ", 18, 0, 100000, "Nueva York", "Estados Unidos");
        Empleado E06 = new Empleado(6, "Isaias ", "Polanco Acosta ", 56, 6, 600000, "texas", "Estados Unidos");
        Empleado E07 = new Empleado(7, "Rosmeri ", "Piquetua ", 18, 0, 300000, "Yucatan", "Mexico");
        Empleado E08 = new Empleado(8, "Monica ", "Lorenso Acosta ", 51, 2, 40000, "texas", "Mexico");
        Empleado E09 = new Empleado(9, "Isauara ", "Acosta Lorenso ", 21, 0, 34000, "Santo Domingo", "Republica Dominicana");
        Empleado E010 = new Empleado(10, "Seferina ", "Acosta", 61, 3, 0, "Yucatan", "Hirochima");
        Empleado E011 = new Empleado(11, "Miguel ", "Rodrigues ", 32, 14, 900, "San Juan", "Republica Dominicana");
        Empleado E012 = new Empleado(12, "Jose ", "Ramirez ", 28, 2, 432240, "San Juan", "Colombia");
        Empleado E013 = new Empleado(13, "Horiela ", "Putin ", 17, 0, 0, "Piragua Siri", "RD");
        Empleado E014 = new Empleado(14, "Miguela ", "De La Rosa ", 63, 8, 3403, "Mixico", "PR");
        Empleado E015 = new Empleado(15, "Luis ", "Jose ", 25, 0, 2000, "Santo Domingo", "RD");


        empleado.add(E01);
        empleado.add(E02);
        empleado.add(E03);
        empleado.add(E04);
        empleado.add(E05);
        empleado.add(E06);
        empleado.add(E07);
        empleado.add(E08);
        empleado.add(E09);
        empleado.add(E010);
        empleado.add(E011);
        empleado.add(E012);
        empleado.add(E013);
        empleado.add(E014);
        empleado.add(E015);




        empleado.stream()
                .filter(e -> e.getHijos() == 1)
                .peek( e -> e.setCiudad("Estados Unidos"))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");
        empleado.forEach(System.out::println);



//        Consumer<Integer> cal = e -> System.out.println(e * 2);

//        cal.accept(5);
//        Predicate<String> predic = e -> {
//            return e.equals("Java");
//        };
//
//        System.out.println(predic.test("Phaiton"));
//        System.out.println(predic.test("Java"));








//        Predicate<String> predic = e -> {
//            return e.equals("Java");
//        };
//
//        System.out.println(predic.test("java"));
//        System.out.println(predic.test("Java"));

//        empleado.stream()
//                .filter(E -> E.getId() > 8)
//                .map(E -> "Hola Mundo" + E.getNombre() + E.getApellido())
//                .forEach(System.out::println);

//        empleado.stream()
//                .filter(E -> E.getId() > 8)
//                .map(E -> " Hola" + E.getNombre() + E.getApellido())
//                .forEach(System.out::println);

//        empleado.forEach(System.out::println);
    }
}
