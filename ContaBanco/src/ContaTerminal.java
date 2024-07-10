import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);     

        System.out.print("Por favor digite o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Agora digite o numero da agencia: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Agora digite o saldo da conta: "); 
        double saldo = sc.nextDouble();

        System.out.println("Olá," + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , " + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
