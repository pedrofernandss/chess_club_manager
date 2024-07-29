import java.util.Date;

public abstract class Usuario {
    public int id;
    public String nome;
    public String email;
    private String senha;
    private String telefone;
    private String genero;
    private Date dataCadastro;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getSenha(String email){
        return this.senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone(String email){
        return this.telefone;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(String email){
        return this.genero;
    }

    public void setDataCadastro(Date dataCadastro){
        this.dataCadastro = dataCadastro;
    }

    public Date getDataCadastro(String email){
        return this.dataCadastro;
    }
}

