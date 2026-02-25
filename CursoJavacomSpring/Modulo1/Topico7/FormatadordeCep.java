public class FormatadordeCep {
    public static void main(String[] args) {

        String cep = formatarCep("00000000");
        System.out.println(cep);
    
        
        
    }

   
    static String formatarCep(String cep) throws CepInvalidoExcepition {
        if (cep == null || cep.length() != 8) {
            throw new CepInvalidoExcepition("Cep inválido");
        }
        return  "" + cep.substring(0, 5) + "-" + cep.substring(5);
    }


}
