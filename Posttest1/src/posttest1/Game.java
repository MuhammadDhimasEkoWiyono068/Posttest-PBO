/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author User
 */
public class Game {
    public String Nama_Game;
    public String ID;
    public String Platform;
    public int Stok;
    public int Harga;
    
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
    
    public void UpdateNamaGame(String Nama_Game){
        this.Nama_Game = Nama_Game;
    }
    
    public void UpdateID(String ID){
        this.ID = ID;
    }
    
    public void UpdateStok(int Stok){
        this.Stok = Stok;
    }
    
    public void UpdateHarga (int Harga){
        this.Harga = Harga;
    }
    
    public void UpdatePlatform (String Platform){
        this.Platform = Platform;
    }
    
    public String getID(){
        return ID;
    }
}
