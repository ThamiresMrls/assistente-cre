package miscelanea;

import javax.swing.JOptionPane;

/*  HOW TO: TRATAMENTO
 * 
 * Parte I - Fora dos métodos
 * 1 - Instancie a classe Tratamento:
 * Tratamento medico = new Tratamento();
 * 
 * 2 - Monte um método que reúna todos os tratamentos necessários:
 * boolean tratamento() {
 *      if (!medico.trataCampoVazio (campoRascunho.getText(), "Campo de Rascunho")) return false;
 *      if (!medico.trataCampoInt (campoRascunho.getText(), "Campo de Rascunho")) return false;
 *      if (!medico.trataCampoFloat (campoRascunho.getText(), "Campo de Rascunho")) return false;
 * 
 *      return true;
 * }
 * 
 * Parte II - Dentro dos métodos
 * 3 - Chame o método feito:
 * if (!tratamento()) return;
 * 
 * 4 - Profit.
 */

public class Tratamento {
    
    public boolean trataCampoVazio (String campoTeste, String nomeCampo) {
        if (campoTeste.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digite um valor no campo " + nomeCampo + ".", "Campo em branco", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean trataCampoFloat (String campoTeste, String nomeCampo) {
        float a = 0;
        
        try {
            a = Float.parseFloat(campoTeste);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor digite um valor válido no campo " + nomeCampo + ".", "Valor inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    public boolean trataCampoInt (String campoTeste, String nomeCampo) {
        int a = 0;
        
        try {
            a = Integer.parseInt(campoTeste);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor digite um valor válido no campo " + nomeCampo + ".", "Valor inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }   
        
        return true;
    }
    
    public boolean trataComboBox (String itemEscolhido, String nomeCampo) {
        if (itemEscolhido.equals("Selecione...")) {
            JOptionPane.showMessageDialog(null, "Por favor escolha uma opção válida no campo " + nomeCampo + ".", "Opção inválida", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
}
