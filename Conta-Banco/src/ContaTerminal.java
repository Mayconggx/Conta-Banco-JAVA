import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura do nome do cliente
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();

        // Solicitação e leitura do número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();

        // Solicitação e leitura do número da conta
        System.out.println("Por favor, digite o número da Conta:");
        String numeroConta = scanner.nextLine();

        // Solicitação e leitura do saldo inicial
        System.out.println("Por favor, digite o saldo inicial:");
        String saldo = scanner.nextLine();

        // Construção da mensagem final
        String mensagem = "Olá ".concat(nomeCliente)
                                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                                .concat(numeroAgencia)
                                .concat(", conta ")
                                .concat(numeroConta)
                                .concat(" e seu saldo ")
                                .concat(saldo)
                                .concat(" já está disponível para saque.");

        // Exibição da mensagem
        System.out.println(mensagem);

        scanner.close();
    }
}
