/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerAntrian;
import controller.ControllerAntrianPublik;
import controller.ControllerInfoAntrian;
import helper.LookAndFeel;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author rafli
 */
public class ViewAntrian extends javax.swing.JFrame {

    /**
     * Creates new form ViewAntrian
     */
    public ViewAntrian() {
        this.setLocationRelativeTo(null);
        initComponents();
        this.setVisible(true);
        showTable();
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
        panelHeader = new javax.swing.JPanel();
        btnKembali = new javax.swing.JButton();
        btnRiwayatAntrian = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelNomorAntrian = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfoAntrian = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        textDokter = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textNomorAntrian = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSelesai = new javax.swing.JButton();
        btnAntrianPublik = new javax.swing.JButton();
        panelDaftarAntrian = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAntrian = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 540));

        panelHeader.setBackground(new java.awt.Color(230, 230, 230));
        panelHeader.setPreferredSize(new java.awt.Dimension(960, 40));

        btnKembali.setBackground(new java.awt.Color(214, 214, 214));
        btnKembali.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-back-circle-outline.png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.setBorder(null);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnRiwayatAntrian.setBackground(new java.awt.Color(214, 214, 214));
        btnRiwayatAntrian.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnRiwayatAntrian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/history-rounded.png"))); // NOI18N
        btnRiwayatAntrian.setText("Riwayat Antrian");
        btnRiwayatAntrian.setToolTipText("");
        btnRiwayatAntrian.setBorder(null);
        btnRiwayatAntrian.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRiwayatAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiwayatAntrianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRiwayatAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(btnRiwayatAntrian, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(btnKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(948, 480));

        panelNomorAntrian.setBackground(new java.awt.Color(255, 255, 255));

        tableInfoAntrian.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableInfoAntrian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Dokter", "Dokter", "Nomor Antrian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableInfoAntrian.setShowGrid(true);
        tableInfoAntrian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInfoAntrianMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableInfoAntrian);

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setText("Informasi Antrian");

        textDokter.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        textDokter.setText("-");

        jLabel4.setText("Nama Dokter");

        jLabel5.setText("No. Antrian");

        textNomorAntrian.setFont(new java.awt.Font("Consolas", 0, 84)); // NOI18N
        textNomorAntrian.setText("0000");

        btnReset.setBackground(new java.awt.Color(245, 195, 195));
        btnReset.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(228, 35, 35));
        btnReset.setText("Reset");
        btnReset.setToolTipText("");
        btnReset.setBorder(null);
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReset.setEnabled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSelesai.setBackground(new java.awt.Color(197, 247, 224));
        btnSelesai.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnSelesai.setForeground(new java.awt.Color(54, 111, 85));
        btnSelesai.setText("Selesai");
        btnSelesai.setToolTipText("");
        btnSelesai.setBorder(null);
        btnSelesai.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSelesai.setEnabled(false);
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });

        btnAntrianPublik.setBackground(new java.awt.Color(63, 122, 154));
        btnAntrianPublik.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnAntrianPublik.setForeground(new java.awt.Color(255, 255, 255));
        btnAntrianPublik.setText("Tampilkan Antrian Publik");
        btnAntrianPublik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntrianPublikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNomorAntrianLayout = new javax.swing.GroupLayout(panelNomorAntrian);
        panelNomorAntrian.setLayout(panelNomorAntrianLayout);
        panelNomorAntrianLayout.setHorizontalGroup(
            panelNomorAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNomorAntrianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNomorAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelNomorAntrianLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAntrianPublik))
                    .addGroup(panelNomorAntrianLayout.createSequentialGroup()
                        .addGroup(panelNomorAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(textDokter)
                            .addComponent(jLabel5)
                            .addComponent(textNomorAntrian)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelNomorAntrianLayout.setVerticalGroup(
            panelNomorAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNomorAntrianLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelNomorAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNomorAntrianLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDokter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(textNomorAntrian)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAntrianPublik, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nomor Antrian", panelNomorAntrian);

        panelDaftarAntrian.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(462, 408));

        tableAntrian.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableAntrian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Dokter", "Pasien", "No. RM", "Antrian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAntrian.setPreferredSize(new java.awt.Dimension(948, 520));
        tableAntrian.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableAntrian.setShowGrid(true);
        tableAntrian.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tableAntrian);

        jTextField1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel1.setText("Cari dokter");

        jButton1.setBackground(new java.awt.Color(63, 122, 154));
        jButton1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search.png"))); // NOI18N
        jButton1.setText("Cari");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDaftarAntrianLayout = new javax.swing.GroupLayout(panelDaftarAntrian);
        panelDaftarAntrian.setLayout(panelDaftarAntrianLayout);
        panelDaftarAntrianLayout.setHorizontalGroup(
            panelDaftarAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDaftarAntrianLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDaftarAntrianLayout.setVerticalGroup(
            panelDaftarAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDaftarAntrianLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDaftarAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDaftarAntrianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Daftar Antrian", panelDaftarAntrian);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnRiwayatAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiwayatAntrianActionPerformed
        // TODO add your handling code here:
        new ViewRiwayatAntrian();
        this.dispose();
    }//GEN-LAST:event_btnRiwayatAntrianActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        controllerInfoAntrian.updateDataReset();
        controllerInfoAntrian.readAllData();
        controllerAntrianPublik.getAll();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        // TODO add your handling code here:
        controllerInfoAntrian.updateDataSelesai();
        controllerInfoAntrian.readAllData();
        controllerAntrianPublik.getAll();
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void tableInfoAntrianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInfoAntrianMouseClicked
        int row = tableInfoAntrian.getSelectedRow();
        controllerInfoAntrian.selectField(row);
        setBtnState();
    }//GEN-LAST:event_tableInfoAntrianMouseClicked

    private void btnAntrianPublikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntrianPublikActionPerformed
        // TODO add your handling code here:
        viewAntrianPublik.setVisible(true);
    }//GEN-LAST:event_btnAntrianPublikActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        new ViewMainMenu();
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        new LookAndFeel();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAntrian().setVisible(true);
            }
        });
    }

    private void setBtnState() {
        String nama_dokter = getNamaDokter().getText();
        if (!"-".equals(nama_dokter)) {
            btnSelesai.setEnabled(true);
            btnReset.setEnabled(true);
        } else {
            btnSelesai.setEnabled(false);
            btnReset.setEnabled(false);
        }
    }

    private void showTable() {
        controllerAntrian.readAllData();
        controllerInfoAntrian.readAllData();
    }

    public JTable getTableAntrianData() {
        return tableAntrian;
    }

    public JTable getTableInfoAntrianData() {
        return tableInfoAntrian;
    }

    public JLabel getNamaDokter() {
        return textDokter;
    }

    public JLabel getNomorAntrian() {
        return textNomorAntrian;
    }

    public Integer getSelectedId_nomor_antrian() {
        return selectedId_nomor_antrian;
    }

    public void setSelectedId_nomor_antrian(Integer selectedId_nomor_antrian) {
        this.selectedId_nomor_antrian = selectedId_nomor_antrian;
    }

    private ViewAntrianPublik viewAntrianPublik = new ViewAntrianPublik();
    private Integer selectedId_nomor_antrian;
    ControllerAntrian controllerAntrian = new ControllerAntrian(this);
    ControllerInfoAntrian controllerInfoAntrian = new ControllerInfoAntrian(this);
    ControllerAntrianPublik controllerAntrianPublik = new ControllerAntrianPublik(viewAntrianPublik);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAntrianPublik;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRiwayatAntrian;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelDaftarAntrian;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelNomorAntrian;
    private javax.swing.JTable tableAntrian;
    private javax.swing.JTable tableInfoAntrian;
    private javax.swing.JLabel textDokter;
    private javax.swing.JLabel textNomorAntrian;
    // End of variables declaration//GEN-END:variables
}
