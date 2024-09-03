import java.util.Scanner;

public class ControleBancario {
    public static void main(String[] args) {
    double saldoInicial = 2500.00;
    double saldoFinal, saldoAtual, valorReceber, valorTransferir;
    String = """
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
            
            """.formatted(saldoInicial);



    Scanner entrada = new Scanner(System.in);


    }
}

/*
Funcionalidades do Controlador bancário:
- Iniciar com as informações do cliente
- Opção de consultar o saldo, receber dinheiro, fazer transferência, encerrar o programa
- não permitir transações fora de lógica



 */