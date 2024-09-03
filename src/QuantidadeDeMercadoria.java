public class QuantidadeDeMercadoria {
    public static void main(String[] args) {
        double precoProduto = 300.0;
        int quantidade = 3;
        double valorTotal = precoProduto * (double) quantidade;

        System.out.println(String.format("Valor total: %.2f ", valorTotal));

    }
}
