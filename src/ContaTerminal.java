import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, digite o número da sua conta: ");
        int numero = teclado.nextInt();
        System.out.println("Número da Conta: " + numero);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = teclado.next();
        System.out.println("Número da Agência: " + agencia);

        System.out.print("Por favor, digite o seu Nome: ");
        teclado.nextLine(); // Consumir quebra de linha pendente
        String nomeCliente = teclado.nextLine();
        System.out.println("Nome do Cliente: " + nomeCliente);

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = teclado.nextDouble();
        System.out.printf("Saldo Atual: %.2f" + saldo);

        System.out.println("A conta foi criada com sucesso!");

        System.out.println("Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        teclado.close();
    }
}
