import java.util.List;

public class Equipe {
    public String nome;
    private String categoria;
    private Treinador treinadorResposavel;
    private List<Jogador> listaJogadores;
    private FederacaoEstadual federacaoEstadual;

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    private String getCategoria(){
        return this.categoria;
    }



    public void setTreinadorResposavel(Treinador treinadorResposavel) {
        this.treinadorResposavel = treinadorResposavel;
    }

    public Treinador getTreinadorResposavel() {
        return this.treinadorResposavel;
    }

    public void adicionaJogador(Jogador jogador){
        listaJogadores.add(jogador);
    }

    public List<Jogador> getListaJogadores() {
        return this.listaJogadores;
    }

    public void setFederacaoEstadual(FederacaoEstadual federacaoEstadual){
        this.federacaoEstadual = federacaoEstadual;
    }

    public FederacaoEstadual getFederacaoEstadual() {
        return this.federacaoEstadual;
    }

}
