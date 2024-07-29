import java.util.List;

public class FederacaoEstadual {
    public String nome;
    private String localizacao;
    private List<Equipe> listaEquipes;

    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    public String getLocalizacao(){
        return this.localizacao;
    }

    public void adicionaEquipe(Equipe nomeEquipe){
        listaEquipes.add(nomeEquipe);
    }

    public List<Equipe> getListaEquipe(){
        return this.listaEquipes;
    }




}
