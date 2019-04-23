package minimarket;

import static minimarket.Minimarket.*;

public class Utama extends javax.swing.JFrame {

    public Utama() {
        initComponents();
        tabel = new javax.swing.JTable[]{
            tabelPembayaran, tabelKategori, tabelBarang
        };
        tombolMati = new javax.swing.JButton[]{
            tombolKategoriEdit, tombolKategoriHapus,
            tombolBarangEdit, tombolBarangHapus,
            tombolPembayaranHapus
        };
        Minimarket.panelKartu = panelKartu;
        Minimarket.panelMenu = panelMenu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJudul = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        panelMenuUtama = new javax.swing.JPanel();
        tombolKasir = new javax.swing.JButton();
        tombolAdmin = new javax.swing.JButton();
        tombolKeluar = new javax.swing.JButton();
        panelKasir = new javax.swing.JPanel();
        tombolPembayaran = new javax.swing.JButton();
        tombolKasirKembali = new javax.swing.JButton();
        panelAdmin = new javax.swing.JPanel();
        tombolKategori = new javax.swing.JButton();
        tombolBarang = new javax.swing.JButton();
        tombolAdminKembali = new javax.swing.JButton();
        panelKartu = new javax.swing.JPanel();
        panelSelamatDatang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelPembayaran = new javax.swing.JPanel();
        judulPembayaran = new javax.swing.JLabel();
        pembayaranKodeBarang = new javax.swing.JLabel();
        pembayaranJumlah = new javax.swing.JLabel();
        pembayaranIdPembeli = new javax.swing.JLabel();
        inputPembayaranKode = new javax.swing.JTextField();
        inputPembayaranJumlah = new javax.swing.JTextField();
        tombolPembayaranTambahBarang = new javax.swing.JButton();
        panelScrollPembayaran = new javax.swing.JScrollPane();
        tabelPembayaran = new javax.swing.JTable();
        pembayaranTotalHarga = new javax.swing.JLabel();
        pembayaranDibayar = new javax.swing.JLabel();
        outputPembayaranTotalHarga = new javax.swing.JTextField();
        inputPembayaranDibayar = new javax.swing.JTextField();
        tombolPembayaranCetakStruk = new javax.swing.JButton();
        tombolPembayaranHapus = new javax.swing.JButton();
        panelKategori = new javax.swing.JPanel();
        judulKategori = new javax.swing.JLabel();
        panelKategoriMenu = new javax.swing.JPanel();
        tombolKategoriTambah = new javax.swing.JButton();
        tombolKategoriHapus = new javax.swing.JButton();
        tombolKategoriEdit = new javax.swing.JButton();
        panelScrollKategori = new javax.swing.JScrollPane();
        tabelKategori = new javax.swing.JTable();
        panelBarang = new javax.swing.JPanel();
        judulBarang = new javax.swing.JLabel();
        panelBarangMenu = new javax.swing.JPanel();
        tombolBarangTambah = new javax.swing.JButton();
        tombolBarangEdit = new javax.swing.JButton();
        tombolBarangHapus = new javax.swing.JButton();
        panelScrollBarang = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        panelTambahKategori = new javax.swing.JPanel();
        judulTambahKategori = new javax.swing.JLabel();
        tambahKategoriNamaKategori = new javax.swing.JLabel();
        inputTambahKategoriNama = new javax.swing.JTextField();
        tombolTambahKategoriSimpan = new javax.swing.JButton();
        panelTambahBarang = new javax.swing.JPanel();
        judulTambahBarang = new javax.swing.JLabel();
        tambahBarangKodeBarang = new javax.swing.JLabel();
        tambahBarangNamaBarang = new javax.swing.JLabel();
        tambahBarangStok = new javax.swing.JLabel();
        tambahBarangHarga = new javax.swing.JLabel();
        tambahBarangKategori = new javax.swing.JLabel();
        inputTambahBarangKode = new javax.swing.JTextField();
        inputTambahBarangNama = new javax.swing.JTextField();
        inputTambahBarangStok = new javax.swing.JTextField();
        inputTambahBarangHarga = new javax.swing.JTextField();
        komboTambahBarangKategori = new javax.swing.JComboBox<>();
        tombolTambahBarangSimpan = new javax.swing.JButton();
        panelEditKategori = new javax.swing.JPanel();
        judulEditKategori = new javax.swing.JLabel();
        editKategoriIdKategori = new javax.swing.JLabel();
        editKategoriNamaKategori = new javax.swing.JLabel();
        inputEditKategoriNama = new javax.swing.JTextField();
        tombolEditKategoriSimpan = new javax.swing.JButton();
        panelEditBarang = new javax.swing.JPanel();
        judulEditBarang = new javax.swing.JLabel();
        editBarangIdBarang = new javax.swing.JLabel();
        editBarangKodeBarang = new javax.swing.JLabel();
        editBarangNamaBarang = new javax.swing.JLabel();
        editBarangStok = new javax.swing.JLabel();
        editBarangHarga = new javax.swing.JLabel();
        editBarangKategori = new javax.swing.JLabel();
        inputEditBarangKode = new javax.swing.JTextField();
        inputEditBarangNama = new javax.swing.JTextField();
        inputEditBarangStok = new javax.swing.JTextField();
        inputEditBarangHarga = new javax.swing.JTextField();
        komboEditBarangKategori = new javax.swing.JComboBox<>();
        tombolEditBarangSimpan = new javax.swing.JButton();
        panellogolitemarket = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelJudul.setBackground(new java.awt.Color(102, 51, 0));

        judul.setBackground(new java.awt.Color(0, 0, 204));
        judul.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 48)); // NOI18N
        judul.setForeground(new java.awt.Color(0, 204, 0));
        judul.setText("LITE MARKET");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/logo atas.png"))); // NOI18N

        javax.swing.GroupLayout panelJudulLayout = new javax.swing.GroupLayout(panelJudul);
        panelJudul.setLayout(panelJudulLayout);
        panelJudulLayout.setHorizontalGroup(
            panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJudulLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJudulLayout.setVerticalGroup(
            panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(panelJudulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.setBackground(new java.awt.Color(255, 204, 51));
        panelMenu.setLayout(new java.awt.CardLayout());

        panelMenuUtama.setBackground(new java.awt.Color(102, 51, 0));
        panelMenuUtama.setLayout(new java.awt.GridLayout(3, 1));

        tombolKasir.setBackground(new java.awt.Color(102, 255, 0));
        tombolKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/icons8-cash-register-64.png"))); // NOI18N
        tombolKasir.setText("Kasir");
        tombolKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKasirActionPerformed(evt);
            }
        });
        panelMenuUtama.add(tombolKasir);

        tombolAdmin.setBackground(new java.awt.Color(102, 255, 0));
        tombolAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/icons8-add-user-group-woman-man-64.png"))); // NOI18N
        tombolAdmin.setText("Admin");
        tombolAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAdminActionPerformed(evt);
            }
        });
        panelMenuUtama.add(tombolAdmin);

        tombolKeluar.setBackground(new java.awt.Color(102, 255, 0));
        tombolKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/icons8-login-rounded-48.png"))); // NOI18N
        tombolKeluar.setText("Keluar");
        tombolKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKeluarActionPerformed(evt);
            }
        });
        panelMenuUtama.add(tombolKeluar);

        panelMenu.add(panelMenuUtama, "menu utama");

        panelKasir.setBackground(new java.awt.Color(102, 51, 0));
        panelKasir.setLayout(new java.awt.GridLayout(3, 1));

        tombolPembayaran.setBackground(new java.awt.Color(51, 255, 0));
        tombolPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/icons8-shopping-cart-48.png"))); // NOI18N
        tombolPembayaran.setText("Pembayaran");
        tombolPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolPembayaranActionPerformed(evt);
            }
        });
        panelKasir.add(tombolPembayaran);

        tombolKasirKembali.setBackground(new java.awt.Color(51, 255, 0));
        tombolKasirKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/icons8-login-rounded-48.png"))); // NOI18N
        tombolKasirKembali.setText("Kembali");
        tombolKasirKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKasirKembaliActionPerformed(evt);
            }
        });
        panelKasir.add(tombolKasirKembali);

        panelMenu.add(panelKasir, "menu kasir");

        panelAdmin.setBackground(new java.awt.Color(102, 51, 0));
        panelAdmin.setLayout(new java.awt.GridLayout(3, 1));

        tombolKategori.setBackground(new java.awt.Color(51, 255, 0));
        tombolKategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/kategori.png"))); // NOI18N
        tombolKategori.setText("Kategori");
        tombolKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKategoriActionPerformed(evt);
            }
        });
        panelAdmin.add(tombolKategori);

        tombolBarang.setBackground(new java.awt.Color(51, 255, 0));
        tombolBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/menu.png"))); // NOI18N
        tombolBarang.setText("Barang");
        tombolBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBarangActionPerformed(evt);
            }
        });
        panelAdmin.add(tombolBarang);

        tombolAdminKembali.setBackground(new java.awt.Color(51, 255, 0));
        tombolAdminKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/icons8-login-rounded-48.png"))); // NOI18N
        tombolAdminKembali.setText("Kembali");
        tombolAdminKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolAdminKembaliActionPerformed(evt);
            }
        });
        panelAdmin.add(tombolAdminKembali);

        panelMenu.add(panelAdmin, "menu admin");

        panelKartu.setBackground(new java.awt.Color(255, 204, 0));
        panelKartu.setLayout(new java.awt.CardLayout());

        panelSelamatDatang.setBackground(new java.awt.Color(255, 255, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/logo minimarket.png"))); // NOI18N

        javax.swing.GroupLayout panelSelamatDatangLayout = new javax.swing.GroupLayout(panelSelamatDatang);
        panelSelamatDatang.setLayout(panelSelamatDatangLayout);
        panelSelamatDatangLayout.setHorizontalGroup(
            panelSelamatDatangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelamatDatangLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        panelSelamatDatangLayout.setVerticalGroup(
            panelSelamatDatangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSelamatDatangLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        panelKartu.add(panelSelamatDatang, "selamat datang");

        panelPembayaran.setBackground(new java.awt.Color(255, 255, 0));
        panelPembayaran.setName(""); // NOI18N

        judulPembayaran.setText("Pembayaran");

        pembayaranKodeBarang.setText("Kode Barang");

        pembayaranJumlah.setText("Jumlah");

        pembayaranIdPembeli.setText("Id Pembeli");

        inputPembayaranKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPembayaranKodeActionPerformed(evt);
            }
        });

        inputPembayaranJumlah.setText("1");

        tombolPembayaranTambahBarang.setBackground(new java.awt.Color(102, 51, 0));
        tombolPembayaranTambahBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/tambah.png"))); // NOI18N
        tombolPembayaranTambahBarang.setText("Tambah");
        tombolPembayaranTambahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolPembayaranTambahBarangActionPerformed(evt);
            }
        });

        tabelPembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Jumlah", "Harga", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPembayaranMouseClicked(evt);
            }
        });
        panelScrollPembayaran.setViewportView(tabelPembayaran);

        pembayaranTotalHarga.setText("Total Harga");

        pembayaranDibayar.setText("Dibayar");

        outputPembayaranTotalHarga.setEditable(false);

        inputPembayaranDibayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPembayaranDibayarActionPerformed(evt);
            }
        });

        tombolPembayaranCetakStruk.setBackground(new java.awt.Color(102, 51, 0));
        tombolPembayaranCetakStruk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/cetak.png"))); // NOI18N
        tombolPembayaranCetakStruk.setText("Cetak Struk");
        tombolPembayaranCetakStruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolPembayaranCetakStrukActionPerformed(evt);
            }
        });

        tombolPembayaranHapus.setBackground(new java.awt.Color(102, 51, 0));
        tombolPembayaranHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/delete.png"))); // NOI18N
        tombolPembayaranHapus.setText("Hapus");
        tombolPembayaranHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolPembayaranHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPembayaranLayout = new javax.swing.GroupLayout(panelPembayaran);
        panelPembayaran.setLayout(panelPembayaranLayout);
        panelPembayaranLayout.setHorizontalGroup(
            panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPembayaranLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelScrollPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pembayaranKodeBarang)
                            .addComponent(judulPembayaran)
                            .addComponent(pembayaranJumlah))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPembayaranLayout.createSequentialGroup()
                                .addComponent(inputPembayaranJumlah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tombolPembayaranTambahBarang))
                            .addComponent(inputPembayaranKode)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPembayaranLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pembayaranIdPembeli))))
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pembayaranTotalHarga)
                            .addComponent(pembayaranDibayar))
                        .addGap(18, 18, 18)
                        .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPembayaranDibayar)
                            .addComponent(outputPembayaranTotalHarga)))
                    .addGroup(panelPembayaranLayout.createSequentialGroup()
                        .addComponent(tombolPembayaranCetakStruk, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(tombolPembayaranHapus)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPembayaranLayout.setVerticalGroup(
            panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPembayaranLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulPembayaran)
                    .addComponent(pembayaranIdPembeli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPembayaranKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pembayaranKodeBarang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pembayaranJumlah)
                    .addComponent(inputPembayaranJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolPembayaranTambahBarang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelScrollPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pembayaranTotalHarga)
                    .addComponent(outputPembayaranTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPembayaranDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pembayaranDibayar))
                .addGap(18, 18, 18)
                .addGroup(panelPembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolPembayaranCetakStruk)
                    .addComponent(tombolPembayaranHapus))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        panelKartu.add(panelPembayaran, "pembayaran");

        panelKategori.setBackground(new java.awt.Color(255, 255, 0));
        panelKategori.setName(""); // NOI18N

        judulKategori.setText("Kategori");

        panelKategoriMenu.setBackground(new java.awt.Color(102, 51, 0));
        panelKategoriMenu.setOpaque(false);
        panelKategoriMenu.setLayout(new java.awt.GridLayout(10, 1));

        tombolKategoriTambah.setBackground(new java.awt.Color(51, 255, 0));
        tombolKategoriTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/tambah.png"))); // NOI18N
        tombolKategoriTambah.setText("Tambah");
        tombolKategoriTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKategoriTambahActionPerformed(evt);
            }
        });
        panelKategoriMenu.add(tombolKategoriTambah);

        tombolKategoriHapus.setBackground(new java.awt.Color(51, 255, 0));
        tombolKategoriHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/hapus.png"))); // NOI18N
        tombolKategoriHapus.setText("Hapus");
        tombolKategoriHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKategoriHapusActionPerformed(evt);
            }
        });
        panelKategoriMenu.add(tombolKategoriHapus);

        tombolKategoriEdit.setBackground(new java.awt.Color(51, 255, 0));
        tombolKategoriEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/edit.png"))); // NOI18N
        tombolKategoriEdit.setText("Edit");
        tombolKategoriEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKategoriEditActionPerformed(evt);
            }
        });
        panelKategoriMenu.add(tombolKategoriEdit);

        tabelKategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama"
            }
        ));
        tabelKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKategoriMouseClicked(evt);
            }
        });
        panelScrollKategori.setViewportView(tabelKategori);

        javax.swing.GroupLayout panelKategoriLayout = new javax.swing.GroupLayout(panelKategori);
        panelKategori.setLayout(panelKategoriLayout);
        panelKategoriLayout.setHorizontalGroup(
            panelKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKategoriLayout.createSequentialGroup()
                        .addComponent(judulKategori)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelScrollKategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelKategoriMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelKategoriLayout.setVerticalGroup(
            panelKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKategoriMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulKategori)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelScrollKategori, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelKartu.add(panelKategori, "kategori");

        panelBarang.setBackground(new java.awt.Color(255, 255, 0));
        panelBarang.setName(""); // NOI18N

        judulBarang.setText("Barang");

        panelBarangMenu.setBackground(new java.awt.Color(255, 255, 0));
        panelBarangMenu.setOpaque(false);
        panelBarangMenu.setLayout(new java.awt.GridLayout(10, 1));

        tombolBarangTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/tambah.png"))); // NOI18N
        tombolBarangTambah.setText("Tambah");
        tombolBarangTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBarangTambahActionPerformed(evt);
            }
        });
        panelBarangMenu.add(tombolBarangTambah);

        tombolBarangEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/edit.png"))); // NOI18N
        tombolBarangEdit.setText("Edit");
        tombolBarangEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBarangEditActionPerformed(evt);
            }
        });
        panelBarangMenu.add(tombolBarangEdit);

        tombolBarangHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/hapus.png"))); // NOI18N
        tombolBarangHapus.setText("Hapus");
        tombolBarangHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBarangHapusActionPerformed(evt);
            }
        });
        panelBarangMenu.add(tombolBarangHapus);

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama", "Stok", "Harga", "Kategori"
            }
        ));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        panelScrollBarang.setViewportView(tabelBarang);

        javax.swing.GroupLayout panelBarangLayout = new javax.swing.GroupLayout(panelBarang);
        panelBarang.setLayout(panelBarangLayout);
        panelBarangLayout.setHorizontalGroup(
            panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBarangLayout.createSequentialGroup()
                        .addComponent(judulBarang)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelScrollBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBarangMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBarangLayout.setVerticalGroup(
            panelBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulBarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelScrollBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelBarangMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelKartu.add(panelBarang, "barang");

        panelTambahKategori.setBackground(new java.awt.Color(255, 255, 0));

        judulTambahKategori.setText("Tambah Kategori");

        tambahKategoriNamaKategori.setText("Nama Kategori");

        inputTambahKategoriNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTambahKategoriNamaActionPerformed(evt);
            }
        });

        tombolTambahKategoriSimpan.setBackground(new java.awt.Color(102, 51, 0));
        tombolTambahKategoriSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/save .png"))); // NOI18N
        tombolTambahKategoriSimpan.setText("save");
        tombolTambahKategoriSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahKategoriSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTambahKategoriLayout = new javax.swing.GroupLayout(panelTambahKategori);
        panelTambahKategori.setLayout(panelTambahKategoriLayout);
        panelTambahKategoriLayout.setHorizontalGroup(
            panelTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTambahKategoriLayout.createSequentialGroup()
                        .addComponent(tambahKategoriNamaKategori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTambahKategoriNama, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE))
                    .addGroup(panelTambahKategoriLayout.createSequentialGroup()
                        .addGroup(panelTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judulTambahKategori)
                            .addComponent(tombolTambahKategoriSimpan))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTambahKategoriLayout.setVerticalGroup(
            panelTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulTambahKategori)
                .addGap(18, 18, 18)
                .addGroup(panelTambahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahKategoriNamaKategori)
                    .addComponent(inputTambahKategoriNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolTambahKategoriSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(552, Short.MAX_VALUE))
        );

        panelKartu.add(panelTambahKategori, "tambah kategori");

        panelTambahBarang.setBackground(new java.awt.Color(255, 255, 0));

        judulTambahBarang.setText("Tambah Barang");

        tambahBarangKodeBarang.setText("Kode Barang");

        tambahBarangNamaBarang.setText("Nama Barang");

        tambahBarangStok.setText("Stok");

        tambahBarangHarga.setText("Harga");

        tambahBarangKategori.setText("Kategori");

        tombolTambahBarangSimpan.setBackground(new java.awt.Color(102, 51, 0));
        tombolTambahBarangSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/save .png"))); // NOI18N
        tombolTambahBarangSimpan.setText("Simpan");
        tombolTambahBarangSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahBarangSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTambahBarangLayout = new javax.swing.GroupLayout(panelTambahBarang);
        panelTambahBarang.setLayout(panelTambahBarangLayout);
        panelTambahBarangLayout.setHorizontalGroup(
            panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTambahBarangLayout.createSequentialGroup()
                        .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTambahBarangLayout.createSequentialGroup()
                                .addComponent(tambahBarangKodeBarang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputTambahBarangKode, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahBarangLayout.createSequentialGroup()
                                .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tambahBarangNamaBarang)
                                    .addComponent(judulTambahBarang)
                                    .addComponent(tambahBarangStok))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputTambahBarangNama, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(inputTambahBarangHarga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(inputTambahBarangStok, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(komboTambahBarangKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelTambahBarangLayout.createSequentialGroup()
                                .addComponent(tambahBarangKategori)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelTambahBarangLayout.createSequentialGroup()
                        .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tambahBarangHarga)
                            .addComponent(tombolTambahBarangSimpan))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelTambahBarangLayout.setVerticalGroup(
            panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulTambahBarang)
                .addGap(18, 18, 18)
                .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahBarangKodeBarang)
                    .addComponent(inputTambahBarangKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahBarangNamaBarang)
                    .addComponent(inputTambahBarangNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahBarangStok)
                    .addComponent(inputTambahBarangStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahBarangHarga)
                    .addComponent(inputTambahBarangHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahBarangKategori)
                    .addComponent(komboTambahBarangKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolTambahBarangSimpan)
                .addContainerGap(441, Short.MAX_VALUE))
        );

        panelKartu.add(panelTambahBarang, "tambah barang");

        panelEditKategori.setBackground(new java.awt.Color(255, 255, 0));

        judulEditKategori.setText("Edit Kategori");

        editKategoriIdKategori.setText("Id Kategori");

        editKategoriNamaKategori.setText("Nama Kategori");

        inputEditKategoriNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEditKategoriNamaActionPerformed(evt);
            }
        });

        tombolEditKategoriSimpan.setBackground(new java.awt.Color(102, 51, 0));
        tombolEditKategoriSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/save .png"))); // NOI18N
        tombolEditKategoriSimpan.setText("Simpan");
        tombolEditKategoriSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolEditKategoriSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditKategoriLayout = new javax.swing.GroupLayout(panelEditKategori);
        panelEditKategori.setLayout(panelEditKategoriLayout);
        panelEditKategoriLayout.setHorizontalGroup(
            panelEditKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditKategoriLayout.createSequentialGroup()
                        .addComponent(editKategoriNamaKategori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputEditKategoriNama, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE))
                    .addGroup(panelEditKategoriLayout.createSequentialGroup()
                        .addComponent(judulEditKategori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editKategoriIdKategori))
                    .addGroup(panelEditKategoriLayout.createSequentialGroup()
                        .addComponent(tombolEditKategoriSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEditKategoriLayout.setVerticalGroup(
            panelEditKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulEditKategori)
                    .addComponent(editKategoriIdKategori))
                .addGap(18, 18, 18)
                .addGroup(panelEditKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editKategoriNamaKategori)
                    .addComponent(inputEditKategoriNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolEditKategoriSimpan)
                .addContainerGap(540, Short.MAX_VALUE))
        );

        panelKartu.add(panelEditKategori, "edit kategori");

        panelEditBarang.setBackground(new java.awt.Color(255, 255, 0));

        judulEditBarang.setText("Edit Barang");

        editBarangIdBarang.setText("Id Barang");

        editBarangKodeBarang.setText("Kode Barang");

        editBarangNamaBarang.setText("Nama Barang");

        editBarangStok.setText("Stok");

        editBarangHarga.setText("Harga");

        editBarangKategori.setText("Kategori");

        tombolEditBarangSimpan.setBackground(new java.awt.Color(102, 51, 0));
        tombolEditBarangSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/save .png"))); // NOI18N
        tombolEditBarangSimpan.setText("Simpan");
        tombolEditBarangSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolEditBarangSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditBarangLayout = new javax.swing.GroupLayout(panelEditBarang);
        panelEditBarang.setLayout(panelEditBarangLayout);
        panelEditBarangLayout.setHorizontalGroup(
            panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditBarangLayout.createSequentialGroup()
                        .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEditBarangLayout.createSequentialGroup()
                                .addComponent(editBarangKodeBarang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputEditBarangKode, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditBarangLayout.createSequentialGroup()
                                .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editBarangNamaBarang)
                                    .addComponent(judulEditBarang)
                                    .addComponent(editBarangStok))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                                .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputEditBarangNama, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(inputEditBarangHarga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(inputEditBarangStok, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(komboEditBarangKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(editBarangIdBarang, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(panelEditBarangLayout.createSequentialGroup()
                                .addComponent(editBarangKategori)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelEditBarangLayout.createSequentialGroup()
                        .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editBarangHarga)
                            .addComponent(tombolEditBarangSimpan))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelEditBarangLayout.setVerticalGroup(
            panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulEditBarang)
                    .addComponent(editBarangIdBarang))
                .addGap(18, 18, 18)
                .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBarangKodeBarang)
                    .addComponent(inputEditBarangKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBarangNamaBarang)
                    .addComponent(inputEditBarangNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBarangStok)
                    .addComponent(inputEditBarangStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBarangHarga)
                    .addComponent(inputEditBarangHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBarangKategori)
                    .addComponent(komboEditBarangKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolEditBarangSimpan)
                .addContainerGap(441, Short.MAX_VALUE))
        );

        panelKartu.add(panelEditBarang, "edit barang");

        panellogolitemarket.setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/LITE MARKET.png"))); // NOI18N

        javax.swing.GroupLayout panellogolitemarketLayout = new javax.swing.GroupLayout(panellogolitemarket);
        panellogolitemarket.setLayout(panellogolitemarketLayout);
        panellogolitemarketLayout.setHorizontalGroup(
            panellogolitemarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellogolitemarketLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panellogolitemarketLayout.setVerticalGroup(
            panellogolitemarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellogolitemarketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panellogolitemarket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelKartu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelKartu, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panellogolitemarket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolPembayaranActionPerformed
        if(pembayaranIdPembeli.getText().equals("Id Pembeli")){
            sqlUpdate("INSERT INTO pembeli values(NULL)");
        }
        String id = getDataQuery("SELECT max(id) FROM pembeli");
        pembayaranIdPembeli.setText(id);
        refreshPembayaran(pembayaranIdPembeli.getText());
    }//GEN-LAST:event_tombolPembayaranActionPerformed

    private void tombolKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKategoriActionPerformed
        refreshKategori();
    }//GEN-LAST:event_tombolKategoriActionPerformed

    private void tombolBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBarangActionPerformed
        refreshBarang();
    }//GEN-LAST:event_tombolBarangActionPerformed

    private void tombolKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_tombolKeluarActionPerformed

    private void tombolKategoriTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKategoriTambahActionPerformed
        tampilKartu("tambah kategori");
    }//GEN-LAST:event_tombolKategoriTambahActionPerformed

    private void tombolKategoriEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKategoriEditActionPerformed
        editKategoriIdKategori.setText( tabelKategori.getValueAt(barisPilihan, 0).toString() );
        inputEditKategoriNama.setText( tabelKategori.getValueAt(barisPilihan, 1).toString() );
        tampilKartu("edit kategori");
    }//GEN-LAST:event_tombolKategoriEditActionPerformed

    private void tombolKategoriHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKategoriHapusActionPerformed
        String id_kategori = tabelKategori.getValueAt(barisPilihan, 0).toString();
        sqlUpdate("DELETE FROM kategori WHERE id="+ id_kategori );
        refreshKategori();
    }//GEN-LAST:event_tombolKategoriHapusActionPerformed

    private void tombolBarangTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBarangTambahActionPerformed
        if(tabelKosong("kategori")){
            alert("Kategori belum ada");
            return;
        }
        refreshKomboKategori(komboTambahBarangKategori);
        tampilKartu("tambah barang");
    }//GEN-LAST:event_tombolBarangTambahActionPerformed

    private void tombolBarangEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBarangEditActionPerformed
        refreshKomboKategori(komboEditBarangKategori);
        String kode = tabelBarang.getValueAt(barisPilihan, 0).toString();
        inputEditBarangKode.setText(  tabelBarang.getValueAt(barisPilihan, 0).toString() );
        inputEditBarangNama.setText(  tabelBarang.getValueAt(barisPilihan, 1).toString() );
        inputEditBarangStok.setText(  tabelBarang.getValueAt(barisPilihan, 2).toString() );
        inputEditBarangHarga.setText(  tabelBarang.getValueAt(barisPilihan, 3).toString() );
        komboEditBarangKategori.setSelectedItem( tabelBarang.getValueAt(barisPilihan, 4).toString() );
        editBarangIdBarang.setText(  getDataQuery("SELECT id FROM barang WHERE kode='"+kode+"'") );
        tampilKartu("edit barang");
    }//GEN-LAST:event_tombolBarangEditActionPerformed

    private void tombolBarangHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBarangHapusActionPerformed
        String kode = tabelBarang.getValueAt(barisPilihan, 0).toString();
        sqlUpdate("DELETE FROM barang WHERE kode='"+kode+"'" );
        refreshBarang();
    }//GEN-LAST:event_tombolBarangHapusActionPerformed

    private void tombolTambahKategoriSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahKategoriSimpanActionPerformed
        String nama = inputTambahKategoriNama.getText();
        
        if(nama.equals("")){
            alert("Semua Field Wajib Diisi");
        }
        if(dataSudahAda("SELECT * FROM kategori WHERE nama='"+nama+"'")){
            alert("Kategori Sudah Ada");
            return;
        }
        
        sqlUpdate("INSERT INTO kategori VALUES (NULL, '"+nama+"')");
        inputTambahKategoriNama.setText("");
        refreshKategori();
    }//GEN-LAST:event_tombolTambahKategoriSimpanActionPerformed

    private void tombolTambahBarangSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahBarangSimpanActionPerformed
        String kode = inputTambahBarangKode.getText();
        String nama = inputTambahBarangNama.getText();
        String stok = inputTambahBarangStok.getText();
        String harga = inputTambahBarangHarga.getText();
        String kategori = komboTambahBarangKategori.getSelectedItem().toString();
        String id_kategori = getDataQuery("SELECT id FROM kategori WHERE nama='"+kategori+"'");
        
        if(bukanAngka(stok) || bukanAngka(harga) || Integer.parseInt(stok) <0 || Integer.parseInt(harga) <0){
            alert("Stok atau harga tidak valid");
            return;
        }
        if(kode.equals("") || nama.equals("") || stok.equals("") || harga.equals("")){
            alert("Semua Field Wajib diisi");
            return;
        }
        if(dataSudahAda("SELECT * FROM barang WHERE kode='"+kode+"'")){
            alert("Barang dengan kode "+kode+" sudah ada");
            return;
        }
        
        sqlUpdate("INSERT INTO barang VALUES (NULL ,'"+kode+"', '"+nama+"', "+stok+", "+harga+", "+id_kategori+")");
        inputTambahBarangKode.setText("");
        inputTambahBarangNama.setText("");
        inputTambahBarangStok.setText("");
        inputTambahBarangHarga.setText("");
        refreshBarang();
    }//GEN-LAST:event_tombolTambahBarangSimpanActionPerformed

    private void tombolPembayaranTambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolPembayaranTambahBarangActionPerformed
        String id_pembeli = pembayaranIdPembeli.getText();
        String kode = inputPembayaranKode.getText();
        String jumlah = inputPembayaranJumlah.getText();
        
        if (kode.equals("") || jumlah.equals("")){
            alert("Field kode dan jumlah wajib diisi");
            return;
        }
        if (bukanAngka(jumlah)) {
            alert("Jumlah Barang Error");
            return;
        }
        if (Integer.parseInt(jumlah) <= 0) {
            alert("Jumlah Barang Minimal 1");
            return;
        }
        if (!dataSudahAda("SELECT * FROM barang WHERE kode='"+kode+"'")){
            alert("Kode Barang Salah");
            return;
        }
        
        String id_barang = getDataQuery("SELECT id FROM barang WHERE kode='"+kode+"'");
        if (dataSudahAda("SELECT * FROM transaksi WHERE id_barang="+id_barang+" AND id_pembeli="+id_pembeli)){
            alert("Barang ini sudah ditambah");
            return;
        }
             
        int stok = Integer.parseInt(getDataQuery("SELECT stok FROM barang WHERE kode='"+kode+"'"));
        int jml = Integer.parseInt(jumlah);
        if (stok < jml) {
            alert("Stok tidak Cukup");
            return;
        }
        
        stok = stok - jml;
        sqlUpdate("UPDATE barang SET stok="+stok+" WHERE kode='"+kode+"'");
        sqlUpdate("INSERT INTO transaksi VALUES (NULL, "+id_pembeli+", "+id_barang+", "+jumlah+")");
        int total = getTotalPembayaran(id_pembeli);
        outputPembayaranTotalHarga.setText(Integer.toString(total));
        inputPembayaranKode.setText("");
        inputPembayaranJumlah.setText("1");
        refreshPembayaran(id_pembeli);
    }//GEN-LAST:event_tombolPembayaranTambahBarangActionPerformed

    private void tombolPembayaranCetakStrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolPembayaranCetakStrukActionPerformed
        String total = outputPembayaranTotalHarga.getText();
        String bayar = inputPembayaranDibayar.getText();
        
        if (total.equals("")){
            alert("Belum ada yang dibeli");
            return;
        }
        if (bayar.equals("")){
            alert("Field Dibayar Wajib diisi");
            return;
        } else if (bukanAngka(bayar)) {
            alert("Terdapat kesalahan pada Field Dibayar");
            return;
        }
        
        int nilai_total = Integer.parseInt(total);
        int nilai_bayar = Integer.parseInt(bayar);
        if (nilai_bayar < nilai_total){
            alert("Uang Kurang !!!");
            return;
        }
        
        new Struk(nilai_total, nilai_bayar).setVisible(true);
        pembayaranIdPembeli.setText("Id Pembeli");
        outputPembayaranTotalHarga.setText("");
        inputPembayaranKode.setText("");
        inputPembayaranDibayar.setText("");
        tampilKartu("selamat datang");
    }//GEN-LAST:event_tombolPembayaranCetakStrukActionPerformed

    private void tabelKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKategoriMouseClicked
        barisPilihan = tabelKategori.getSelectedRow();
        tombolOff(false);
    }//GEN-LAST:event_tabelKategoriMouseClicked

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        barisPilihan = tabelBarang.getSelectedRow();
        tombolOff(false);
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void tabelPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPembayaranMouseClicked
        barisPilihan = tabelPembayaran.getSelectedRow();
        tombolOff(false);
    }//GEN-LAST:event_tabelPembayaranMouseClicked

    private void tombolEditKategoriSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolEditKategoriSimpanActionPerformed
        String id = editKategoriIdKategori.getText();
        String nama = inputEditKategoriNama.getText();
        if(dataSudahAda("SELECT * FROM kategori WHERE id!="+id+" and nama='"+nama+"'")){
            alert("Nama Kategori Sudah Ada");
            return;
        }
        sqlUpdate("UPDATE kategori SET nama='"+nama+"' where id="+id);
        refreshKategori();
    }//GEN-LAST:event_tombolEditKategoriSimpanActionPerformed

    private void tombolEditBarangSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolEditBarangSimpanActionPerformed
        String id = editBarangIdBarang.getText();
        String kode = inputEditBarangKode.getText();
        String nama = inputEditBarangNama.getText();
        String stok = inputEditBarangStok.getText();
        String harga = inputEditBarangHarga.getText();
        String kategori = komboEditBarangKategori.getSelectedItem().toString();
        String id_kategori = getDataQuery("SELECT id FROM kategori WHERE nama='"+kategori+"'");
        
        if(bukanAngka(stok) || bukanAngka(harga) || Integer.parseInt(stok) <0 || Integer.parseInt(harga) <0){
            alert("Stok atau harga tidak valid");
            return;
        }
        if(kode.equals("") || nama.equals("") || stok.equals("") || harga.equals("")){
            alert("Semua Field Wajib diisi");
            return;
        }
        if(dataSudahAda("SELECT * FROM barang WHERE kode='"+kode+"' AND id!="+id)){
            alert("Barang dengan kode "+kode+" sudah ada");
            return;
        }
        
        sqlUpdate("UPDATE barang SET kode='"+kode+"', nama='"+nama+"', stok='"+stok+"', harga='"+harga+"', id_kategori="+id_kategori+" WHERE id="+id);
        inputTambahBarangKode.setText("");
        inputTambahBarangNama.setText("");
        inputTambahBarangStok.setText("");
        inputTambahBarangHarga.setText("");
        refreshBarang();
    }//GEN-LAST:event_tombolEditBarangSimpanActionPerformed

    private void tombolPembayaranHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolPembayaranHapusActionPerformed
        String kode = tabelPembayaran.getValueAt(barisPilihan, 0).toString();
        String id_pembeli = pembayaranIdPembeli.getText();
        String id_barang = getDataQuery("SELECT id FROM barang WHERE kode='"+kode+"'");
        
        int jumlah = Integer.parseInt( tabelPembayaran.getValueAt(barisPilihan, 2).toString() );
        int stok = Integer.parseInt( getDataQuery("SELECT stok FROM barang WHERE id="+id_barang) );
        stok = stok + jumlah;
        
        sqlUpdate("UPDATE barang SET stok="+stok+" where id="+id_barang);
        sqlUpdate("DELETE FROM transaksi WHERE id_pembeli="+id_pembeli+" AND id_barang="+id_barang);
        refreshPembayaran(id_pembeli);
    }//GEN-LAST:event_tombolPembayaranHapusActionPerformed

    private void tombolAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAdminActionPerformed
        String pass = javax.swing.JOptionPane.showInputDialog("Masukkan Password : ");
        if (pass == null) {
            return;
        }
        if (!pass.equals("rifki ganteng")){
            alert("Password Salah");
            return;
        }
        tampilMenu("menu admin");
        tombolKategoriActionPerformed(evt);
    }//GEN-LAST:event_tombolAdminActionPerformed

    private void tombolKasirKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKasirKembaliActionPerformed
        tampilMenu("menu utama");
        tampilKartu("selamat datang");
    }//GEN-LAST:event_tombolKasirKembaliActionPerformed

    private void tombolAdminKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolAdminKembaliActionPerformed
        tampilMenu("menu utama");
        tampilKartu("selamat datang");
    }//GEN-LAST:event_tombolAdminKembaliActionPerformed

    private void tombolKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKasirActionPerformed
        tampilMenu("menu kasir");
        tombolPembayaranActionPerformed(evt);
    }//GEN-LAST:event_tombolKasirActionPerformed

    private void inputPembayaranDibayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPembayaranDibayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPembayaranDibayarActionPerformed

    private void inputPembayaranKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPembayaranKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPembayaranKodeActionPerformed

    private void inputTambahKategoriNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTambahKategoriNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTambahKategoriNamaActionPerformed

    private void inputEditKategoriNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEditKategoriNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEditKategoriNamaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Utama().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel editBarangHarga;
    private javax.swing.JLabel editBarangIdBarang;
    private javax.swing.JLabel editBarangKategori;
    private javax.swing.JLabel editBarangKodeBarang;
    private javax.swing.JLabel editBarangNamaBarang;
    private javax.swing.JLabel editBarangStok;
    private javax.swing.JLabel editKategoriIdKategori;
    private javax.swing.JLabel editKategoriNamaKategori;
    private javax.swing.JTextField inputEditBarangHarga;
    private javax.swing.JTextField inputEditBarangKode;
    private javax.swing.JTextField inputEditBarangNama;
    private javax.swing.JTextField inputEditBarangStok;
    private javax.swing.JTextField inputEditKategoriNama;
    private javax.swing.JTextField inputPembayaranDibayar;
    private javax.swing.JTextField inputPembayaranJumlah;
    private javax.swing.JTextField inputPembayaranKode;
    private javax.swing.JTextField inputTambahBarangHarga;
    private javax.swing.JTextField inputTambahBarangKode;
    private javax.swing.JTextField inputTambahBarangNama;
    private javax.swing.JTextField inputTambahBarangStok;
    private javax.swing.JTextField inputTambahKategoriNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel judulBarang;
    private javax.swing.JLabel judulEditBarang;
    private javax.swing.JLabel judulEditKategori;
    private javax.swing.JLabel judulKategori;
    private javax.swing.JLabel judulPembayaran;
    private javax.swing.JLabel judulTambahBarang;
    private javax.swing.JLabel judulTambahKategori;
    private javax.swing.JComboBox<String> komboEditBarangKategori;
    private javax.swing.JComboBox<String> komboTambahBarangKategori;
    private javax.swing.JTextField outputPembayaranTotalHarga;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelBarang;
    private javax.swing.JPanel panelBarangMenu;
    private javax.swing.JPanel panelEditBarang;
    private javax.swing.JPanel panelEditKategori;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JPanel panelKartu;
    private javax.swing.JPanel panelKasir;
    private javax.swing.JPanel panelKategori;
    private javax.swing.JPanel panelKategoriMenu;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuUtama;
    private javax.swing.JPanel panelPembayaran;
    private javax.swing.JScrollPane panelScrollBarang;
    private javax.swing.JScrollPane panelScrollKategori;
    private javax.swing.JScrollPane panelScrollPembayaran;
    private javax.swing.JPanel panelSelamatDatang;
    private javax.swing.JPanel panelTambahBarang;
    private javax.swing.JPanel panelTambahKategori;
    private javax.swing.JPanel panellogolitemarket;
    private javax.swing.JLabel pembayaranDibayar;
    private javax.swing.JLabel pembayaranIdPembeli;
    private javax.swing.JLabel pembayaranJumlah;
    private javax.swing.JLabel pembayaranKodeBarang;
    private javax.swing.JLabel pembayaranTotalHarga;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTable tabelKategori;
    private javax.swing.JTable tabelPembayaran;
    private javax.swing.JLabel tambahBarangHarga;
    private javax.swing.JLabel tambahBarangKategori;
    private javax.swing.JLabel tambahBarangKodeBarang;
    private javax.swing.JLabel tambahBarangNamaBarang;
    private javax.swing.JLabel tambahBarangStok;
    private javax.swing.JLabel tambahKategoriNamaKategori;
    private javax.swing.JButton tombolAdmin;
    private javax.swing.JButton tombolAdminKembali;
    private javax.swing.JButton tombolBarang;
    private javax.swing.JButton tombolBarangEdit;
    private javax.swing.JButton tombolBarangHapus;
    private javax.swing.JButton tombolBarangTambah;
    private javax.swing.JButton tombolEditBarangSimpan;
    private javax.swing.JButton tombolEditKategoriSimpan;
    private javax.swing.JButton tombolKasir;
    private javax.swing.JButton tombolKasirKembali;
    private javax.swing.JButton tombolKategori;
    private javax.swing.JButton tombolKategoriEdit;
    private javax.swing.JButton tombolKategoriHapus;
    private javax.swing.JButton tombolKategoriTambah;
    private javax.swing.JButton tombolKeluar;
    private javax.swing.JButton tombolPembayaran;
    private javax.swing.JButton tombolPembayaranCetakStruk;
    private javax.swing.JButton tombolPembayaranHapus;
    private javax.swing.JButton tombolPembayaranTambahBarang;
    private javax.swing.JButton tombolTambahBarangSimpan;
    private javax.swing.JButton tombolTambahKategoriSimpan;
    // End of variables declaration//GEN-END:variables
}
