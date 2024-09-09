import java.util.Scanner;

public class ControleBancario {
    public static void main(String[] args) {
        double saldoAtual = 2500.00;
        double valorReceber, valorTransferir;
        int ops;

        Scanner entrada = new Scanner(System.in);

        do {
            String infoCliente = """
             ***********************
              
              Dados iniciais do cliente:
              
              Nome: Roan Ferreira
              Tipo conta: Corrente
              Saldo inicial: R$ %.2f
              
              ***********************
            
            Operações:
                        
            1- Consultar saldos
            2- Receber valor
            3- Transferir valor
            4- Sair
                        
            Digite a opção desejada:
            
            """.formatted(saldoAtual);

            System.out.println(infoCliente);

            ops = entrada.nextInt();

            switch (ops) {
                case 1:
                    System.out.println("O seu saldo atual é: " + saldoAtual);
                    break;

                case 2:
                    System.out.println("Digite o valor a receber: ");
                    valorReceber = entrada.nextDouble();
                    saldoAtual += valorReceber;
                    System.out.println("Seu saldo atual é: " + saldoAtual);
                    break;

                case 3:
                    System.out.println("Digite o valor a transferir: ");
                    valorTransferir = entrada.nextDouble();
                    if (valorTransferir > saldoAtual) {
                        System.out.println("Você não possui saldo suficiente para transferir.");
                    } else {
                        saldoAtual -= valorTransferir;
                        System.out.println("Transferência realizada com sucesso. Seu saldo atual é: " + saldoAtual);
                    }
                    break;

                case 4:
                    System.out.println("Sua operação foi encerrada com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }

        } while (ops != 4);

    }
}














/*
Funcionalidades do Controlador bancário:
- Iniciar com as informações do cliente
- Opção de consultar o saldo, receber dinheiro, fazer transferência, encerrar o programa
- não permitir transações fora de lógica



 */