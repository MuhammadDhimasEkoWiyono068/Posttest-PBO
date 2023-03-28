/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author User
 */
public class Aksesoris extends Barang{
    private String IdAksesoris;
    
    public Aksesoris(String Nama, int Stok, int Harga, String IdAksesoris){
        super(Nama, Stok, Harga);
        this.IdAksesoris = IdAksesoris;
    }

    public String getIdAksesoris() {
        return IdAksesoris;
    }

    public void setIdAksesoris(String IdAksesoris) {
        this.IdAksesoris = IdAksesoris;
    }
    
    @Override
    public void displayBarang(){
        super.displayBarang();
        System.out.printf("|%-10s", this.IdAksesoris);
    }
    
    public void displayBarang(boolean showID){
        if(showID) displayBarang();
        else super.displayBarang();
    }
}
