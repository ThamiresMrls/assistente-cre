package classesPrincipais;

public class Aluno {
    
    /* Dados pessoais */
    private String nome = "";
    private int matricula = 0;
    private String curso = "";
    
    /* Dados de login */
    private String login = "";
    private String senha = "";
    
    
    
    
    /* Métodos de acesso */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }    
    
}
