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

import truckliststudio.sources.effects.Rotation;

/**
 *
 * @author pballeux (modified by karl)
 */
public class RotationControl extends javax.swing.JPanel {

    Rotation effect = null;
    /** Creates new form MosaicControl
     * @param effect */
    public RotationControl(Rotation effect) {
        initComponents();
        this.effect=effect;
        slider.setValue(effect.getRotation());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        slider = new javax.swing.JSlider();

        setPreferredSize(new java.awt.Dimension(250, 44));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("truckliststudio/Languages"); // NOI18N
        label.setText(bundle.getString("ROTATION")); // NOI18N
        label.setName("label"); // NOI18N

        slider.setMajorTickSpacing(10);
        slider.setMaximum(90);
        slider.setMinimum(-90);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setValue(0);
        slider.setName("slider"); // NOI18N
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label))
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        effect.setRotation(slider.getValue());
    }//GEN-LAST:event_sliderStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel label;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables

}
