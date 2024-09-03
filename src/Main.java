//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double celsius = 0.0;
        double fahrenheit = celsius * 1.8 + 32;

        String mensagem = String.format("A temperatura %.2f em celsius, é %.2f em fahrenheit", celsius, fahrenheit);
        System.out.println(mensagem);


        int fahrenheitInteira = (int) fahrenheit;
        System.out.println("A temperatura em fahrenheit inteira é: " + fahrenheitInteira);
    }
}