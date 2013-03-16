package classesPrincipais;

public class Disciplina {
    
    /* Dados gerais */
    private String nome = "";
    private String curso = "";
    private int qtdeCreds = 0;
    private int periodo = 0;

    
    
    /* Métodos de acesso */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getQtdeCreds() {
        return qtdeCreds;
    }
    public void setQtdeCreds(int qtdeCreds) {
        this.qtdeCreds = qtdeCreds;
    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

}
