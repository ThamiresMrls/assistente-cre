package classesPrincipais;

import java.util.ArrayList;
import java.util.List;

public class Periodo {
   
    /* Atributos principais */
    private float cre;
    ArrayList <Disciplina> listaDisciplinas = new ArrayList<>();
    
    /* Outros */
    private int numDisciplinas = 0;
    private int numCreditos = 0;
    
    /* Construtor */
    public Periodo () {
            List <Disciplina> listaDisciplinas;
            listaDisciplinas = new ArrayList ();
    }
    
    
    /* Método para adicionar mais uma disciplina */
    public void addDisciplina(String nome, int cred, int qNotas, boolean dStatus) {
        Disciplina e = new Disciplina (nome, cred, qNotas, dStatus);
        listaDisciplinas.add(e);
        numDisciplinas++;
        numCreditos = numCreditos + cred;
    }
    
    /* Método para calcular o CRE do período */  
    public void calculaCRE() {
        for (int i = 0; i < listaDisciplinas.size(); i++) cre += (listaDisciplinas.get(i).getMedia() * listaDisciplinas.get(i).getCred());
        cre = (cre/numCreditos);
    }
    
    /* Métodos de acesso */
    public float getCRE () {
        return cre;
    }
}