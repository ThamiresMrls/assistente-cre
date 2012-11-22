package classesPrincipais;

public class Disciplina {
    
    /* Constantes */
    private int qtdeNotas = 0;
    
    /* Atributos principais */
    private String nome;
    private int cred;
    private float media;
    private float[] notas;
    private boolean status;
    
    /* Outros */
    private int contador = 0;
    
    /* Construtor */
    public Disciplina (String meuNome, int meuCred, int qNotas, boolean dStatus) {
        nome = meuNome;
        cred = meuCred;
        qtdeNotas = qNotas;
        status = dStatus;
        notas = new float[qtdeNotas];
    }
    
    public void cadastraNota (float nota, int peso) {
        if (contador != qtdeNotas) {
            notas[contador] = (nota*peso)/qtdeNotas;
            contador++;
        }
    }
    
    public void calculaMedia() {
        for (int i = 0; i < qtdeNotas; i++) {
            media += notas[i];
        }
        media = (media/qtdeNotas);
    }
    
    
    
    /* Métodos de acesso */
    public String getNome() {
        return nome;
    }
    public void getNome(String a) {
        nome = a;
    }
    public int getCred() {
        return cred;
    }
    public void setCred(int a) {
        cred = a;
    }
    public float getMedia() {
        return media;
    }
    public void setMedia(int a) {
        media = a;
    }
    public boolean getStatus () {
        return status;
    }
    public void setStatus (boolean a) {
        status = a;
    }
}