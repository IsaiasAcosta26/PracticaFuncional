import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Entrada> person = new ArrayList<>();
        ArrayList<Entrada1> products = new ArrayList<>();

        Entrada p1 = new Entrada(1, "Isaias", 19.6);
        Entrada p2 = new Entrada(2, "Cristal", 18);
        Entrada p3 = new Entrada(3, "Jose", 23);
        Entrada p4 = new Entrada(4, "Alfre", 23);
        Entrada p5 = new Entrada(5, "Rudy", 20);
        Entrada p6 = new Entrada(6, "Isaias", 19.5);
        Entrada p7 = new Entrada(7, "Cristal", 18);
        Entrada p8 = new Entrada(8, "Jose", 23);
        Entrada p9 = new Entrada(9, "Alfre", 23);
        Entrada p10 = new Entrada(10, "Rudy", 20);
        Entrada p11 = new Entrada(11, "Isaias", 19);
        Entrada p12 = new Entrada(12, "Cristal", 18);
        Entrada p13 = new Entrada(13, "Jose", 23);
        Entrada p14 = new Entrada(14, "Alfre", 23);
        Entrada p15 = new Entrada(15, "Rudy", 20);

//        Entrada1 pr1 = new Entrada1(1, "Ceviche", 15.09);
//        Entrada1 pr2 = new Entrada1(2, "Chilaquiles", 25.50);
//        Entrada1 pr3 = new Entrada1(3, "Bnadejas pais", 35.50);
//        Entrada1 pr4 = new Entrada1(4, "Ceviche", 15.0);

        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        person.add(p5);
        person.add(p6);
        person.add(p7);
        person.add(p8);
        person.add(p9);
        person.add(p10);
        person.add(p11);
        person.add(p12);
        person.add(p13);
        person.add(p14);
        person.add(p15);

//        person.stream()
//                .filter(elem -> elem.getId() > 8)
//                .forEach(System.out::println);
//
//        Predicate<Entrada> lis = (elem -> elem.getNombre().equals("Rudy"));
//
//        List<Entrada> lista = person.stream()
//                .filter(lis)
//                .collect(Collectors.toList());
//
//        lista.forEach( elem ->
//                System.out.println(elem.getNombre() + " " + elem.getedad())
//        );



//        products.add(pr1);
//        products.add(pr2);
//        products.add(pr3);
//        products.add(pr4);

//        List<String> list = person.stream()
//                .map(p -> p.getNombre())
//                .collect(Collectors.toList());
//        list.forEach(System.out::println);

//        person.forEach(System.out::println);

//        List<Integer> myList = Arrays.asList(1, 2, 4, 6, 8, 10);
//
//        myList.stream()
//
//                .filter(elemen -> elemen > 6)
//                .map(elemen ->  )
//                .forEach(System.out::println);


    }
}

