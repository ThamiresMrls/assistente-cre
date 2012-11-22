package classesPrincipais;

public class Disciplina {
    
    /* Atributos principais */
    private String nome;
    private int cred;
    private int media;
    
    /* Construtor */
    public Disciplina (String meuNome, int meuCred) {
        nome = meuNome;
        cred = meuCred;
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
