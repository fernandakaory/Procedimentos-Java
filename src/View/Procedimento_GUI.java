/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Meu Computador
 */
public class Procedimento_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Procedimento_GUI
     */
    public Procedimento_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iniciar_btn = new javax.swing.JButton();
        finalizar_btn = new javax.swing.JButton();
        voltar_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exibeTempo1_lbl = new javax.swing.JLabel();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(230, 250, 255));
        jPanel1.setLayout(null);

        iniciar_btn.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        iniciar_btn.setText("Iniciar");
        iniciar_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 176, 194), 2, true));
        iniciar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(iniciar_btn);
        iniciar_btn.setBounds(130, 310, 100, 40);

        finalizar_btn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        finalizar_btn.setText("Finalizar");
        finalizar_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 176, 194), 2, true));
        finalizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(finalizar_btn);
        finalizar_btn.setBounds(270, 310, 100, 40);

        voltar_btn.setText("VOLTAR");
        voltar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(voltar_btn);
        voltar_btn.setBounds(200, 460, 110, 23);

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 176, 194));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROCEDIMENTO 1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 40, 310, 30);

        exibeTempo1_lbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        exibeTempo1_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(exibeTempo1_lbl);
        exibeTempo1_lbl.setBounds(130, 380, 240, 40);
        jPanel1.add(clockFace1);
        clockFace1.setBounds(170, 100, 160, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void finalizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizar_btnActionPerformed
        Model.Procedimento_DAO.capturaFim();
        Model.Procedimento_DAO.calculaIntervalo();
        Model.Procedimento_DAO.calculaProcesso1();
    }//GEN-LAST:event_finalizar_btnActionPerformed

    private void iniciar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_btnActionPerformed
       Model.Procedimento_DAO.capturaInicio();
    }//GEN-LAST:event_iniciar_btnActionPerformed

    private void voltar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_btnActionPerformed
        dispose();
        new Menu_GUI().setVisible(true);
    }//GEN-LAST:event_voltar_btnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Procedimento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procedimento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procedimento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procedimento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procedimento_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    public static javax.swing.JLabel exibeTempo1_lbl;
    public static javax.swing.JButton finalizar_btn;
    public static javax.swing.JButton iniciar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton voltar_btn;
    // End of variables declaration//GEN-END:variables
}
