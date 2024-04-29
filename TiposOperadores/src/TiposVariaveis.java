//import java.sql.Date;

public class TiposVariaveis {
  
    // operador de atribuicao
        String nome = "Yuri";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        //Date dataNascimento = new Date(); classes que representam tipos, construtores
      
    // operadores aritmeticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
  
        String nomeCompleto = "Linguagem" + "Java";

  
    // concatenacao
        public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

    // invertendo valores

        int numero = 5;

        
        ++numero; // soma 1 antes de imprimir

        numero = - numero;

        System.out.println(numero);

        numero = numero * - 1;

        System.out.println(numero);

    // operadores ternarios

    //<Expressao Condicional> ? <Caso consicao seja true> : <Caso Condicao seja false>

    
    int a, b;

    a = 6;
    b = 6;

    String resultado = "";

    if (a==b)
        resultado = "verdadeiro";
    else
        resultado = "falso";
     
    // usando ternarios
        resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);

    // operadores relacionais

        String nomeUm = "Yuri";
        String nomeDois =  new String("Yuri");

        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condicao e verdadeira");
        }

        System.out.println("numeroUm e igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm e diferente a numeroDois? " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("numeroUm e maior que numeroDois?" + simNao);

    // operadores logicos

        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("As duas condicoes sao verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condicoes e verdadeira");
        }



      
      
}
}