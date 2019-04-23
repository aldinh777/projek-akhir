package minimarket;

public class Minimarket {

    public static java.sql.Connection koneksi;
    public static java.sql.ResultSet hasilQuery;
    public static javax.swing.JTable[] tabel;
    public static javax.swing.JButton[] tombolMati;
    public static javax.swing.JPanel panelKartu;
    public static javax.swing.JPanel panelMenu;
    private static javax.swing.table.DefaultTableModel model;

    public static int barisPilihan;

    private static boolean connect(String database, String user, String password){
        try {
            koneksi = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database, user, password);
            return true;
        } catch (java.sql.SQLException ex) {
            System.out.println("Gagal Konek ke Database !!!");
            System.out.println("Error : "+ex.getMessage());
            return false;
        }
    }
    private static void initDatabase(){
        sqlUpdate("CREATE TABLE IF NOT EXISTS kategori ("
                + "id INT NOT NULL AUTO_INCREMENT, "
                + "nama VARCHAR(255) NOT NULL, "
                + "PRIMARY KEY (id)) "
                + "ENGINE = InnoDB"
        );
        sqlUpdate("CREATE TABLE IF NOT EXISTS barang ("
                + "id INT NOT NULL AUTO_INCREMENT, "
                + "kode VARCHAR(32) NOT NULL, "
                + "nama VARCHAR(255) NOT NULL, "
                + "stok int NOT NULL, "
                + "harga int NOT NULL, "
                + "id_kategori int NOT NULL, "
                + "PRIMARY KEY (id), "
                + "FOREIGN KEY (id_kategori) REFERENCES kategori (id) ON DELETE CASCADE ON UPDATE CASCADE) "
                + "ENGINE = InnoDB"
        );
        sqlUpdate("CREATE TABLE IF NOT EXISTS pembeli ("
                + "id INT NOT NULL AUTO_INCREMENT, "
                + "PRIMARY KEY (id)) "
                + "ENGINE = InnoDB"
        );
        sqlUpdate("CREATE TABLE IF NOT EXISTS transaksi ("
                + "id INT NOT NULL AUTO_INCREMENT, "
                + "id_pembeli INT NOT NULL, "
                + "id_barang INT NOT NULL, "
                + "jumlah INT NOT NULL, "
                + "PRIMARY KEY (id), "
                + "FOREIGN KEY (id_pembeli) REFERENCES pembeli (id) ON DELETE CASCADE ON UPDATE CASCADE, "
                + "FOREIGN KEY (id_barang) REFERENCES barang (id) ON DELETE CASCADE ON UPDATE CASCADE) "
                + "ENGINE = InnoDB"
        );
    }
    private static void buatModelTabel(String[] isi){
        model = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                isi
        ){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }
        };
    }
    private static void fetchModel(String query){
        try{
            sqlQuery(query);
            while (hasilQuery.next()) {
                int kolom = model.getColumnCount();
                Object[] data = new Object[kolom];
                for (int i = 0; i < kolom; i++) {
                    data[i] = hasilQuery.getString(i+1);
                }
                model.addRow(data);
            }
        } catch (java.sql.SQLException ex) {
            System.out.println("Gagal Fetch Hasil Query !!!");
            System.out.println("Error : "+ex.getMessage());
        }
    }

    public static boolean sqlUpdate(String query){
        try{
            koneksi.createStatement().executeUpdate(query);
            return true;
        } catch (java.sql.SQLException ex) {
            printQueryError(query, ex);
            return false;
        }
    }
    public static boolean sqlQuery(String query){
        try{
            hasilQuery = koneksi.createStatement().executeQuery(query);
            return true;
        } catch (java.sql.SQLException ex) {
            printQueryError(query, ex);
            return false;
        }
    }
    public static boolean bukanAngka(String sesuatu){
        try{
            Integer.parseInt(sesuatu);
        } catch (java.lang.NumberFormatException ex) {
            return true;
        }
        return false;
    }

    public static int getTotalPembayaran(String id){
        int total = 0;
        try{
            sqlQuery("SELECT transaksi.jumlah*barang.harga as total "
                + "FROM pembeli JOIN transaksi ON transaksi.id_pembeli=pembeli.id JOIN barang ON transaksi.id_barang=barang.id "
                + "WHERE pembeli.id="+id
            );
            while (hasilQuery.next()) {
                total += hasilQuery.getInt("total");
            }
        } catch (java.sql.SQLException ex) {
            System.out.println("Gagal Menghitung Total Pembayaran !!!");
            System.out.println("Error : "+ex.getMessage());
        }
        return total;
    }

    public static boolean tabelKosong(String tabel){
        try{
            sqlQuery("SELECT * FROM "+tabel);
            hasilQuery.next();
            hasilQuery.getString(1);
            return false;
        } catch (java.sql.SQLException ex) {
            return true;
        }
    }
    public static boolean dataSudahAda(String query){
        try{
            sqlQuery(query);
            hasilQuery.next();
            hasilQuery.getString(1);
            return true;
        } catch (java.sql.SQLException ex) {
            return false;
        }
    }
    
    public static String getDataQuery(String query){
        try{
            sqlQuery(query);
            hasilQuery.next();
            return hasilQuery.getString(1);
        } catch (java.sql.SQLException ex) {
            System.out.println("Gagal Mendapatkan Data !!!");
            System.out.println("Error : "+ex.getMessage());
            return null;
        }
    }
    
    public static void alert(String pesan){
        javax.swing.JOptionPane.showMessageDialog(null, pesan);
    }
    public static void printQueryError(String query, java.sql.SQLException ex){
        System.out.println("Gagal Mengeksekusi Query");
        System.out.println("Query : "+query);
        System.out.println("Error : "+ex.getMessage());
    }
    public static void tombolOff(boolean status){
        for (javax.swing.JButton tombol : tombolMati) {
            if (status) {
                tombol.setEnabled(false);
                continue;
            }
            tombol.setEnabled(true);
        }
    }
    public static void refreshPembayaran(String id){
        buatModelTabel(new String[]{"Kode", "Nama", "Jumlah", "Harga", "Total"});
        fetchModel("SELECT barang.kode, barang.nama, transaksi.jumlah, barang.harga, transaksi.jumlah*barang.harga as total "
                + "FROM pembeli JOIN transaksi ON transaksi.id_pembeli=pembeli.id JOIN barang ON transaksi.id_barang=barang.id "
                + "WHERE pembeli.id="+id
        );
        tabel[0].setModel(model);
        tombolOff(true);
        tampilKartu("pembayaran");
    }
    public static void refreshKategori(){
        buatModelTabel(new String[]{"Kode", "Nama"});
        fetchModel("SELECT id, nama FROM kategori");
        tabel[1].setModel(model);
        tombolOff(true);
        tampilKartu("kategori");
    }
    public static void refreshBarang(){
        buatModelTabel(new String[]{"Kode", "Nama", "Stok", "Harga", "Kategori"});
        fetchModel("SELECT barang.kode, barang.nama, barang.stok, barang.harga, kategori.nama "
                + "FROM barang JOIN kategori ON barang.id_kategori=kategori.id");
        tabel[2].setModel(model);
        tombolOff(true);
        tampilKartu("barang");
    }
    public static void refreshKomboKategori(javax.swing.JComboBox c){
        try {
            javax.swing.DefaultComboBoxModel kombo = new javax.swing.DefaultComboBoxModel<>();
            sqlQuery("SELECT * FROM kategori");
            while(hasilQuery.next()){
                String data = hasilQuery.getString("nama");
                kombo.addElement(data);
            }
            c.setModel(kombo);
        } catch (java.sql.SQLException ex) {
            System.out.println("Gagal Refresh Kombo Kategori : "+ex.getMessage());
        }
    }
    public static void tampilKartu(String nama){
        ((java.awt.CardLayout)panelKartu.getLayout()).show(panelKartu, nama);
    }
    public static void tampilMenu(String nama){
        ((java.awt.CardLayout)panelMenu.getLayout()).show(panelMenu, nama);
    }
    public static void main(String[] args) {
        if(connect("minimarket", "root", "")){
            initDatabase();
            Utama.main(args);
        }
    }
}
