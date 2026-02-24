package Modulo1.Topico4;

public class SmartTV {

    public static void main(String[] args) {

        System.out.println(ligaredesligarTV(true));

        AumentarVolume(1);

        System.out.println("O volume esta em " + AumentarVolume(0));

       int Canal = 0;


        System.out.println("Esta no Canal " + MudarCanal(Canal));

    }

    public static boolean ligaredesligarTV(boolean botao) {

        if (botao == true) {
            System.out.println("A TV esta ligada");

        }

        if (botao == false) {

            System.out.println("A TV esta desligada");

        }

        return true;

    }

    public static int AumentarVolume(int AumentarVolume){

        return +1;
    }

    public static int AbaixarVolume(int AbaixarVolume){

        return -1;
    }

    public static int MudarCanal(int Canal){

        return Canal + 1;
    }

}
