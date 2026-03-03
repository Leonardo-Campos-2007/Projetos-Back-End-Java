package dio.introducao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAPP implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Soma: " + Calculadora.soma(10, 20));
    }

   
}
