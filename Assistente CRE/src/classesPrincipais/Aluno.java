package classesPrincipais;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aluno {
    
    /* Atributos essenciais */
    private String nome = "";
    private int matricula = 0;
    private ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();
    private float cre = 0;
    
    /* Constantes */
    private String nomeArquivo = "";
    
    /* Manipulação de arquivos [MUDAR PARA UMA NOVA CLASSE SINCRONIZADOR] */
    private FileOutputStream arqSaida = null;
    private FileInputStream arqEntrada = null;
    private ObjectOutputStream escritor = null;
    private ObjectInputStream leitor = null;
    
    /* Registro em arquivo [MUDAR PARA UMA NOVA CLASSE SINCRONIZADOR] */
    public void registraAluno(String nomeA, Aluno daltrey) {
        try {
            arqSaida = new FileOutputStream(nomeA);
            escritor = new ObjectOutputStream(arqSaida);
            escritor.writeObject(daltrey);
            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    /* Cálculo do CRE */
    public void calculaCre() {
        
    }
    
    /* Get's e Set's */
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }
    public float getCre() {
        return cre;
    }
    public void setNome(String a) {
        nome = a;
    }
    public void setMatricula(int a) {
        matricula = a;
    }
    public void setDisciplina(int i, Disciplina a) {
        listaDisciplinas.set(i, a);
    }
    public void addDisciplina(Disciplina a) {
        listaDisciplinas.add(a);
    }
    public void setCre(float a) {
        cre = a;
    }
    
}
