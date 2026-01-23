package Desafios.D1;

import java.util.Scanner;

public class Analisador {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = entrada.nextLine().toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {

            System.out.println("Eh vogal");

        }
        else if(letra.length() == 1 && !letra.matches("[aeiou]")) {
            System.out.println("Eh consoante");
        }
        else {
            System.out.println("Entrada invalida");

        }

        entrada.close();

    }
}
