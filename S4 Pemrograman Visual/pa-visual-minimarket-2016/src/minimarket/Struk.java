package minimarket;

public class Struk extends javax.swing.JFrame {

    public Struk(int total, int bayar) {
        initComponents();
        int kembali = bayar-total;
        outputTotalHarga.setText(Integer.toString(total));
        outputUangDibayar.setText(Integer.toString(bayar));
        outputKembalian.setText(Integer.toString(kembali));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        totalHarga = new javax.swing.JLabel();
        uangDibayar = new javax.swing.JLabel();
        kembalian = new javax.swing.JLabel();
        outputTotalHarga = new javax.swing.JTextField();
        outputUangDibayar = new javax.swing.JTextField();
        outputKembalian = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(102, 51, 0)));

        totalHarga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalHarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/totalharga.png"))); // NOI18N
        totalHarga.setText("Total Harga");

        uangDibayar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uangDibayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/bayar.png"))); // NOI18N
        uangDibayar.setText("Uang Dibayar");

        kembalian.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/kembali.png"))); // NOI18N
        kembalian.setText("Uang Kembalian");

        outputTotalHarga.setEditable(false);

        outputUangDibayar.setEditable(false);

        outputKembalian.setEditable(false);
        outputKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputKembalianActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/struck.png"))); // NOI18N
        jLabel1.setText("STRUCK PEMBAYARAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kembalian)
                            .addComponent(uangDibayar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalHarga, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputTotalHarga)
                            .addComponent(outputUangDibayar)
                            .addComponent(outputKembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalHarga))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uangDibayar)
                    .addComponent(outputUangDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembalian)
                    .addComponent(outputKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outputKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputKembalianActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kembalian;
    private javax.swing.JTextField outputKembalian;
    private javax.swing.JTextField outputTotalHarga;
    private javax.swing.JTextField outputUangDibayar;
    private javax.swing.JLabel totalHarga;
    private javax.swing.JLabel uangDibayar;
    // End of variables declaration//GEN-END:variables
}
