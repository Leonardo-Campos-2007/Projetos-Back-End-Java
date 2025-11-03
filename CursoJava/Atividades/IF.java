import java.util.Scanner;

public class IF {
    public static void main(String[] args) {

        // adulto();

        // notas();

        // scanner();

        //votar();

        //cinema();

        //carteira();

        //numeros();

        //imparPar();



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

    public static void cinema(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Voce tem quantos anos :");

        int idade = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Voce eh estudante ? (sim/nao)");

        String resposta = entrada.nextLine().toLowerCase();

        if(idade < 18 || resposta.equals("sim")){
            System.out.println("Voce tem direito ao desconto");
        }
        else{
            System.out.println("Voce nao pode receber desconto");
        }

        entrada.close();

    }

    public static void carteira(){

        boolean temCarteira = false;

        if(!temCarteira){
            System.out.println("Voce nao pode dirigir");
        }
    }


    public static void numeros(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = entrada.nextInt();

        if(numero > 0){

            System.out.println("Eh positivo");

        }

        else if(numero == 0){
            System.out.println("0 não eh positivo nem negativo");
        }

        else{
            System.out.println("Eh negativo");
        }

        entrada.close();
    }

    public static void imparPar(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = entrada.nextInt();

        if(numero % 2 == 0 && numero != 0){
            System.out.println("eh par");
        }

        else if(numero == 0){
            System.out.println("0 nao eh par nem impar");
        }

        else{
            System.err.println("eh impar");
        }

        entrada.close();
    }

    


}
