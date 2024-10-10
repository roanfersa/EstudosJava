//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     CalculadoraSalaRetangular calculo = new CalculadoraSalaRetangular();

     double altura = 159;
     double largura = 50;


        calculo.calcularArea(altura, largura);
        calculo.calcularPerimetro(altura, largura);
        System.out.println("Essa é a área da sala: " + calculo.calcularArea(altura, largura));
        System.out.println("Esse é o perímetro da sala: " + calculo.calcularPerimetro(altura, largura));
    }
}