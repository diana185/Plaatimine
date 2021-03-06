/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author diana
 */
public class TileForm extends javax.swing.JFrame {

    double surfaceX, surfaceY, tileX, tileY, gap;
    int messageInt, totalTiles, totalWholeTiles, totalCutTiles,
            columnAmount, rowAmount, cornerAmount;
    String unit, messageText, messageTitle, column, row, corner, str1, str2,
            columnStr, rowStr, cornerStr;

    /**
     * Creates new form TileForm
     */
    public TileForm() {
        initComponents();
        ((JSpinner.DefaultEditor) spnGap.getEditor()).getTextField().setEditable(false);
        placeholders();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSurface = new javax.swing.JPanel();
        txtSurfaceX = new javax.swing.JTextField();
        txtSurfaceY = new javax.swing.JTextField();
        pnlTile = new javax.swing.JPanel();
        txtTileX = new javax.swing.JTextField();
        txtTileY = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        lblUnit = new javax.swing.JLabel();
        cmbUnit = new javax.swing.JComboBox<>();
        lblGap = new javax.swing.JLabel();
        spnGap = new javax.swing.JSpinner();
        lblMm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plaatimine");
        setResizable(false);

        pnlSurface.setBorder(javax.swing.BorderFactory.createTitledBorder("Ala suurus"));

        txtSurfaceX.setText("85");
        txtSurfaceX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSurfaceXKeyTyped(evt);
            }
        });

        txtSurfaceY.setText("115");
        txtSurfaceY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSurfaceYKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlSurfaceLayout = new javax.swing.GroupLayout(pnlSurface);
        pnlSurface.setLayout(pnlSurfaceLayout);
        pnlSurfaceLayout.setHorizontalGroup(
            pnlSurfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSurfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSurfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSurfaceX, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSurfaceY, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlSurfaceLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtSurfaceX, txtSurfaceY});

        pnlSurfaceLayout.setVerticalGroup(
            pnlSurfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSurfaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSurfaceX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSurfaceY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTile.setBorder(javax.swing.BorderFactory.createTitledBorder("Plaadi suurus"));

        txtTileX.setText("20");
        txtTileX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTileXKeyTyped(evt);
            }
        });

        txtTileY.setText("30");
        txtTileY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTileYKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlTileLayout = new javax.swing.GroupLayout(pnlTile);
        pnlTile.setLayout(pnlTileLayout);
        pnlTileLayout.setHorizontalGroup(
            pnlTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTileX, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTileY, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlTileLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtTileX, txtTileY});

        pnlTileLayout.setVerticalGroup(
            pnlTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTileX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTileY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClear.setText("Tühjenda");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCalculate.setText("Arvuta");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblUnit.setText("Mõõtühikud");

        cmbUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cm", "mm", "m" }));

        lblGap.setText("Vuugivahe");

        spnGap.setModel(new javax.swing.SpinnerListModel(new String[] {"0", "2", "3", "5"}));

        lblMm.setText("mm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSurface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblUnit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlTile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblGap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnGap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMm)
                        .addGap(35, 35, 35))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCalculate, btnClear, pnlSurface, pnlTile});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSurface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnit)
                    .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGap)
                    .addComponent(spnGap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnCalculate))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSurfaceXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurfaceXKeyTyped
        nrInput(evt, txtSurfaceX);
    }//GEN-LAST:event_txtSurfaceXKeyTyped

    private void txtSurfaceYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurfaceYKeyTyped
        nrInput(evt, txtSurfaceY);
    }//GEN-LAST:event_txtSurfaceYKeyTyped

    private void txtTileXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTileXKeyTyped
        nrInput(evt, txtTileX);
    }//GEN-LAST:event_txtTileXKeyTyped

    private void txtTileYKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTileYKeyTyped
        nrInput(evt, txtTileY);
    }//GEN-LAST:event_txtTileYKeyTyped

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        if (!(txtSurfaceX.getText().isEmpty() || txtSurfaceY.getText().isEmpty() || txtTileX.getText().isEmpty() || txtTileY.getText().isEmpty())) {
            unit = String.valueOf(cmbUnit.getSelectedItem());
            //<editor-fold defaultstate="collapsed" desc="Vuugivahe teisendamine">
            switch (unit) {
                case "mm":
                    gap = Double.parseDouble(String.valueOf(spnGap.getValue()));
                    break;
                case "cm":
                    gap = Double.parseDouble(String.valueOf(spnGap.getValue())) * 0.1;
                    break;
                case "m":
                    gap = Double.parseDouble(String.valueOf(spnGap.getValue())) * 0.001;
                    break;
                default:
                    break;
            }
            //</editor-fold>

            surfaceX = Double.parseDouble(txtSurfaceX.getText());
            tileX = Double.parseDouble(txtTileX.getText());
            surfaceY = Double.parseDouble(txtSurfaceY.getText());
            tileY = Double.parseDouble(txtTileY.getText());

            Calculating calcY = new Calculating(surfaceY, tileY, gap);
            Calculating calcX = new Calculating(surfaceX, tileX, gap);

            totalTiles = calcX.getAllTiles() * calcY.getAllTiles();
            totalWholeTiles = calcX.getWholeTiles() * calcY.getWholeTiles();
            totalCutTiles = totalTiles - totalWholeTiles;

            column = calcX.getEdge() + unit + " x " + tileY + unit;             // x - 12,5x30 - 6tk - xäär   x yplaat - column
            row = tileX + unit + " x " + calcY.getEdge() + unit;                // o - 20x25   - 3tk - xplaat x yäär   - row
            corner = calcX.getEdge() + unit + " x " + calcY.getEdge() + unit;   // v - 12,5x25 - 2tk - xäär   x yäär   - corner

            columnAmount = calcX.getCutTiles() * calcY.getWholeTiles();         // x - lõigatud x (2) * terve y (3)
            rowAmount = calcX.getWholeTiles() * calcY.getCutTiles();            // o - terve x (3) * lõigatud y (1)
            cornerAmount = calcX.getCutTiles() * calcY.getCutTiles();           // v - lõigatud x (2) * lõigatud y (1)

            //<editor-fold defaultstate="collapsed" desc="String messageText">
            if (calcX.getCutTiles() > 0) {
                str1 = "\n Ritta läheb " + calcX.getAllTiles() + " plaati, millest " + calcX.getWholeTiles() + " on terved ning " + calcX.getCutTiles() + " on lõigatud.";
            } else {
                str1 = "\n Ritta läheb " + calcX.getAllTiles() + " tervet plaati.";
            }
            if (calcY.getCutTiles() > 0) {
                str2 = "\n Veergu läheb " + calcY.getAllTiles() + " plaati, millest " + calcY.getWholeTiles() + " on terved ning " + calcY.getCutTiles() + " on lõigatud.";
            } else {
                str2 = "\n Veergu läheb " + calcY.getAllTiles() + " tervet plaati.";
            }

            messageText = " Kokku läheb " + totalTiles + " plaati, millest " + totalWholeTiles + " on terved ning " + totalCutTiles + " on lõigatud." + str1 + str2;

            if (columnAmount > 0) {
                columnStr = "\n " + column + " - " + columnAmount + "tk";
                messageText = messageText + columnStr;
            }
            if (rowAmount > 0) {
                rowStr = "\n " + row + " - " + rowAmount + "tk";
                messageText = messageText + rowStr;
            }
            if (cornerAmount > 0) {
                cornerStr = "\n " + corner + " - " + cornerAmount + "tk";
                messageText = messageText + cornerStr;
            }
            messageTitle = "Põrandaplaadid";
            messageInt = 1;
        } else {
            messageText = "Arvutamiseks täitke kõik väljad!";
            messageTitle = "Teade";
            messageInt = 0;

//</editor-fold>
        }
        JOptionPane.showMessageDialog(this, messageText, messageTitle, messageInt);
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtSurfaceX.setText("");
        txtSurfaceY.setText("");
        txtTileX.setText("");
        txtTileY.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void nrInput(java.awt.event.KeyEvent evt, JTextField txt) {
        char c = evt.getKeyChar();
        if ((Character.isDigit(c) || c == KeyEvent.VK_PERIOD)) {
            String s = txt.getText();
            int dot = s.indexOf(".");
            if (dot != -1 && (c == KeyEvent.VK_PERIOD)) {
                evt.consume();
            } else if (dot != -1 && c != KeyEvent.VK_BACK_SPACE) {
                String afterDecimal = s.substring(dot + 1);
                if (afterDecimal.length() > 1) {
                    evt.consume();
                }
            }
        } else {
            evt.consume();
        }
    }

    private void placeholders() {
        TextPrompt tp1 = new TextPrompt("Laius x", txtSurfaceX);
        tp1.setForeground(Color.gray);
        TextPrompt tp2 = new TextPrompt("Pikkus y", txtSurfaceY);
        tp2.setForeground(Color.gray);
        TextPrompt tp3 = new TextPrompt("Laius x", txtTileX);
        tp3.setForeground(Color.gray);
        TextPrompt tp4 = new TextPrompt("Pikkus y", txtTileY);
        tp4.setForeground(Color.gray);
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TileForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cmbUnit;
    private javax.swing.JLabel lblGap;
    private javax.swing.JLabel lblMm;
    private javax.swing.JLabel lblUnit;
    private javax.swing.JPanel pnlSurface;
    private javax.swing.JPanel pnlTile;
    private javax.swing.JSpinner spnGap;
    private javax.swing.JTextField txtSurfaceX;
    private javax.swing.JTextField txtSurfaceY;
    private javax.swing.JTextField txtTileX;
    private javax.swing.JTextField txtTileY;
    // End of variables declaration//GEN-END:variables
}
