/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2;

/**
 *
 * @author User
 */
public class Game {
    private String Nama_Game;
    private String ID;
    private String Platform;
    private int Stok;
    private int Harga;
    
    Game(String Nama_Game, String ID, int Stok, int Harga, String Platform){
        this.Nama_Game = Nama_Game;
        this.ID = ID;
        this.Stok = Stok;
        this.Harga = Harga;
        this.Platform = Platform;
    }
    
    void display(){
        System.out.printf("|%-26s|%-10s|%-8s|%-15s|%-12s|", Nama_Game, ID, Stok, Harga, Platform);
        System.out.printf("\n");
    }
    
//    public void UpdateNamaGame(String Nama_Game){
//        this.Nama_Game = Nama_Game;
//    }
//    
//    public void UpdateID(String ID){
//        this.ID = ID;
//    }
//    
//    public void UpdateStok(int Stok){
//        this.Stok = Stok;
//    }
//    
//    public void UpdateHarga (int Harga){
//        this.Harga = Harga;
//    }
//    
//    public void UpdatePlatform (String Platform){
//        this.Platform = Platform;
//    }
//    
//    public String getID(){
//        return ID;
//    }

    public String getNama_Game() {
        return Nama_Game;
    }

    public String getID() {
        return ID;
    }

    public String getPlatform() {
        return Platform;
    }

    public int getStok() {
        return Stok;
    }

    public int getHarga() {
        return Harga;
    }

    public void setNama_Game(String Nama_Game) {
        this.Nama_Game = Nama_Game;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }
    
    
    
}
