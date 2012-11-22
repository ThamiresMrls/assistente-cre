package classesPrincipais;

public class Disciplina {
    
    /* Constantes */
    private int qtdeNotas = 0;
    
    /* Atributos principais */
    private String nome;
    private int cred;
    private int media;
    private int[] notas;
    
    /* Construtor */
    public Disciplina (String meuNome, int meuCred, int minhasNotas) {
        nome = meuNome;
        cred = meuCred;
        qtdeNotas = minhasNotas;
        notas = new int[qtdeNotas];
    }
    
    public int cadastraNota (int nota, int peso) {
        return (nota*peso)/qtdeNotas;
    }
    
    
    
    
    /* Métodos de acesso */
    private String getNome() {
        return nome;
    }
    private void getNome(String a) {
        nome = a;
    }
    private int getCred() {
        return cred;
    }
    private void setCred(int a) {
        cred = a;
    }
    private int getMedia() {
        return media;
    }
    private void setMedia(int a) {
        media = a;
    }
}
