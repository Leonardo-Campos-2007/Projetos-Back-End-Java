import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.print("Seu serviço: ");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.print("Digite seu nome e seus serviços: ");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        
       if((servico == movel) && (entradaCliente == Alice,movel,fixa)){
         System.out.print("Sim")
       }
       if((servico == fixa) && (entradaCliente == Bob,movel,tv)){
          System.out.print("Nao")
       }
       if((servico == tv) && (entradaCliente == Carol,movel,fixa,tv)){
         System.out.print("Sim")
       }
        
        scanner.close();
    }
}
