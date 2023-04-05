/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author User
 */
public class Game extends Barang{
    private String IdKaset;
    private String Platform;
    
    public Game(String Nama, int Stok, int Harga, String Platform, String IdKaset){
        super(Nama, Stok, Harga);
        this.IdKaset = IdKaset;
        this.Platform = Platform;
    }

    public String getIdKaset() {
        return IdKaset;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setIdKaset(String IdKaset) {
        this.IdKaset = IdKaset;
    }

    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }
    
    public final void psBerapa(){
          System.out.print("PS4");
    }
    
    @Override
    public void displayBarang(){
        System.out.printf("|%-30s" , this.Nama);
        System.out.printf("|%-8s", this.Stok);
        System.out.printf("|%-15s", this.Harga);
        System.out.printf("|%-12s", this.Platform);
    }
}
