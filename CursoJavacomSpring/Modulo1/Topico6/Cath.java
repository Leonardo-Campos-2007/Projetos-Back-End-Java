import java.util.InputMismatchException;
import java.util.Scanner;

public class Cath {
    
    public static void main(String[] args) {

        try {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        
       
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida para idade ou altura. Por favor, insira um número válido." );
        }

        
    }

   

}

