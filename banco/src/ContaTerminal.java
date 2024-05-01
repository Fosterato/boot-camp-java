import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {


        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o da sua conta: ");
        int numero = scan.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        Double saldo = scan.nextDouble();

        scan.close();
        
        nomeCliente = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(nomeCliente);

    }
}

