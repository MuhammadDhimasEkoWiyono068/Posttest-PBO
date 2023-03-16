/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest2;
import java.io.*;
import java.util.*;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws NumberFormatException, IOException {
        // TODO code application logic here
        String Nama_Game;
        String ID;
        String Platform;
        int Stok;
        int Harga;
        
        InputStreamReader x = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(x);
        Scanner pause = new Scanner (System.in);
        ArrayList<Game> DataGame = new ArrayList<>();
        
        while (true){
            System.out.println("|=================================|");
            System.out.println("|            GameStore            |");
            System.out.println("|=================================|");
            System.out.println("| 1. Tambah Data Kaset            |");
            System.out.println("| 2. Lihat Data Kaset             |");
            System.out.println("| 3. Edit Data Kaset              |");
            System.out.println("| 4. Hapus Data Kaset             |");
            System.out.println("| 5. Quit                         |");
            System.out.println("|=================================|");
            System.out.print("\nMasukan Pilihan Anda : ");
            int select = Integer.parseInt(input.readLine());
            switch(select){
                case 1:
                    System.out.println("\n> Tambah Game");
                    System.out.print("Nama Game  : ");
                    Nama_Game = input.readLine();
                    System.out.print("ID Kaset   : ");
                    ID = input.readLine();
                    System.out.print("Stok Kaset : ");
                    Stok = Integer.parseInt(input.readLine());
                    System.out.print("Harga      : Rp.");
                    Harga = Integer.parseInt(input.readLine());
                    System.out.print("Platform   : ");
                    Platform = input.readLine();
                    
                    Game new_data = new Game(Nama_Game, ID, Stok, Harga, Platform);
                    DataGame.add(new_data);
                    
                    System.out.println("\nData berhasil ditambahkan!");
                    System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                    pause.nextLine();
                    break;
                    
                case 2:
                    System.out.println("|==================================================================================|");
                    System.out.println("|  No  |           Game           |    ID    |  Stok  |   Harga(Rp)   |  Platform  |");
                    System.out.println("|==================================================================================|");
                    for(int i =0; i < DataGame.size(); i++){
                        System.out.printf( "|%-6s" , (i+1));
                        System.out.printf("|%-26s" , DataGame.get(i).getNama_Game());
//                        System.out.printf("|%-26s|%-10s|%-8s|%-15s|%-12s|", Nama_Game, ID, Stok, Harga, Platform);
                        System.out.printf("|%-10s", DataGame.get(i).getID());
                        System.out.printf("|%-8s", DataGame.get(i).getStok());
                        System.out.printf("|%-15s", DataGame.get(i).getHarga());
                        System.out.printf("|%-12s", DataGame.get(i).getPlatform());
                        System.out.printf("|");
                        System.out.printf("\n");
                    }
                    System.out.println("|==================================================================================|");
                    System.out.println("\nTekan [ENTER] untuk melanjutkan");
                    pause.nextLine();
                    break;
                    
                case 3:
                    System.out.println("|==================================================================================|");
                    System.out.println("|  No  |           Game           |    ID    |  Stok  |   Harga(Rp)   |  Platform  |");
                    System.out.println("|==================================================================================|");
                    for(int i =0; i < DataGame.size(); i++){
                        System.out.printf( "|%-6s" , (i+1));
                        System.out.printf("|%-26s" , DataGame.get(i).getNama_Game());
                        System.out.printf("|%-10s", DataGame.get(i).getID());
                        System.out.printf("|%-8s", DataGame.get(i).getStok());
                        System.out.printf("|%-15s", DataGame.get(i).getHarga());
                        System.out.printf("|%-12s", DataGame.get(i).getPlatform());
                        System.out.printf("|");
                        System.out.printf("\n");
                    }
                    System.out.println("|==================================================================================|");
                    System.out.println("\n> Edit Data Game");
                    System.out.print("\nInput ID : ");
                    String EditID = input.readLine();
                    
                    for (Game game : DataGame){
                        if (game.getID().equals(EditID)) {
                            System.out.print("Nama Game  : ");
                            game.setNama_Game(input.readLine());
                            System.out.print("ID Kaset   : ");
                            game.setID(input.readLine());
                            System.out.print("Stok Kaset : ");
                            game.setStok(Integer.parseInt(input.readLine()));
                            System.out.print("Harga      : Rp.");
                            game.setHarga(Integer.parseInt(input.readLine()));
                            System.out.print("Platform   : ");
                            game.setPlatform(input.readLine());

                            System.out.println("\nData berhasil diupdate!");
                            System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                            pause.nextLine();
                            break;
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("|==================================================================================|");
                    System.out.println("|  No  |           Game           |    ID    |  Stok  |   Harga(Rp)   |  Platform  |");
                    System.out.println("|==================================================================================|");
                    for(int i =0; i < DataGame.size(); i++){
                        System.out.printf( "|%-6s" , (i+1));
                        System.out.printf("|%-26s" , DataGame.get(i).getNama_Game());
                        System.out.printf("|%-10s", DataGame.get(i).getID());
                        System.out.printf("|%-8s", DataGame.get(i).getStok());
                        System.out.printf("|%-15s", DataGame.get(i).getHarga());
                        System.out.printf("|%-12s", DataGame.get(i).getPlatform());
                        System.out.printf("|");
                        System.out.printf("\n");
                    }
                    System.out.println("|==================================================================================|");
                    System.out.println("\n> Hapus Data Game");
                    System.out.print("\n Input ID : ");
                    String HapusID = input.readLine();
                    
                    for (int i = 0; i < DataGame.size(); i++){
                        if (DataGame.get(i).getID().equals(HapusID)) {
                            DataGame.remove(i);
                            System.out.println("\nData berhasil dihapus!");
                            System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                            pause.nextLine();
                            break;
                        }
                    }
                    break;
                    
                case 5 :
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("\nMenu tidak tersedia!\n");
                    break;
            }
        }
    }
    
}
