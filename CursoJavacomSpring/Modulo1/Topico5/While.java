import java.util.concurrent.ThreadLocalRandom;

public class While {

    public static void main(String[] args) {

        double mesada = 100.0;

        

        while (mesada > 0) {

        double gasto = gastarMesada();
        mesada -= gasto;
        
        System.out.println("Gasto: " + gasto + " | Mesada restante: " + mesada);

          
        }

        System.out.println("A mesada acabou!");
        System.out.println("Fui gastar a mesada e acabei gastando tudo! Agora vou ter que pedir mais dinheiro para os meus pais.");
        System.out.println("Valor restante da mesada: " + mesada);
        
    
    }

    public static double gastarMesada() {

       return ThreadLocalRandom.current().nextDouble(5.0, 8.0); 
       
    }
    
}
