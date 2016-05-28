/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MosaicControl.java
 *
 * Created on 2010-01-15, 01:51:51
 */

package truckliststudio.sources.effects.controls;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import truckliststudio.TrucklistStudio;
import truckliststudio.sources.effects.Shapes;

/**
 *
 * @author pballeux (modified by karl)
 */
public class ShapesControl extends javax.swing.JPanel {

    Shapes effect = null;
    private Properties shapes = new Properties();
    /** Creates new form MosaicControl
     * @param effect */
    public ShapesControl(Shapes effect) {
        initComponents();
        this.effect=effect;
        initShapes();        
    }
    @SuppressWarnings("unchecked") 
    private void initShapes() {
        try {
            shapes.load(getClass().getResourceAsStream("/truckliststudio/resources/shapes/Shapes.properties"));
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for (Object o : shapes.keySet()) {
                model.addElement(o); 
            }
            cboShapes.setModel(model);
        } catch (IOException ex) {
            Logger.getLogger(TrucklistStudio.class.getName()).log(Level.SEVERE, null, ex);
        }
        String shapeL = effect.getShape();
        cboShapes.setSelectedItem(shapeL);
        tglReverse.setSelected(effect.getReverse());
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboShapes = new javax.swing.JComboBox();
        lblfaces = new javax.swing.JLabel();
        tglReverse = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(250, 98));

        cboShapes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboShapes.setName("cboShapes"); // NOI18N
        cboShapes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboShapesActionPerformed(evt);
            }
        });

        lblfaces.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfaces.setText("Overlays");
        lblfaces.setName("lblfaces"); // NOI18N

        tglReverse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/truckliststudio/resources/tango/view-refresh.png"))); // NOI18N
        tglReverse.setText("Reverse");
        tglReverse.setName("tglReverse"); // NOI18N
        tglReverse.setPreferredSize(new java.awt.Dimension(95, 30));
        tglReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglReverseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfaces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboShapes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tglReverse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblfaces)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboShapes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglReverse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboShapesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboShapesActionPerformed
//        System.out.println("Shape: "+cboShapes.getSelectedItem().toString());
        effect.setShape(cboShapes.getSelectedItem().toString());
    }//GEN-LAST:event_cboShapesActionPerformed

    private void tglReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglReverseActionPerformed
        if (tglReverse.isSelected()){
            effect.setReverse(true);
        } else {
            effect.setReverse(false);
        }
    }//GEN-LAST:event_tglReverseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboShapes;
    private javax.swing.JLabel lblfaces;
    private javax.swing.JToggleButton tglReverse;
    // End of variables declaration//GEN-END:variables

}