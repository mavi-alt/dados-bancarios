import java.util.Scanner;

public class dadosBancarios {
    public static void main(String[] args) {
        String nome = "Manuela Viera";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        Scanner leitor = new Scanner(System.in);
        int escolha = 0;

        System.out.println("********************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\n Nome:  " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.print("Saldo inicial: " + saldo);
        System.out.println("\n********************************************");

        String menu = """
                
                Operações
                
                1. Consultar saldos
                2. Receber valor
                3. Transferir valor
                4. Sair
                
                Digite a opção desejada:
                
                """;


        while (escolha != 4) {
            System.out.println(menu);
            escolha = leitor.nextInt();

            if (escolha == 1) {
                System.out.println("Seu saldo é igual a: " + saldo);
            } else if (escolha == 2) {
                System.out.println("Valor recebido:  ");
               double valor = leitor.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo += valor;
                    System.out.println("Novo saldo:  " + saldo);
                }
                } else if (escolha == 3) {
                    System.out.println("Valor transferido:   ");
                    double valor = leitor.nextDouble();
                    saldo -= valor;
                System.out.println("Novo saldo:  " + saldo);
                } else if (escolha !=4) {
                System.out.println("Opção inválida.");
            }
            }
        }
    }

