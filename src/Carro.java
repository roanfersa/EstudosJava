public class Carro {
    private String nomeModelo;
    private double precoMedio1;
    private double precoMedio2;
    private double precoMedio3;


    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getPrecoMedio1() {
        return precoMedio1;
    }

    public void setPrecoMedio1(double precoMedio1) {
        this.precoMedio1 = precoMedio1;
    }

    public double getPrecoMedio2() {
        return precoMedio2;
    }

    public void setPrecoMedio2(double precoMedio2) {
        this.precoMedio2 = precoMedio2;
    }

    public double getPrecoMedio3() {
        return precoMedio3;
    }

    public void setPrecoMedio3(double precoMedio3) {
        this.precoMedio3 = precoMedio3;
    }
    public void maiorPreco() {
        if (precoMedio1 > precoMedio2 && precoMedio1 > precoMedio3 ) {
            System.out.println("O maior preço é: R$" + precoMedio1);
        } else if (precoMedio2 > precoMedio1 && precoMedio2 > precoMedio3 ) {
            System.out.println("O maior preço é: R$" + precoMedio2);
        } else if (precoMedio3 > precoMedio1 && precoMedio3 > precoMedio2 ) {
            System.out.println("O maior preço é: R$" + precoMedio3);
        } else {
            System.out.println("Tente novamente");
        }
    }
    public void menorPreco() {
        if (precoMedio1 < precoMedio2 && precoMedio1 < precoMedio3 ) {
            System.out.println("O menor preço é: R$" + precoMedio1);
        } else if (precoMedio2 < precoMedio1 && precoMedio2 < precoMedio3 ) {
            System.out.println("O menor preço é: R$" + precoMedio2);

        } else if (precoMedio3 < precoMedio1 && precoMedio3 < precoMedio2 ) {
            System.out.println("O menor preço é: R$" + precoMedio3);
        } else {
            System.out.println("Tente novamente");
        }
    }
}
