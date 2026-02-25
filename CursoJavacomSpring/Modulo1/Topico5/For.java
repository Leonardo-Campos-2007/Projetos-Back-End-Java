public class For {
    public static void main(String[] args) {

        String Alunos [] = {"João", "Maria", "Pedro", "Ana", "Carlos"};

        for (int i = 0 ; i < Alunos.length; i++) {

            if(i == 2){

                continue;
            
            }

            System.out.println(Alunos[i]);
        }
        
    
    }
}