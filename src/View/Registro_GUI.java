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
public class Registro_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Registro_GUI
     */
    public Registro_GUI() {
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
        nome_txt = new javax.swing.JTextField();
        especialidade_txt = new javax.swing.JTextField();
        procedimento_txt = new javax.swing.JTextField();
        duracao_txt = new javax.swing.JTextField();
        data_txt = new javax.swing.JTextField();
        registrar_btn = new javax.swing.JButton();
        voltar_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(230, 250, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);
        jPanel1.add(nome_txt);
        nome_txt.setBounds(200, 90, 210, 30);
        jPanel1.add(especialidade_txt);
        especialidade_txt.setBounds(200, 150, 210, 30);
        jPanel1.add(procedimento_txt);
        procedimento_txt.setBounds(200, 210, 210, 30);

        duracao_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracao_txtActionPerformed(evt);
            }
        });
        jPanel1.add(duracao_txt);
        duracao_txt.setBounds(200, 270, 210, 30);
        jPanel1.add(data_txt);
        data_txt.setBounds(200, 330, 210, 30);

        registrar_btn.setText("REGISTRAR");
        registrar_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(56, 176, 194), 2, true));
        registrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(registrar_btn);
        registrar_btn.setBounds(200, 390, 100, 40);

        voltar_btn.setText("VOLTAR");
        voltar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(voltar_btn);
        voltar_btn.setBounds(30, 460, 90, 23);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setText("DATA:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 335, 60, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("NOME:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 95, 60, 20);

        jLabel3.setFont(new java.awt.Font("Elephant", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 176, 194));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registro de Procedimento");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 20, 320, 50);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setText("ESPECIALIDADE:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 160, 130, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setText("PROCEDIMENTO:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 215, 130, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel6.setText("DURAÇÃO:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 275, 100, 20);

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

    private void duracao_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracao_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracao_txtActionPerformed

    private void registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_btnActionPerformed
        Model.Profissional_DAO.registrar();
    }//GEN-LAST:event_registrar_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField data_txt;
    public static javax.swing.JTextField duracao_txt;
    public static javax.swing.JTextField especialidade_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField nome_txt;
    public static javax.swing.JTextField procedimento_txt;
    public static javax.swing.JButton registrar_btn;
    public static javax.swing.JButton voltar_btn;
    // End of variables declaration//GEN-END:variables
}
