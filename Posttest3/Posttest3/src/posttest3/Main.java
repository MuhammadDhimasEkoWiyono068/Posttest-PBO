/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest3;
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
        
        InputStreamReader x = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(x);
        Scanner pause = new Scanner (System.in);
        ArrayList<Console> DataConsole = new ArrayList<>();
        ArrayList<Game> DataGame = new ArrayList<>();
        ArrayList<Aksesoris> DataAksesoris = new ArrayList<>();
        
        while (true){
            System.out.println("|====================================|");
            System.out.println("|            Gaming Store            |");
            System.out.println("|====================================|");
            System.out.println("| 1. Tambah Barang                   |");
            System.out.println("| 2. Lihat Data Barang               |");
            System.out.println("| 3. Edit Data Barang                |");
            System.out.println("| 4. Hapus Data Barang               |");
            System.out.println("| 5. Quit                            |");
            System.out.println("|====================================|");
            System.out.print("\nMasukan Pilihan Anda : ");
            int select = Integer.parseInt(input.readLine());
            switch(select){
                case 1:
                    System.out.println("|===========================|");
                    System.out.println("|        Menu Tambah        |");
                    System.out.println("|===========================|");
                    System.out.println("| 1. Tambah Console         |");
                    System.out.println("| 2. Tambah Game            |");
                    System.out.println("| 3. Tambah Aksesoris       |");
                    System.out.println("| 4. Back                   |");
                    System.out.println("|===========================|");
                    System.out.print("\nMasukan Pilihan Anda : ");
                    int menu1 = Integer.parseInt(input.readLine());
                    switch (menu1){
                        case 1:
                            System.out.println("\n> Tambah Console");
                            System.out.print("Console      : ");
                            String NamaConsole = input.readLine();
                            System.out.print("ID Console   : ");
                            String IdConsole = input.readLine();
                            System.out.print("Stok Console : ");
                            int StokConsole = Integer.parseInt(input.readLine());
                            System.out.print("Harga        : Rp.");
                            int HargaConsole = Integer.parseInt(input.readLine());

                            Console new_console = new Console(NamaConsole, IdConsole, StokConsole, HargaConsole);
                            DataConsole.add(new_console);

                            System.out.println("\nData berhasil ditambahkan!");
                            System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                            pause.nextLine();
                            break;
                            
                        case 2:
                            System.out.println("\n> Tambah Game");
                            System.out.print("Nama Game  : ");
                            String NamaGame = input.readLine();
                            System.out.print("ID Kaset   : ");
                            String IdGame = input.readLine();
                            System.out.print("Stok Kaset : ");
                            int StokGame = Integer.parseInt(input.readLine());
                            System.out.print("Harga      : Rp.");
                            int HargaGame = Integer.parseInt(input.readLine());
                            System.out.print("Platform   : ");
                            String PlatformGame = input.readLine();

                            Game new_game = new Game(NamaGame, IdGame, StokGame, HargaGame, PlatformGame);
                            DataGame.add(new_game);

                            System.out.println("\nData berhasil ditambahkan!");
                            System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                            pause.nextLine();
                            break;
                            
                        case 3:
                            System.out.println("\n> Tambah Aksesoris");
                            System.out.print("Nama Aksesoris : ");
                            String NamaAksesoris = input.readLine();
                            System.out.print("ID Aksesoris   : ");
                            String IdAksesoris = input.readLine();
                            System.out.print("Stok Aksesoris : ");
                            int StokAksesoris = Integer.parseInt(input.readLine());
                            System.out.print("Harga          : Rp.");
                            int HargaAksesoris = Integer.parseInt(input.readLine());

                            Aksesoris new_aksesoris = new Aksesoris(NamaAksesoris, IdAksesoris, StokAksesoris, HargaAksesoris);
                            DataAksesoris.add(new_aksesoris);

                            System.out.println("\nData berhasil ditambahkan!");
                            System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                            pause.nextLine();
                            break;
                            
                        case 4:
                            break;
                        
                        default:
                            System.out.println("\nMenu tidak tersedia!\n");
                            break;
                    }
                    break;
                    
                case 2:
                    System.out.println("|==========================|");
                    System.out.println("|        Menu Lihat        |");
                    System.out.println("|==========================|");
                    System.out.println("| 1. Lihat Console         |");
                    System.out.println("| 2. Lihat Game            |");
                    System.out.println("| 3. Lihat Aksesoris       |");
                    System.out.println("| 4. Back                  |");
                    System.out.println("|==========================|");
                    System.out.print("\nMasukan Pilihan Anda : ");
                    int menu2 = Integer.parseInt(input.readLine());
                    switch (menu2){
                        case 1:
                            System.out.println("|====================================================================|");
                            System.out.println("|  No  |         Console         |    ID    |  Stok  |     Harga     |");
                            System.out.println("|====================================================================|");
                            for(int i =0; i < DataConsole.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                System.out.printf("|%-25s" , DataConsole.get(i).getNama());
                                System.out.printf("|%-10s", DataConsole.get(i).getIdConsole());
                                System.out.printf("|%-8s", DataConsole.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataConsole.get(i).getHarga());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|====================================================================|");
                            System.out.println("\nTekan [ENTER] untuk melanjutkan");
                            pause.nextLine();
                            break;
                            
                        case 2:
                            System.out.println("|==================================================================================|");
                            System.out.println("|  No  |           Game           |    ID    |  Stok  |     Harga     |  Platform  |");
                            System.out.println("|==================================================================================|");
                            for(int i =0; i < DataGame.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                System.out.printf("|%-26s" , DataGame.get(i).getNama());
        //                        System.out.printf("|%-26s|%-10s|%-8s|%-15s|%-12s|", Nama_Game, ID, Stok, Harga, Platform);
                                System.out.printf("|%-10s", DataGame.get(i).getIdKaset());
                                System.out.printf("|%-8s", DataGame.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataGame.get(i).getHarga());
                                System.out.printf("|%-12s", DataGame.get(i).getPlatform());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|==================================================================================|");
                            System.out.println("\nTekan [ENTER] untuk melanjutkan");
                            pause.nextLine();
                            break;
                            
                        case 3:
                            System.out.println("|======================================================================|");
                            System.out.println("|  No  |         Aksesoris         |    ID    |  Stok  |     Harga     |");
                            System.out.println("|======================================================================|");
                            for(int i =0; i < DataAksesoris.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                System.out.printf("|%-27s" , DataAksesoris.get(i).getNama());
                                System.out.printf("|%-10s", DataAksesoris.get(i).getIdAksesoris());
                                System.out.printf("|%-8s", DataAksesoris.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataAksesoris.get(i).getHarga());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|======================================================================|");
                            System.out.println("\nTekan [ENTER] untuk melanjutkan");
                            pause.nextLine();
                            break;
                            
                        case 4:
                            break;
                        
                        default:
                            System.out.println("\nMenu tidak tersedia!\n");
                            break;
                    }
                    break;
                    
                case 3:
                    System.out.println("|=========================|");
                    System.out.println("|        Menu Edit        |");
                    System.out.println("|=========================|");
                    System.out.println("| 1. Edit Console         |");
                    System.out.println("| 2. Edit Game            |");
                    System.out.println("| 3. Edit Aksesoris       |");
                    System.out.println("| 4. Back                 |");
                    System.out.println("|=========================|");
                    System.out.print("\nMasukan Pilihan Anda : ");
                    int menu3 = Integer.parseInt(input.readLine());
                    switch (menu3){
                        case 1:
                            System.out.println("|====================================================================|");
                            System.out.println("|  No  |         Console         |    ID    |  Stok  |     Harga     |");
                            System.out.println("|====================================================================|");
                            for(int i =0; i < DataConsole.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                System.out.printf("|%-25s" , DataConsole.get(i).getNama());
                                System.out.printf("|%-10s", DataConsole.get(i).getIdConsole());
                                System.out.printf("|%-8s", DataConsole.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataConsole.get(i).getHarga());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|====================================================================|");
                            System.out.println("\n> Edit Data Console");
                            System.out.print("\nInput ID : ");
                            String EditIdConsole = input.readLine();
                            
                            for (Console console : DataConsole){
                                if (console.getIdConsole().equals(EditIdConsole)) {
                                    System.out.print("Console      : ");
                                    console.setNama(input.readLine());
                                    System.out.print("ID console   : ");
                                    console.setIdConsole(input.readLine());
                                    System.out.print("Stok Console : ");
                                    console.setStok(Integer.parseInt(input.readLine()));
                                    System.out.print("Harga        : Rp.");
                                    console.setHarga(Integer.parseInt(input.readLine()));

                                    System.out.println("\nData berhasil diupdate!");
                                    System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                                    pause.nextLine();
                                    break;
                                }
                            }
                            break;
                        
                        case 2:
                            System.out.println("|==================================================================================|");
                            System.out.println("|  No  |           Game           |    ID    |  Stok  |     Harga     |  Platform  |");
                            System.out.println("|==================================================================================|");
                            for(int i =0; i < DataGame.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                System.out.printf("|%-26s" , DataGame.get(i).getNama());
                                System.out.printf("|%-10s", DataGame.get(i).getIdKaset());
                                System.out.printf("|%-8s", DataGame.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataGame.get(i).getHarga());
                                System.out.printf("|%-12s", DataGame.get(i).getPlatform());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|==================================================================================|");
                            System.out.println("\n> Edit Data Game");
                            System.out.print("\nInput ID : ");
                            String EditIdGame = input.readLine();

                            for (Game game : DataGame){
                                if (game.getIdKaset().equals(EditIdGame)) {
                                    System.out.print("Nama Game  : ");
                                    game.setNama(input.readLine());
                                    System.out.print("ID Kaset   : ");
                                    game.setIdKaset(input.readLine());
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
                            
                        case 3:
                            System.out.println("|======================================================================|");
                            System.out.println("|  No  |         Aksesoris         |    ID    |  Stok  |     Harga     |");
                            System.out.println("|======================================================================|");
                            for(int i =0; i < DataAksesoris.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                System.out.printf("|%-27s" , DataAksesoris.get(i).getNama());
                                System.out.printf("|%-10s", DataAksesoris.get(i).getIdAksesoris());
                                System.out.printf("|%-8s", DataAksesoris.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataAksesoris.get(i).getHarga());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|======================================================================|");
                            System.out.println("\n> Edit Data Aksesoris");
                            System.out.print("\nInput ID : ");
                            String EditIdAksesoris = input.readLine();
                            
                            for (Aksesoris aksesoris : DataAksesoris){
                                if (aksesoris.getIdAksesoris().equals(EditIdAksesoris)) {
                                    System.out.print("Nama Aksesoris  : ");
                                    aksesoris.setNama(input.readLine());
                                    System.out.print("ID Aksesoris    : ");
                                    aksesoris.setIdAksesoris(input.readLine());
                                    System.out.print("Stok Aksesoris  : ");
                                    aksesoris.setStok(Integer.parseInt(input.readLine()));
                                    System.out.print("Harga           : Rp.");
                                    aksesoris.setHarga(Integer.parseInt(input.readLine()));

                                    System.out.println("\nData berhasil diupdate!");
                                    System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                                    pause.nextLine();
                                    break;
                                }
                            }
                            break;
                            
                        case 4:
                            break;
                        
                        default:
                            System.out.println("\nMenu tidak tersedia!\n");
                            break;
                    }
                    break;
                    
                    
                case 4:
                    System.out.println("|==========================|");
                    System.out.println("|        Menu Hapus        |");
                    System.out.println("|==========================|");
                    System.out.println("| 1. Hapus Console         |");
                    System.out.println("| 2. Hapus Game            |");
                    System.out.println("| 3. Hapus Aksesoris       |");
                    System.out.println("| 4. Back                  |");
                    System.out.println("|==========================|");
                    System.out.print("\nMasukan Pilihan Anda : ");
                    int menu4 = Integer.parseInt(input.readLine());
                    switch (menu4){
                        case 1:
                            System.out.println("|====================================================================|");
                            System.out.println("|  No  |         Console         |    ID    |  Stok  |     Harga     |");
                            System.out.println("|====================================================================|");
                            for(int i =0; i < DataConsole.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                System.out.printf("|%-25s" , DataConsole.get(i).getNama());
                                System.out.printf("|%-10s", DataConsole.get(i).getIdConsole());
                                System.out.printf("|%-8s", DataConsole.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataConsole.get(i).getHarga());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|====================================================================|");
                            System.out.println("\n> Hapus Data Console");
                            System.out.print("\n Input ID : ");
                            String HapusIdConsole = input.readLine();
                            
                            for (int i = 0; i < DataConsole.size(); i++){
                                if (DataConsole.get(i).getIdConsole().equals(HapusIdConsole)) {
                                    DataConsole.remove(i);
                                    System.out.println("\nData berhasil dihapus!");
                                    System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                                    pause.nextLine();
                                    break;
                                }
                            }
                            break;
                        
                        case 2:
                            System.out.println("|==================================================================================|");
                            System.out.println("|  No  |           Game           |    ID    |  Stok  |     Harga     |  Platform  |");
                            System.out.println("|==================================================================================|");
                            for(int i =0; i < DataGame.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                System.out.printf("|%-26s" , DataGame.get(i).getNama());
                                System.out.printf("|%-10s", DataGame.get(i).getIdKaset());
                                System.out.printf("|%-8s", DataGame.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataGame.get(i).getHarga());
                                System.out.printf("|%-12s", DataGame.get(i).getPlatform());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|==================================================================================|");
                            System.out.println("\n> Hapus Data Game");
                            System.out.print("\n Input ID : ");
                            String HapusIdGame = input.readLine();

                            for (int i = 0; i < DataGame.size(); i++){
                                if (DataGame.get(i).getIdKaset().equals(HapusIdGame)) {
                                    DataGame.remove(i);
                                    System.out.println("\nData berhasil dihapus!");
                                    System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                                    pause.nextLine();
                                    break;
                                }
                            }
                            break;
                        
                        case 3:
                            System.out.println("|======================================================================|");
                            System.out.println("|  No  |         Aksesoris         |    ID    |  Stok  |     Harga     |");
                            System.out.println("|======================================================================|");
                            for(int i =0; i < DataAksesoris.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                System.out.printf("|%-27s" , DataAksesoris.get(i).getNama());
                                System.out.printf("|%-10s", DataAksesoris.get(i).getIdAksesoris());
                                System.out.printf("|%-8s", DataAksesoris.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataAksesoris.get(i).getHarga());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|======================================================================|");
                            System.out.println("\n> Hapus Data Aksesoris");
                            System.out.print("\n Input ID : ");
                            String HapusIdAksesoris = input.readLine();
                            
                            for (int i = 0; i < DataAksesoris.size(); i++){
                                if (DataAksesoris.get(i).getIdAksesoris().equals(HapusIdAksesoris)) {
                                    DataAksesoris.remove(i);
                                    System.out.println("\nData berhasil dihapus!");
                                    System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                                    pause.nextLine();
                                    break;
                                }
                            }
                            break;
                            
                        case 4:
                            break;
                        
                        default:
                            System.out.println("\nMenu tidak tersedia!\n");
                            break;
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
