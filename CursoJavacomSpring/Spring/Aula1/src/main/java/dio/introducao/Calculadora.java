package dio.introducao;

import org.springframework.stereotype.Component;


@Component
public class Calculadora {

   
    public static double soma(double numero1, double numero2){
        return numero1 + numero2;
        
    }
    
}
