public class Tecnico implements Setor {

    private static Tecnico instancia = new Tecnico();

    private Tecnico() {}

    public static Tecnico getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "Técnico vai corrigir o problema relatado: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "Equipe técnica agradece o elogio: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "Equipe técnica vai estudar a sugestão: " + mensagem;
    }
}

