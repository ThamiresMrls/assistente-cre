package classesPrincipais;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aluno {
    
    /* Atributos principais */
    private String nome = "";
    private String curso = "";
    private int creTotal = 0; 
    ArrayList <Periodo> listaPeriodos = new ArrayList<>();
    
    /* Outros */
    private int numPeriodos = 0;
    private int numCreditosTotal = 0;
    
    
    /* Construtor */
    public Aluno (String meuNome, String meuCurso) {
        nome = meuNome;
        curso = meuCurso;
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
    
    /* Método para ler um objeto qualquer no arquivo */
    public Object consultaObj(String nome) {
        Object obj = new Object();
        FileInputStream file;
        ObjectInputStream objectStream;
        
        try {
            file = new FileInputStream("Data - " + nome + ".txt");
            objectStream = new ObjectInputStream(file);
            
            obj = objectStream.readObject();
        } catch( IOException | ClassNotFoundException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return obj;
    }   
    
    /* Método para cadastrar um objeto qualquer no arquivo */
    public void cadastraObj(Object objeto) {
        ObjectOutputStream objectStream;
        FileOutputStream file;
        
        try {
            file = new FileOutputStream("Data - " + nome + ".txt"); // Criação de um arquivo para receber o fluxo de dados
            objectStream = new ObjectOutputStream(file);            // Criação do "assistente" para direcionar esse fluxo
            
            objectStream.writeObject(objeto);                       // O assistente escreve o fluxo no arquivo
            
            objectStream.close();                                   // O assistente fecha todos os seus fluxos
        } catch (IOException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    public int getCreTotal() {
        return creTotal;
    }
    public void setCreTotal (int a) {
        creTotal = a;
    }
    
}