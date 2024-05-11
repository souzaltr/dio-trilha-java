import java.util.Scanner;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
   
    public void solicitarDadosBancarios () {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o número da conta por favor: ");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o número da agência por favor: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o seu nome por favor: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        scanner.close();
    }

    public void exibirMensagem () {
        System.out.println("Olá " .concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(Integer.toString(numero)).concat(" e seu saldo R$ ").concat(Double.toString(saldo)).concat(" já está disponível para saque."));
    }

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.solicitarDadosBancarios();
        conta.exibirMensagem();
    }
}