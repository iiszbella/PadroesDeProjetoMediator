public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String encaminhar(String setor, String tipo, String mensagem) {
        Setor destino;
        switch (setor.toLowerCase()) {
            case "financeiro": destino = Financeiro.getInstancia(); break;
            case "atendimento": destino = Atendimento.getInstancia(); break;
            case "tecnico": destino = Tecnico.getInstancia(); break;
            default: return "Setor não encontrado.";
        }

        switch (tipo.toLowerCase()) {
            case "reclamacao": return "Ouvidoria encaminhou.\n>> " + destino.receberReclamacao(mensagem);
            case "elogio": return "Ouvidoria encaminhou.\n>> " + destino.receberElogio(mensagem);
            case "sugestao": return "Ouvidoria encaminhou.\n>> " + destino.receberSugestao(mensagem);
            default: return "Tipo de mensagem inválido.";
        }
    }
}

