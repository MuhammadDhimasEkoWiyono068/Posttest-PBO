/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author User
 */
public class Game extends Barang{
    private String IdKaset;
    private String Platform;
    
    public Game(String Nama, String IdKaset, int Stok, int Harga, String Platform){
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
    
    
    
}
