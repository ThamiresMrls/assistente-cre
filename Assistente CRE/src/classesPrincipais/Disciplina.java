package classesPrincipais;

public class Disciplina {
    
    /* Atributos essenciais */
    private String nome = "";
    private int qtdeCred = 0;
    private int periodo = 0;
    private float[] notas = new float[3];
    private String status = "Indeterminado";
    
    /* Get's e set's */
    public String getNome() {
        return nome;
    }
    public String getStatus() {
        return status;
    }
    public int getQtdeCred() {
        return qtdeCred;
    }
    public int getPeriodo() {
        return periodo;
    }
    public float[] getNotas() {
        return notas;
    }
    public void setNome(String a) {
        nome = a;
    }
    public void setStatus(String a) {
        status = a;
    }
    public void setQtdeCred(int a) {
        qtdeCred = a;
    }
    public void setPeriodo(int a) {
        periodo = a;
    }
    public void setNotas(int i, float a) {
        notas[i] = a;
    }
    
}
