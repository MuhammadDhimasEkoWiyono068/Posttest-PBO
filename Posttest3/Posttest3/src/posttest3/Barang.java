/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author User
 */
public class Barang {
    protected String Nama;
    protected int Stok, Harga;
    
    public Barang(String Nama, int Stok, int Harga){
        this.Nama = Nama;
        this.Stok = Stok;
        this.Harga = Harga;
    }

    public String getNama() {
        return Nama;
    }

    public int getStok() {
        return Stok;
    }

    public int getHarga() {
        return Harga;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    
    
}
