import java.util.List;

public class Treinador extends Usuario {
    private String credencial;
    private int anosExperiencias;
    private List<String> equipesTreinadas;
    private String Especialidade;
    private List<String> titulosConquistados;
    private String metodologia;
    private boolean dispobilidadeNovosTreinos;

    public Treinador(String nome, String email) {
        super(nome, email);
    }

    public void setCredencial(String credencial){
        this.credencial = credencial;
    }
    public String getCredencial(){
        return this.credencial;
    }
    public void setAnosExperiencias(int anosExperiencias){
        this.anosExperiencias = anosExperiencias;
    }
    public int getAnosExperiencias(){
        return this.anosExperiencias;
    }
    public void adicionaEquipesTreinadas(String equipe){
        this.equipesTreinadas.add(equipe);
    }
    public List<String> getEquipesTreinadas(){
        return this.equipesTreinadas;
    }
    public void setEspecialidade(String especialidade){
        this.Especialidade = especialidade;
    }
    public String getEspecialidade(){
        return this.Especialidade;
    }
    public void adicionaTitulosConquistados(String titulo){
        this.titulosConquistados.add(titulo);
    }
    public List<String> getTitulosConquistados(){
        return this.titulosConquistados;
    }
    public void setMetodologia(String metodologia){
        this.metodologia = metodologia;
    }
    public String getMetodologia(){
        return this.metodologia;
    }
    public void setDispobilidadeNovosTreinos(boolean disponibilidade){
        this.dispobilidadeNovosTreinos = disponibilidade;
    }
    public boolean getDispobilidadeNovosTreinsos(){
        return this.dispobilidadeNovosTreinos;
    }
}
