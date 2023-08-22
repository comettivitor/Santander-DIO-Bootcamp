package contabancaria;

import java.util.Scanner;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public void CriaConta() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor, digite o numero da Conta: ");
        numero = scan.nextInt();
        System.out.print("Agora, informe a Agencia: ");
        agencia = scan.next();
        System.out.print("Agora, informe o nome do cliente: ");
        nomeCliente = scan.next();
        System.out.print("Por fim, informe o saldo, se houver algum: ");
        saldo = scan.nextDouble();

        System.out.println("Ola, " + nomeCliente + "  obrigado por criar uma conta em nosso banco, sua agencia e "
                + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " ja esta disponivel para saque!"
        );
    }
}
