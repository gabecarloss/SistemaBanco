import java.util.Random;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cliente;

        for (int i = 0; i < 1; i++) {
            System.out.println("Bem-vindo! Selecione a opção que se encaixa com você: ");
            System.out.println("\n1 - Já sou cliente.");
            System.out.println("2 - Quero me cadastrar.");
            System.out.println("3 - Sair.");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("\nDigite seu número de acesso único: ");
                int acessarNumero = scanner.nextInt();
            }

            if (opcao == 2) {
                System.out.println("\nSeja bem-vindo ao Banco Gaúcho! Será um prazer ter você conosco!");

                System.out.println("\nDigite seu nome completo: ");
                String nomeCliente = scanner.nextLine();

                System.out.println("\nDigite seu email: ");
                String emailCliente = scanner.nextLine();

                System.out.println("""
                                   Digite seu número de telefone
                                   Deve estar no formato: (XX) XXXXX-XXXX""");
                String telefoneCliente = scanner.nextLine();

                System.out.println("\nCrie uma senha de 6 números: ");
                int senhaCliente = scanner.nextInt();

                System.out.println("\nConfirme a senha: ");
                int confirmacaoSenhaCliente = scanner.nextInt();

                if (confirmacaoSenhaCliente != senhaCliente){
                    System.out.println("As senhas são diferentes.");
                } else{
                    Random random = new Random();
                    int numeroAcessoUnico = random.nextInt(999999999);
                    System.out.println("""
                    \nCadastro realizado com sucesso!
                    Você recebeu um número de acesso único, salve-o em um lugar seguro, ele não poderá ser recuperado!
                    Seu número de acesso único:""" + " " + numeroAcessoUnico);
                }
            }

            if (opcao == 3){
                System.out.println("Saindo...");
            }
        }
    }
}
