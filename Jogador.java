import java.util.List;

public class Jogador extends Usuario {
    private int posicaoRanking;
    private String categoria;
    private String federacao;
    private List<String> torneiosParticipados;
    private int partidasJogadas;
    private int vitorias;
    private int derrotas;

    public Jogador(String nome, String email) {
        super(nome, email);
    }

    public void setPosicaoRanking(int posicaoRanking) {
        this.posicaoRanking = posicaoRanking;
    }
    public int getPosicaoRanking() {
        return posicaoRanking;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setFederacao(String federacao) {
        this.federacao = federacao;
    }
    public String getFederacao() {
        return federacao;
    }
    public void adicionaTorneio(String torneio) {
        this.torneiosParticipados.add(torneio);
    }
    public List<String> getTorneiosParticipados() {
        return torneiosParticipados;
    }

    public void setPartidasJogadas(int partidasJogadas) {
        this.partidasJogadas = partidasJogadas;
    }
    public int getPartidasJogadas() {
        return partidasJogadas;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getDerrotas() {
        return derrotas;
    }
}