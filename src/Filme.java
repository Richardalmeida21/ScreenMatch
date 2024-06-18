public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;

    }
}
