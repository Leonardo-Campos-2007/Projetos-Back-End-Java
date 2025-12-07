import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        cores();

    }

    public static void cores() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua cor favorita?");

        System.out.println("1-Azul");
        System.out.println("2-Verde");
        System.out.println("1-Vermelho");

        System.out.print("Digite uma opcao: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:

                System.out.println("Sua cor favorita eh Azul");

                break;
            case 2:

                System.out.println("Sua cor favorita eh Verde");

                break;
            case 3:

                System.out.println("Sua cor favorita eh Vermelho");

                break;

            default:

                System.out.println("Opcao invalida");
                break;
        }

        entrada.close();

    }

}
