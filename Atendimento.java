public class Atendimento implements Setor {

    private static Atendimento instancia = new Atendimento();

    private Atendimento() {}

    public static Atendimento getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "Atendimento vai melhorar conforme reclamação: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "Atendimento agradece o elogio: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "Atendimento vai considerar a sugestão: " + mensagem;
    }
}
