/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;


/**
 *
 * @author User
 */
public class Console extends Barang{
    private String IdConsole;
    
    public Console(String Nama, int Stok, int Harga,  String IdConsole){
        super(Nama, Stok, Harga);
        this.IdConsole = IdConsole;
    }

    public String getIdConsole() {
        return IdConsole;
    }

    public void setIdConsole(String IdConsole) {
        this.IdConsole = IdConsole;
    }
    
    @Override
    public void displayBarang(){
        System.out.printf("|%-30s" , this.Nama);
        System.out.printf("|%-8s", this.Stok);
        System.out.printf("|%-15s", this.Harga);
    }
    
    public void displayBarang(boolean NoShowID){
        if(NoShowID) displayBarang();
        else {
            displayBarang();
            System.out.printf("|%-10s", this.IdConsole);
        }
    }
}
