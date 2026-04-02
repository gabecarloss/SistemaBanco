import java.util.Scanner;

public class Operacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;

        for (int i = 0; i < 20; i++) {

            System.out.println("\nSelecione a opção desejada: ");
            System.out.println("\n1 - Realizar depósito.");
            System.out.println("2 - Realizar saque.");
            System.out.println("3 - Conferir saldo.");
            System.out.println("4 - Cancelar operação.");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor que deseja depositar: ");
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Operação concluída! Você depositou " + valorDeposito + " reais.");
            }

            if (opcao == 2) {
                System.out.println("Digite o valor que deseja sacar.");
                double valorSaque = scanner.nextDouble();
                if (valorSaque <= saldo) {
                    saldo -= valorSaque;
                    System.out.println(" Operação concluída! Você sacou " + valorSaque + " reais.");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            }

            if (opcao == 3) {
                System.out.println("Saldo atual: " + saldo);
            }

            if (opcao == 4) {
                System.out.println("Finalizando sistemas.");
                break;
            }
        }
    }
}

