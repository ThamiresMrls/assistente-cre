package classesPrincipais;

import java.util.ArrayList;

public class Aluno {
    
    /* Atributos principais */
    private String nome = "";
    private String curso = "";
    private int creTotal = 0;
    private int matricula = 0;
    ArrayList <Periodo> listaPeriodos = new ArrayList<>();
    
    /* Outros */
    private int numPeriodos = 0;
    private int numCreditosTotal = 0;
    
    
    /* Construtor */
    public Aluno (String meuNome, String meuCurso, int minhaMatricula) {
        nome = meuNome;
        curso = meuCurso;
        matricula = minhaMatricula;
    }
   
    /* Método para adicionar mais um Período */
    public void addPeriodo() {
        Periodo p = new Periodo ();
        listaPeriodos.add(p);
        numPeriodos++;
    }
    
    /* Método para calcular o CRE Total*/  
    public void calculaCRE () {
        for (int i = 0; i < listaPeriodos.size(); i++) {
            for (int j = 0; j < listaPeriodos.get(i).listaDisciplinas.size(); j++) {
                creTotal += (listaPeriodos.get(i).listaDisciplinas.get(j).getMedia() * listaPeriodos.get(i).listaDisciplinas.get(j).getCred());
                numCreditosTotal += listaPeriodos.get(i).listaDisciplinas.get(j).getCred();
            }
        }
        creTotal = (creTotal/numCreditosTotal);
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
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int a) {
        matricula = a;
    }
    public int getCreTotal() {
        return creTotal;
    }
    public void setCreTotal (int a) {
        creTotal = a;
    }
    
}