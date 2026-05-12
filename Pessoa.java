public class Pessoa {

    public String enviarMensagem(String setor, String tipo, String mensagem) {
        return Ouvidoria.getInstancia().encaminhar(setor, tipo, mensagem);
    }
}

