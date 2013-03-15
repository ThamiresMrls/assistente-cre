package miscelanea;

import java.io.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*  HOW TO: PERSISTÊNCIA
 * 
 * Parte I - Fora dos métodos
 * 1 - Instancie a classe Persistencia:
 * Persistencia teimoso = new Persistencia();
 * 
 * Parte II - Dentro dos métodos
 * 2 - Escolha o nome do arquivo:
 * teimoso.setNomeArq ("arquivoReg");
 * 
 * 3 - Grave ou leia do arquivo:
 * teimoso.gravaArquivo (listaCompleta);
 * listaCompleta = teimoso.carregaArquivo();
 * 
 * 4 - Profit.
 */

public class Persistencia {
    
    /* Constantes */
    private String nomeArq = "";
    
    /* Ferramentas usadas para manipular o arquivo */
    private FileOutputStream fileStreamOut;
    private FileInputStream fileStreamIn;
    
    /* Ferramentas usadas para manipular o objeto a ser salvo */
    private ObjectOutputStream objectStreamOut;
    private ObjectInputStream objectStreamIn;
    
    /* Use esse método para determinar o nome do arquivo a ser salvo */
    public void setNomeArq (String a) {
        nomeArq = a;
    }
    
    /* Use esse método para gravar o objeto no arquivo setado pelo método anterior */
    public void gravaArquivo (LinkedList<String> a) {
        try {
            /* Construção dos operadores */
            fileStreamOut = new FileOutputStream (nomeArq);
            objectStreamOut = new ObjectOutputStream (fileStreamOut);
            
            /* Gravação do objeto no arquivo */
            objectStreamOut.writeObject(a);
            
            /* Encerramento do arquivo */
            objectStreamOut.close();
        } catch (IOException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /* Use esse método para retirar o objeto do arquivo */
    public LinkedList<String> carregaArquivo () {
        LinkedList<String> a = new LinkedList<>(); 
        
        try {
            /* Construção dos operadores */
            fileStreamIn = new FileInputStream (nomeArq);
            objectStreamIn = new ObjectInputStream (fileStreamIn);
                        
            /* Leitura do objeto do arquivo */
            a = (LinkedList<String>) objectStreamIn.readObject();
            
            /* Encerramento do arquivo */
            objectStreamIn.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return a;
    }
    
}
