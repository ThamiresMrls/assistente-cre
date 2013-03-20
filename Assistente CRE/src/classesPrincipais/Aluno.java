package classesPrincipais;

import java.util.LinkedList;
import miscelanea.Persistencia;

public class Aluno {
    
    /* Dados pessoais */
    private String nome = "";
    private int matricula = 0;
    private Curso senzala = new Curso();
    
    /* Dados de login */
    private String login = "";
    private String senha = "";
    
    /* Utilidades */
    Persistencia teimoso = new Persistencia();
    
    /* Método de cadastro */
    public Aluno (String name, int mat, String curso, String arquivoCursos) {
        nome = name;
        matricula = mat;
        
        teimoso.setNomeArq (arquivoCursos);
        LinkedList<Curso> listaCompleta;
        
        
        
    }
    
    
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
    public Curso getCurso() {
        return senzala;
    }
    public void setCurso(Curso senzala) {
        this.senzala = senzala;
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
