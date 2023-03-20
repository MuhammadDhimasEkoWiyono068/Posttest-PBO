/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author User
 */
public class Aksesoris extends Barang{
    private String IdAksesoris;
    
    public Aksesoris(String Nama, String IdAksesoris, int Stok, int Harga){
        super(Nama, Stok, Harga);
        this.IdAksesoris = IdAksesoris;
    }

    public String getIdAksesoris() {
        return IdAksesoris;
    }

    public void setIdAksesoris(String IdAksesoris) {
        this.IdAksesoris = IdAksesoris;
    }
    
    
}
