import java.util.Scanner;

public class ContaTerminal { 
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
// - - - - - - - - - - - - -Bloco declarando todas as variáveis que será lido na sequência pelo SCANNER.
        int conta, agencia;
        String nome;
        double saldo;
// - - - - - - - - - - - - -Bloco solicitando dados e armazenando na memória.
        System.out.println("Por favor, digite o número da Conta contendo 6 dígitos: ");
        conta = ler.nextInt();

        System.out.println("Por favor, digite o número da Agência contendo 4 dígitos: ");
        agencia = ler.nextInt();

        System.out.println("Por favor, digite o Seu Nome: ");
        nome = ler.next();

        System.out.println("Por favor, digite o Saldo que você sonha ter um dia: ");
        saldo = ler.nextDouble();

// - - - - - - - - - - - - -Bloco imprimindo todos os dados armazenados na memória.        
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta: %d e seu saldo R$%0.2f já está disponível para saque.", nome, agencia, conta, saldo);
        System.out.println(mensagem);

        ler.close();
    }
  }