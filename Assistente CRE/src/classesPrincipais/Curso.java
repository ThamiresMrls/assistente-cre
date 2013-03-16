package classesPrincipais;

import java.util.LinkedList;

public class Curso {
    
    /* Dados gerais */
    private String nome = "";
    private String centro = "";
    private int qtdePer = 0;

    /* Dados específicos */
    private LinkedList<Disciplina> listaDisciplinas = new LinkedList<>();
    
    /* Métodos de acesso */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCentro() {
        return centro;
    }
    public void setCentro(String centro) {
        this.centro = centro;
    }
    public int getQtdePer() {
        return qtdePer;
    }
    public void setQtdePer(int qtdePer) {
        this.qtdePer = qtdePer;
    }
}
