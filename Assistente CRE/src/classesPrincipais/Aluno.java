package classesPrincipais;

import java.util.ArrayList;

public class Aluno {
    
    /* Atributos principais */
    private String nome = "";
    private String curso = "";
    private int cre = 0; 
    ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
    
    /* Outros */
    private int numDisciplinas = 0;
    private int numCreditos = 0;
    
    
    
    /* Construtor */
    public Aluno (String meuNome, String meuCurso) {
        nome = meuNome;
        curso = meuCurso;
    }
   
    /* Método para adicionar mais uma disciplina */
    public void addDisciplina(String nome, int cred, int qNotas) {
        Disciplina e = new Disciplina (nome, cred, qNotas);
        listaDisciplinas.add(e);
        numDisciplinas++;
        numCreditos = numCreditos + cred;
    }
    
    /* Método para calcular o CRE */  
    public void calculaCRE() {
        for (int i = 0; i < listaDisciplinas.size(); i++) cre += (listaDisciplinas.get(i).getMedia() * listaDisciplinas.get(i).getCred());
        cre = (cre/numCreditos);
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
