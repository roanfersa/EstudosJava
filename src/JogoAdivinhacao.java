import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

        for(int i = 1; i <= 5; i++ ) {
            System.out.println(" \n Digite um número inteiro de 1 a 100 que você ache que seja o número escondido: \n");
            int numeroUsuario = leitura.nextInt();
            if(numeroUsuario < numeroAleatorio) {
                System.out.println(String.format("Errado, o número ' %d ' digitado é menor que o número verdadeiro. Você possui %d tentativas restantes", numeroUsuario, 5 - i));
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println(String.format("Errado, o número ' %d ' digitado é maior que o número verdadeiro. Você possui %d tentativas restantes", numeroUsuario, 5 - i));
            }
            else {
                System.out.println(String.format("Correto, o número ' %d ' é EXATAMENTE o número verdadeiro. Você ganhou!!!", numeroUsuario ));
                break;
            }
            if (i == 5 || numeroUsuario == numeroAleatorio){
                System.out.println(String.format("Game Over, suas chances acabaram! O número certo era: %d", numeroAleatorio));
                break;
            }
        }

    }
}
