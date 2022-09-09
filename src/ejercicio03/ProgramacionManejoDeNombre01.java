package ejercicio03;

import java.util.Scanner;

public class ProgramacionManejoDeNombre01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre1, frase1;
        int NuevoNum1 = 0;

        String nombre2, frase2;
        int NuevoNum2 = 0;

        String nombre3, frase3;
        int NuevoNum3 = 0;

//        estraer datos
        System.out.println("Digite el nombre de 3 integrantes de tu familia o amigos: ");

        System.out.println("Digite un nombre: ");
        nombre1 = entrada.nextLine();

        System.out.println("Digita otro nombre: ");
        nombre2 = entrada.nextLine();

        System.out.println("Digite otro nombre: ");
        nombre3 = entrada.nextLine();


//        contador
        for (int i = 0; i < nombre1.length(); i++) {
            NuevoNum1++;
            for (int j = 0; j < nombre2.length(); j++) {
                NuevoNum2++;
                for (int y = 0; y < nombre3.length(); y++) {
                    NuevoNum3++;
                }
            }
        }

        NuevoNum1 += -1;
        NuevoNum2 += -1;
        NuevoNum3 += -1;


        frase1 = nombre1.substring(NuevoNum1, NuevoNum1 + 1);
        frase2 = nombre1.substring(NuevoNum2, NuevoNum2 + 1);
        frase3 = nombre1.substring(NuevoNum3, NuevoNum3 + 1);

//      mostrar datos
        System.out.print(nombre1.charAt(1) + "." + frase1 + "_" +
                nombre2.charAt(1) + "." + frase2 + "-" +
                nombre3.charAt(1) + "." + frase3);


    }
}
