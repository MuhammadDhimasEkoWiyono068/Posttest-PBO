/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

//import static posttest4.Main.DataConsole;

/**
 *
 * @author User
 */
public abstract class Barang {
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
    
    public abstract void displayBarang();
    
    
//    {
//        System.out.printf("|%-30s" , this.Nama);
//        System.out.printf("|%-8s", this.Stok);
//        System.out.printf("|%-15s", this.Harga);
//    }
    
}
