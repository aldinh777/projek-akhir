package resource;

import actor.Pemasok;

public class Barang {
    private int id;
    private final String nama;
    private final Pemasok pemasok;
    private final int jumlah;
    private final double harga;
    
    public static int counter;
    
    public Barang(Pemasok pemasok, String nama, int jumlah, double harga){
        this.nama = nama;
        this.pemasok = pemasok;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }
    public int getJumlah() {
        return jumlah;
    }
    public double getHarga() {
        return harga;
    }
    @Override
    public String toString(){
        return nama+" : BTC. "+harga+" ("+jumlah+")";
    }
}