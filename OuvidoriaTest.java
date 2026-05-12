import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OuvidoriaTest {

    @Test
    public void testReclamacaoFinanceiro() {
        Cliente cliente = new Cliente("Isabella");
        String resposta = cliente.enviarMensagem("financeiro", "reclamacao", "Cobrança indevida na fatura");
        System.out.println(resposta);
        assertEquals("Ouvidoria encaminhou.\n>> Financeiro vai analisar a reclamação: Cobrança indevida na fatura", resposta);
    }

    @Test
    public void testElogioAtendimento() {
        Cliente cliente = new Cliente("Carlos");
        String resposta = cliente.enviarMensagem("atendimento", "elogio", "Atendente foi muito educado");
        System.out.println(resposta);
        assertEquals("Ouvidoria encaminhou.\n>> Atendimento agradece o elogio: Atendente foi muito educado", resposta);
    }

    @Test
    public void testSugestaoTecnico() {
        Cliente cliente = new Cliente("Marina");
        String resposta = cliente.enviarMensagem("tecnico", "sugestao", "Melhorar qualidade da ligação");
        System.out.println(resposta);
        assertEquals("Ouvidoria encaminhou.\n>> Equipe técnica vai estudar a sugestão: Melhorar qualidade da ligação", resposta);
    }

    @Test
    public void testSetorInexistente() {
        Cliente cliente = new Cliente("João");
        String resposta = cliente.enviarMensagem("juridico", "reclamacao", "Problema não resolvido");
        System.out.println(resposta);
        assertEquals("Setor não encontrado.", resposta);
    }

    @Test
    public void testTipoMensagemInvalido() {
        Cliente cliente = new Cliente("Ana");
        String resposta = cliente.enviarMensagem("financeiro", "denuncia", "Funcionário agiu de forma incorreta");
        System.out.println(resposta);
        assertEquals("Tipo de mensagem inválido.", resposta);
    }
}
