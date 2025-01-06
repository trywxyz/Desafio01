import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double saldoDaConta = 1599;
        String tipoDaConta = "Corrente";
        String nomeDaConta = "Andre";
        int opcao = 0;
        double valorDoSaque;
        double valorAReceber;
        Scanner leitura = new Scanner(System.in);

        String mensagemDoBanco = """
                -------------------------------------
                Olá bem vindo ao Banco %s
                Tipo da Conta: %s
                Seu saldo atual: %f
                -------------------------------------
                """.formatted(nomeDaConta, tipoDaConta, saldoDaConta);
        System.out.println(mensagemDoBanco);

        String menuDoBanco = """
                -------------------------------------
                Escolhe uma das opções:
                
                1- Consulta de saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                -------------------------------------
                """;


        while (opcao != 4) {
            System.out.println(menuDoBanco);
            opcao = leitura.nextInt();

            if(opcao > 4){
                System.out.println("Número invalido tente novamente!");
            }
            //Consultar Saldo
            if (opcao == 1) {
                System.out.println("Seu saldo é: " + saldoDaConta);


            //Transferir
            } else if (opcao == 2) {
                System.out.println("Olá " + nomeDaConta + " Qual valor que deseja transferir?");
                valorDoSaque = leitura.nextDouble();

                if(valorDoSaque > 0){
                    if (valorDoSaque < saldoDaConta) {
                        System.out.println("Sucesso! Transferência realizado...");
                        saldoDaConta -= valorDoSaque;

                        System.out.println("Seu saldo agora é: " + saldoDaConta);
                    } else {
                        System.out.println("Impossivel transferir esse valor...");
                        System.out.println("Retornando...");
                    }
                }else{
                    System.out.println("Valor Inválido");
                }
            //Receber
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja receber na sua conta? " + nomeDaConta);
                valorAReceber = leitura.nextDouble();

                if(valorAReceber > 0){
                    if (valorAReceber > 0) {
                        System.out.println("Valor recebido com sucesso!");
                        saldoDaConta += valorAReceber;
                        System.out.println("Seu saldo agora é: " + saldoDaConta);
                    }else{
                        System.out.println("Valor Inválido...");
                        System.out.println("Tente novamente!");
                    }
                }else{
                    System.out.println("Valor Inválido");
                }
            }
            //Sair
            if (opcao == 4) {
                System.out.println("Saindo do banco aguarde...");
            }

        }
    }
}