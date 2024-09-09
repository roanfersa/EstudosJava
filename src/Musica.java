public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes;




    void exibeFichaTecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
    }

    void avalia(double nota){
        avaliacao += nota;
        numAvaliacoes++;

    }
    double media(){
        return avaliacao / numAvaliacoes;
    }
}
