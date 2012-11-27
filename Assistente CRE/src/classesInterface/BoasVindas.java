package classesInterface;

import classesPrincipais.Aluno;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BoasVindas extends javax.swing.JFrame {

    public BoasVindas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jSeparator2 = new javax.swing.JSeparator();
        titulo = new javax.swing.JLabel();
        welcomeMessage = new javax.swing.JLabel();
        instructCad = new javax.swing.JLabel();
        instructCons = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        matLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoMat = new javax.swing.JTextField();
        campoCurso = new javax.swing.JTextField();
        cadButton = new javax.swing.JButton();
        consButton = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo.setText("THE AA PROJECT");

        welcomeMessage.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        welcomeMessage.setText("Seja bem-vindo!");

        instructCad.setFont(new java.awt.Font("Trebuchet MS", 2, 11)); // NOI18N
        instructCad.setText("Primeira vez usando esse programa? Preencha seus dados e aperte \"Cadastrar!\"");

        instructCons.setFont(new java.awt.Font("Trebuchet MS", 2, 11)); // NOI18N
        instructCons.setText("Já é um usuário antigo? Preencha seus dados e aperte \"Consultar!\"");

        nameLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        nameLabel.setText("Nome:");

        matLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        matLabel.setText("Matrícula:");

        courseLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        courseLabel.setText("Curso:");

        cadButton.setText("Cadastrar!");
        cadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadButtonActionPerformed(evt);
            }
        });

        consButton.setText("Consultar!");
        consButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeMessage)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(instructCad)
                                    .addComponent(instructCons))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(matLabel)
                    .addComponent(courseLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(campoMat)
                    .addComponent(campoCurso))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(welcomeMessage)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matLabel)
                            .addComponent(campoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseLabel)
                            .addComponent(campoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(instructCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(instructCons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(cadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consButtonActionPerformed
        String nome = campoNome.getText();
        int mat = Integer.parseInt(campoMat.getText());
        String curso = campoCurso.getText();
        
        if (consultaObj(mat) == null) {
            JOptionPane.showMessageDialog(null, "Nenhum cadastro foi encontrado com essas informações!\nTente novamente.", "Cadastro não encontrado", JOptionPane.ERROR_MESSAGE);
            campoNome.setText("");
            campoMat.setText("");
            campoCurso.setText("");
        }
    }//GEN-LAST:event_consButtonActionPerformed

    private void cadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadButtonActionPerformed
        String nome = campoNome.getText();
        int mat = Integer.parseInt(campoMat.getText());
        String curso = campoCurso.getText();
        
        if (consultaObj(mat) == null) {
            Aluno a = new Aluno (nome, curso, mat);
            cadastraAluno(a);
        } else JOptionPane.showMessageDialog(null, "Parece que já temos alguém cadastrado com essa matrícula!\nSe desejar consultar esse cadastro, aperte o botão 'Cadastrar!' na tela de boas vindas.", "Ops, cadastro já encontrado!", JOptionPane.ERROR_MESSAGE);

        /* Abre nova janela e inicia novas operações */
        /* Bloco de comandos a ser implementado ainda */
    }//GEN-LAST:event_cadButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoasVindas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoasVindas().setVisible(true);
            }
        });
    }
    
    /* Método para ler um objeto qualquer no arquivo */
    public Object consultaObj(int mat) {
        Object obj = null;
        FileInputStream file;
        ObjectInputStream objectStream;
        
        try {
            file = new FileInputStream("Data - " + mat + ".txt");
            objectStream = new ObjectInputStream(file);
            
            obj = objectStream.readObject();
        } catch( IOException | ClassNotFoundException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return obj;
    }   
    
    /* Método para cadastrar um objeto qualquer no arquivo */
    public void cadastraAluno(Aluno a) {
        ObjectOutputStream objectStream;
        FileOutputStream file;
        
        try {
            file = new FileOutputStream("Data - " + a.getMatricula() + ".txt"); // Criação de um arquivo para receber o fluxo de dados
            objectStream = new ObjectOutputStream(file);                        // Criação do "assistente" para direcionar esse fluxo
            
            objectStream.writeObject(a);                                        // O assistente escreve o fluxo no arquivo
            
            objectStream.close();                                               // O assistente fecha todos os seus fluxos
        } catch (IOException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadButton;
    private javax.swing.JTextField campoCurso;
    private javax.swing.JTextField campoMat;
    private javax.swing.JTextField campoNome;
    private javax.swing.JButton consButton;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JLabel instructCad;
    private javax.swing.JLabel instructCons;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel matLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables

}
