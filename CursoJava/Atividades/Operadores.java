public class Operadores {
    public static void main(String[] args) {

        // Como usar Operadores 

        OperadoresAritimeticos();

        System.out.println("-------------------------------------");

        OperadoresRelacionais();

        System.out.println("-------------------------------------");

        OperadoresLogicos();
        
    }

    public static void OperadoresAritimeticos() {

            int a = 10;

            int b = 20;

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));

            
        }

    public static void OperadoresRelacionais(){

         int a = 10;

         int b = 20;

            System.out.println("a == b ? " + (a == b));
            System.out.println("a != b = " + (a != b));
            System.out.println("a > b = " + (a > b));
            System.out.println("a < b = " + (a < b));
            System.out.println("a >= b = " + (a >= b));
            System.out.println("a <= b = " + (a <= b));

    }

    public static void OperadoresLogicos() {

        boolean temCarteira = true;

        int idade = 18;

        boolean podedirigir = (idade >= 18) && temCarteira;

        System.out.println("Pode digir? " + podedirigir); //true

    }

    
}
