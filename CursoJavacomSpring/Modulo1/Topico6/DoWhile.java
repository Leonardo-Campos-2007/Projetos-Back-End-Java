import java.util.Random;

public class DoWhile {

    public static void main(String[] args) {

        do {
            System.out.println("Tocando...");
        } while (tocando());

        System.out.println("Telefone atendido!!");
        
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu?? " + atendeu);
        return ! atendeu;
    }
}