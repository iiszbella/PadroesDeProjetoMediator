public class Financeiro implements Setor {

    private static Financeiro instancia = new Financeiro();

    private Financeiro() {}

    public static Financeiro getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "Financeiro vai analisar a reclamação: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "Financeiro agradece o elogio: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "Financeiro vai avaliar a sugestão: " + mensagem;
    }
}
