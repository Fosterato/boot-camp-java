public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos primitivos
        
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se comecar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L;  // se comecar com zero, talvez tenha que ser outro tipo, precisa terminar com um L 
        float pi = 3.14F; // sempre colocar um zero no final
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_DE_PI = 3.14; // variaveis constantes 
    }
}
