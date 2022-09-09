package manejo;

import groovy.sql.Sql;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaManejoDeNombre {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);
/*
        String nombre1 = "Jose ", frase1;
        String nombre2 = "Alfre", frase2;
        String nombre3 = "Rudy", frase3;

        String may1 = nombre1.toUpperCase();
        String may2 = nombre2.toUpperCase();
        String may3 = nombre3.toUpperCase();

        frase1 = nombre1.substring(2, 4);
        frase2 = nombre2.substring(3, 5);
        frase3 = nombre3.substring(2, 4);


        System.out.print(may1.charAt(1) + "." + frase1 + "_" +
                may2.charAt(1) + "." + frase2 + "-" +
                may3.charAt(1) + "." + frase3);*/

        System.out.println(nameOfFamily("andres","juan" , "Alex"));

    }

    static String nameOfFamily(String nameOne, String nameTwo, String nameTree) {
        String upperCaseNameOne = nameOne.substring(0, 1)
                .toUpperCase().concat(".") + nameOne.substring(nameOne.length() - 2);

        return upperCaseNameOne;
    }
}
