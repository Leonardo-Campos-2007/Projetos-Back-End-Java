import java.util.Scanner;

public class Conta {

   

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = entrada.nextInt();

        System.out.println("Digite o valor do depósito inicial: ");
        double deposito = entrada.nextDouble();

        System.out.println("Nome do titular: " + nome);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Depósito realizado no valor de R$ " + deposito);
    }

}
