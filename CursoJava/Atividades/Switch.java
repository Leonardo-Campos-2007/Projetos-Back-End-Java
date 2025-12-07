import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

       //cores();

       MarcarConsulta();

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

    public static void MarcarConsulta(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana que desaja marcar um horario: ");

        System.out.println("1-Domingo");
        System.out.println("2-Segunda");
        System.out.println("3-Terca");
        System.out.println("4-Quarta");
        System.out.println("5-Quinta");
        System.out.println("6-Sexta");
        System.out.println("7-Sabado");

        System.out.print("Qual dia deseja: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:

            System.out.println("A consulta foi marcada para Domingo");
                
                break;
            case 2:

            System.out.println("A consulta foi marcada para Segunda");
                
                break;
            case 3:

            System.out.println("A consulta foi marcada para Terca");
                
                break;
            case 4:

            System.out.println("A consulta foi marcada para Quarta");
                
                break;
            case 5:

            System.out.println("A consulta foi marcada para Quinta");
                
                break;
            case 6:

            System.out.println("A consulta foi marcada para Sexta");
                
                break;
            case 7:

            System.out.println("A consulta foi marcada para Sabado");
                
                break;
        
            default:

            System.out.println("Opcao invalida");
                break;
        }

        entrada.close();


    }

}
