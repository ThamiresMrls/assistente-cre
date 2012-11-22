package classesPrincipais;

public class Aluno {
    
    /* Atributos principais */
    private String nome;
    private String curso;
    private int cre;
    
    /* Construtor */
    public Aluno (String meuNome, String meuCurso) {
        nome = meuNome;
        curso = meuCurso;
    }
    
    
    
    
    /* Métodos de acesso */
    public String getNome() {
        return nome;
    }
    public void setNome(String a) {
        nome = a;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String a) {
        curso = a;
    }
    public int getCre() {
        return cre;
    }
    public void setCre(int a) {
        cre = a;
    }
    
}
