/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormAlgebraicas.java
 *
 * Created on 01-dic-2008, 18:22:29
 */

package basics.ui;

import basics.classes.Algebraicas;

/**
 *
 * @author Administrador
 */
public class FormAlgebraicas extends javax.swing.JFrame {

    /** Creates new form FormAlgebraicas */
    public FormAlgebraicas() {
        initComponents();
        PanelPotencia.setVisible(false);
        PanelRaiz.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG2 = new javax.swing.ButtonGroup();
        RBPot = new javax.swing.JRadioButton();
        RBRaiz = new javax.swing.JRadioButton();
        PanelRaiz = new javax.swing.JPanel();
        txt4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        btnCalcRaiz = new javax.swing.JButton();
        PanelPotencia = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        btnCalcPot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operaciones Algebráicas");
        setResizable(false);

        BG2.add(RBPot);
        RBPot.setText("Potenciación");
        RBPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBPotActionPerformed(evt);
            }
        });

        BG2.add(RBRaiz);
        RBRaiz.setText("Raiz Cuadrada");
        RBRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBRaizActionPerformed(evt);
            }
        });

        jLabel2.setText("=");

        txt5.setOpaque(false);

        btnCalcRaiz.setText("Calcular");
        btnCalcRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcRaizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRaizLayout = new javax.swing.GroupLayout(PanelRaiz);
        PanelRaiz.setLayout(PanelRaizLayout);
        PanelRaizLayout.setHorizontalGroup(
            PanelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRaizLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelRaizLayout.setVerticalGroup(
            PanelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRaizLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcRaiz)
                    .addGroup(PanelRaizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPotencia.setEnabled(false);

        jLabel1.setText("=");

        txt3.setOpaque(false);

        btnCalcPot.setText("Calcular");
        btnCalcPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcPotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPotenciaLayout = new javax.swing.GroupLayout(PanelPotencia);
        PanelPotencia.setLayout(PanelPotenciaLayout);
        PanelPotenciaLayout.setHorizontalGroup(
            PanelPotenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPotenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelPotenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPotenciaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPotenciaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcPot, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelPotenciaLayout.setVerticalGroup(
            PanelPotenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPotenciaLayout.createSequentialGroup()
                .addGroup(PanelPotenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelPotenciaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCalcPot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPotenciaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(PanelPotenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPotenciaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RBPot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBRaiz)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(PanelRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBPot)
                    .addComponent(RBRaiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(PanelRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Algebraicas obj = new Algebraicas();
    private void RBPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBPotActionPerformed
        // TODO add your handling code here:
        if(RBPot.isSelected()){
            PanelPotencia.setVisible(true);
            PanelRaiz.setVisible(false);
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
        }
}//GEN-LAST:event_RBPotActionPerformed

    private void RBRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBRaizActionPerformed
        // TODO add your handling code here:
        if(RBRaiz.isSelected()){
            PanelRaiz.setVisible(true);
            PanelPotencia.setVisible(false);
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
        }
    }//GEN-LAST:event_RBRaizActionPerformed

    private void btnCalcRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcRaizActionPerformed
        // TODO add your handling code here:
        try{
            txt5.setText(""+obj.RaizCuadrada(Double.parseDouble(txt4.getText())));
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Revisa bien los parámetros que estás ingresando");
        }
    }//GEN-LAST:event_btnCalcRaizActionPerformed

    private void btnCalcPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcPotActionPerformed
        // TODO add your handling code here:
        try{
            txt3.setText(""+obj.Potencia(Double.parseDouble(txt1.getText()),Double.parseDouble(txt2.getText())));
        } catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Revisa bien los parámetros que estás ingresando");
        }
    }//GEN-LAST:event_btnCalcPotActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG2;
    private javax.swing.JPanel PanelPotencia;
    private javax.swing.JPanel PanelRaiz;
    private javax.swing.JRadioButton RBPot;
    private javax.swing.JRadioButton RBRaiz;
    private javax.swing.JButton btnCalcPot;
    private javax.swing.JButton btnCalcRaiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    // End of variables declaration//GEN-END:variables

}