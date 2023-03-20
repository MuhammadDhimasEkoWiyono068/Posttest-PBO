/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author User
 */
public class Console extends Barang{
    private String IdConsole;
    
    public Console(String Nama, String IdConsole, int Stok, int Harga){
        super(Nama, Stok, Harga);
        this.IdConsole = IdConsole;
    }

    public String getIdConsole() {
        return IdConsole;
    }

    public void setIdConsole(String IdConsole) {
        this.IdConsole = IdConsole;
    }
    
    
}
