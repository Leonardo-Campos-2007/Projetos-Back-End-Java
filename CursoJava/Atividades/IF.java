import java.util.Scanner;

public class IF {
    public static void main(String[] args) {

        // adulto();

        // notas();

        // scanner();

        // votar();

        // cinema();

        // carteira();

        // numeros();

        // imparPar();

        // maiormenor();

        // intervalo();

        // multiplo3e5();

        // pn0();

        //bixesto();

    }

    public static void adulto() {

        int idade = 18;

        if (idade >= 18) {

            System.out.println("Você eh de maior");

        }
    }

    public static void notas() {

        double nota = 1.0;

        if (nota >= 7.0) {

            System.out.println("Está aprovado na matéria");

        }

        else if (nota >= 5.0) {

            System.out.println("Esta de recuperação");

        }

        else {

            System.out.println("Esta reprovado");
        }

    }

    public static void scanner() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota  do aluno: ");

        double nota = entrada.nextDouble();

        if (nota >= 7.0) {

            System.out.println("Está aprovado na matéria");

        }

        else if (nota >= 5.0) {

            System.out.println("Esta de recuperação");

        }

        else {

            System.out.println("Esta reprovado");
        }

        entrada.close();

    }

    public static void votar() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua idade: ");

        int idade = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Voce eh brasileiro ou naturalizado? (sim/nao)");

        String nacionalidade = entrada.nextLine().toLowerCase();

        if (idade >= 16 && nacionalidade.equals("sim")) {

            System.out.println("Voce pode votar");

        } else {
            System.out.println("Voce  não pode votar");
        }

        entrada.close();

    }

    public static void cinema() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Voce tem quantos anos :");

        int idade = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Voce eh estudante ? (sim/nao)");

        String resposta = entrada.nextLine().toLowerCase();

        if (idade < 18 || resposta.equals("sim")) {
            System.out.println("Voce tem direito ao desconto");
        } else {
            System.out.println("Voce nao pode receber desconto");
        }

        entrada.close();

    }

    public static void carteira() {

        boolean temCarteira = false;

        if (!temCarteira) {
            System.out.println("Voce nao pode dirigir");
        }
    }

    public static void numeros() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = entrada.nextInt();

        if (numero > 0) {

            System.out.println("Eh positivo");

        }

        else if (numero == 0) {
            System.out.println("0 não eh positivo nem negativo");
        }

        else {
            System.out.println("Eh negativo");
        }

        entrada.close();
    }

    public static void imparPar() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = entrada.nextInt();

        if (numero % 2 == 0 && numero != 0) {
            System.out.println("eh par");
        }

        else if (numero == 0) {
            System.out.println("0 nao eh par nem impar");
        }

        else {
            System.err.println("eh impar");
        }

        entrada.close();
    }

    public static void maiormenor() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite outro numero: ");
        double numero2 = entrada.nextDouble();

        if (numero1 > numero2) {

            System.out.println(numero1 + " eh maior que " + numero2);

        }

        if (numero1 == numero2) {

            System.out.println(numero1 + " eh igual a " + numero2);

        }

        if (numero1 < numero2) {

            System.out.println(numero2 + " veh maior que " + numero1);

        }

        entrada.close();
    }

    public static void intervalo() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        if (numero >= 10 && numero <= 100) {

            System.out.println("O numero digitado está dentro do intervalo de 10 a 100");

        } else {
            System.out.println("O numero digitado não está presete no intervalo de 10 a 100");
        }

        entrada.close();

    }

    public static void multiplo3e5() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero : ");
        int numero = entrada.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Este numero eh divisivel por 3 e 5 ");
        } else {
            System.out.println("Este numero não eh divisivel por 3 e 5");
        }

        entrada.close();

    }

    public static void pn0() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("Este numero eh positivo");
        } else if (numero == 0) {
            System.out.println("O numero digitado eh 0");
        } else {
            System.out.println("Este numero eh negativo");
        }

        entrada.close();
    }

    public static void bixesto() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = entrada.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {

            System.out.println("Eh bixesto");

        } else {
            System.out.println("Não eh bixesto");
        }

        entrada.close();

    }

}
