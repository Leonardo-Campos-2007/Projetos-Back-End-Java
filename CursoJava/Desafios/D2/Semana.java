package Desafios.D2;

import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o dia da semana (1-7): ");
        int dia = entrada.nextInt();

        switch (dia) {
            case 1:

                System.out.println("Domingo");

                break;

            case 2:

                System.out.println("Segunda-feira");

                break;

            case 3:
                System.out.println("Terca-feira");

            case 4:

                System.out.println("Quarta-feira");

            case 5:

                System.out.println("Quinta-feira");

            case 6:

                System.out.println("Sexta-feira");

            case 7:

                System.out.println("Sabado");

                break;

            default:

                System.out.println("Valor inválido");
                break;
        }

        entrada.close();

    }

}