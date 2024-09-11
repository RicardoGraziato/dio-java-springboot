import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String nomeCliente, agencia;
        int numeroConta;
        double saldo;

        System.out.println("Qual o seu nome?");
        nomeCliente = in.nextLine();

        System.out.println("Digite o número da agência?");
        agencia = in.nextLine();

        System.out.println("Digite o número da sua conta:");
        numeroConta = in.nextInt();

        System.out.println("Diga qual o seu saldo:");
        saldo = in.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);

    }
}
