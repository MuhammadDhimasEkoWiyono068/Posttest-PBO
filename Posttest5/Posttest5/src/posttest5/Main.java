/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest5;
import java.io.*;
import java.util.*;
/**
 *
 * @author User
 */

public class Main {
    static InputStreamReader x = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(x);
    static Scanner pause = new Scanner (System.in);
    static ArrayList<Console> DataConsole = new ArrayList<>(){
        {   
            add(new Console("PS5 DIGITAL", 5, 8199000, "C003"));
            add(new Console("PS3 SLIM", 10, 1799000, "C001"));
            add(new Console("PS4 PRO", 17, 4199000, "C002"));
        }
    };
    static ArrayList<Game> DataGame = new ArrayList<>(){
        {
            add(new Game("SEKIRO", 25, 729000, "PS4", "G001"));
            add(new Game("DARK SOULS 3", 45, 587000, "PS4", "G002"));
            add(new Game("ELDEN RING", 33, 599000, "PS5", "G003"));
            add(new Game("DARK SOULS REMASTERED", 18, 320000, "PS3", "G004"));
        }
    };
        
    static ArrayList<Aksesoris> DataAksesoris = new ArrayList<>(){
        {
            add(new Aksesoris("Controller PS4", 20, 820000, "A001"));
            add(new Aksesoris("Controller PS3 Kabel", 25, 70000, "A002"));
            add(new Aksesoris("Controller PS5", 13, 1200000, "A003"));
        }
    };
    
    static final void delete() throws IOException{
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
                System.out.println("|=========================================================================|");
                System.out.println("|  No  |            Console           |  Stok  |     Harga     |    ID    |");
                System.out.println("|=========================================================================|");
                for(int i =0; i < DataConsole.size(); i++){
                    System.out.printf( "|%-6s" , (i+1));
                    DataConsole.sort(Comparator.comparing(Console::getNama));
                    DataConsole.get(i).displayBarang(false);
                    System.out.printf("|");
                    System.out.printf("\n");
                }
                System.out.println("|=========================================================================|");
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
                System.out.println("|  No  |           Game           |  Stok  |     Harga     |  Platform  |    ID    |");
                System.out.println("|==================================================================================|");
                for(int i =0; i < DataGame.size(); i++){
                    System.out.printf( "|%-6s" , (i+1));
                    DataGame.sort(Comparator.comparing(Game::getPlatform));
                    System.out.printf("|%-26s" , DataGame.get(i).getNama());
                    System.out.printf("|%-8s", DataGame.get(i).getStok());
                    System.out.printf("|%-15s", "Rp." + DataGame.get(i).getHarga());
                    System.out.printf("|%-12s", DataGame.get(i).getPlatform());
                    System.out.printf("|%-10s", DataGame.get(i).getIdKaset());
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
                System.out.println("|=========================================================================|");
                System.out.println("|  No  |           Aksesoris          |  Stok  |     Harga     |    ID    |");
                System.out.println("|=========================================================================|");
                for(int i =0; i < DataAksesoris.size(); i++){
                    System.out.printf( "|%-6s" , (i+1));
                    DataAksesoris.sort(Comparator.comparing(Aksesoris::getNama));
                    DataAksesoris.get(i).displayBarang(false);
                    System.out.printf("|");
                    System.out.printf("\n");
                }
                System.out.println("|=========================================================================|");
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
    }
    
    static void menuAdmin() throws IOException{
        boolean loop = true;
        while (loop){
            System.out.println("\n|==================================|");
            System.out.println("|            Menu Admin            |");
            System.out.println("|==================================|");
            System.out.println("| 1. Tambah Barang                 |");
            System.out.println("| 2. Lihat Data Barang             |");
            System.out.println("| 3. Edit Data Barang              |");
            System.out.println("| 4. Hapus Data Barang             |");
            System.out.println("| 5. Quit                          |");
            System.out.println("|==================================|");
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
                            System.out.print("Console      : "); String NamaConsole = input.readLine();
                            System.out.print("Stok Console : "); int StokConsole = Integer.parseInt(input.readLine());
                            System.out.print("Harga        : Rp."); int HargaConsole = Integer.parseInt(input.readLine());
                            System.out.print("ID Console   : "); String IdConsole = input.readLine();
                            
                            Console new_console = new Console(NamaConsole, StokConsole, HargaConsole, IdConsole);
                            DataConsole.add(new_console);

                            System.out.println("\nData berhasil ditambahkan!");
                            System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                            pause.nextLine();
                            break;
                            
                        case 2:
                            System.out.println("\n> Tambah Game");
                            System.out.print("Nama Game  : "); String NamaGame = input.readLine();
                            System.out.print("Stok Kaset : "); int StokGame = Integer.parseInt(input.readLine());
                            System.out.print("Harga      : Rp."); int HargaGame = Integer.parseInt(input.readLine());
                            System.out.print("Platform   : "); String PlatformGame = input.readLine();
                            System.out.print("ID Kaset   : "); String IdGame = input.readLine();

                            Game new_game = new Game(NamaGame, StokGame, HargaGame, PlatformGame, IdGame);
                            DataGame.add(new_game);

                            System.out.println("\nData berhasil ditambahkan!");
                            System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                            pause.nextLine();
                            break;
                            
                        case 3:
                            System.out.println("\n> Tambah Aksesoris");
                            System.out.print("Nama Aksesoris : "); String NamaAksesoris = input.readLine();
                            System.out.print("Stok Aksesoris : "); int StokAksesoris = Integer.parseInt(input.readLine());
                            System.out.print("Harga          : Rp."); int HargaAksesoris = Integer.parseInt(input.readLine());
                            System.out.print("ID Aksesoris   : "); String IdAksesoris = input.readLine();

                            Aksesoris new_aksesoris = new Aksesoris(NamaAksesoris, StokAksesoris, HargaAksesoris, IdAksesoris);
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
                            System.out.println("|=========================================================================|");
                            System.out.println("|  No  |            Console           |  Stok  |     Harga     |    ID    |");
                            System.out.println("|=========================================================================|");
                            for(int i =0; i < DataConsole.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                DataConsole.sort(Comparator.comparing(Console::getNama));
                                DataConsole.get(i).displayBarang(false);
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|=========================================================================|");
                            System.out.println("\nTekan [ENTER] untuk melanjutkan");
                            pause.nextLine();
                            break;
                            
                        case 2:
                            System.out.println("|==================================================================================|");
                            System.out.println("|  No  |           Game           |  Stok  |     Harga     |  Platform  |    ID    |");
                            System.out.println("|==================================================================================|");
                            for(int i =0; i < DataGame.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                DataGame.sort(Comparator.comparing(Game::getPlatform));
                                System.out.printf("|%-26s" , DataGame.get(i).getNama());
                                System.out.printf("|%-8s", DataGame.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataGame.get(i).getHarga());
                                System.out.printf("|%-12s", DataGame.get(i).getPlatform());
                                System.out.printf("|%-10s", DataGame.get(i).getIdKaset());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|==================================================================================|");
                            System.out.println("\nTekan [ENTER] untuk melanjutkan");
                            pause.nextLine();
                            break;
                            
                        case 3:
                            System.out.println("|=========================================================================|");
                            System.out.println("|  No  |           Aksesoris          |  Stok  |     Harga     |    ID    |");
                            System.out.println("|=========================================================================|");
                            for(int i =0; i < DataAksesoris.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                DataGame.sort(Comparator.comparing(Game::getPlatform));
                                DataAksesoris.get(i).displayBarang(false);
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|=========================================================================|");
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
                            System.out.println("|=========================================================================|");
                            System.out.println("|  No  |            Console           |  Stok  |     Harga     |    ID    |");
                            System.out.println("|=========================================================================|");
                            for(int i =0; i < DataConsole.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                DataConsole.sort(Comparator.comparing(Console::getNama));
                                DataConsole.get(i).displayBarang(false);
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|=========================================================================|");
                            System.out.println("\n> Edit Data Console");
                            System.out.print("\nInput ID : ");
                            String EditIdConsole = input.readLine();
                            
                            for (Console console : DataConsole){
                                if (console.getIdConsole().equals(EditIdConsole)) {
                                    System.out.print("Console      : "); console.setNama(input.readLine());
                                    System.out.print("Stok Console : "); console.setStok(Integer.parseInt(input.readLine()));
                                    System.out.print("Harga        : Rp."); console.setHarga(Integer.parseInt(input.readLine()));
                                    System.out.print("ID console   : "); console.setIdConsole(input.readLine());

                                    System.out.println("\nData berhasil diupdate!");
                                    System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                                    pause.nextLine();
                                    break;
                                }
                            }
                            break;
                        
                        case 2:
                            System.out.println("|==================================================================================|");
                            System.out.println("|  No  |           Game           |  Stok  |     Harga     |  Platform  |    ID    |");
                            System.out.println("|==================================================================================|");
                            for(int i =0; i < DataGame.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                DataGame.sort(Comparator.comparing(Game::getPlatform));
                                System.out.printf("|%-26s" , DataGame.get(i).getNama());
                                System.out.printf("|%-8s", DataGame.get(i).getStok());
                                System.out.printf("|%-15s", "Rp." + DataGame.get(i).getHarga());
                                System.out.printf("|%-12s", DataGame.get(i).getPlatform());
                                System.out.printf("|%-10s", DataGame.get(i).getIdKaset());
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|==================================================================================|");
                            System.out.println("\n> Edit Data Game");
                            System.out.print("\nInput ID : ");
                            String EditIdGame = input.readLine();

                            for (Game game : DataGame){
                                if (game.getIdKaset().equals(EditIdGame)) {
                                    System.out.print("Nama Game  : "); game.setNama(input.readLine());
                                    System.out.print("Stok Kaset : "); game.setStok(Integer.parseInt(input.readLine()));
                                    System.out.print("Harga      : Rp."); game.setHarga(Integer.parseInt(input.readLine()));
                                    System.out.print("Platform   : "); game.setPlatform(input.readLine());
                                    System.out.print("ID Kaset   : "); game.setIdKaset(input.readLine());

                                    System.out.println("\nData berhasil diupdate!");
                                    System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                                    pause.nextLine();
                                    break;
                                }
                            }
                            break;
                            
                        case 3:
                            System.out.println("|=========================================================================|");
                            System.out.println("|  No  |           Aksesoris          |  Stok  |     Harga     |    ID    |");
                            System.out.println("|=========================================================================|");
                            for(int i =0; i < DataAksesoris.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                DataAksesoris.sort(Comparator.comparing(Aksesoris::getNama));
                                DataAksesoris.get(i).displayBarang(false);
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|=========================================================================|");
                            System.out.println("\n> Edit Data Aksesoris");
                            System.out.print("\nInput ID : ");
                            String EditIdAksesoris = input.readLine();
                            
                            for (Aksesoris aksesoris : DataAksesoris){
                                if (aksesoris.getIdAksesoris().equals(EditIdAksesoris)) {
                                    System.out.print("Nama Aksesoris  : "); aksesoris.setNama(input.readLine());
                                    System.out.print("Stok Aksesoris  : "); aksesoris.setStok(Integer.parseInt(input.readLine()));
                                    System.out.print("Harga           : Rp."); aksesoris.setHarga(Integer.parseInt(input.readLine()));
                                    System.out.print("ID Aksesoris    : "); aksesoris.setIdAksesoris(input.readLine());

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
                    delete();
                    break;
                    
                case 5 :
                    System.out.println("\nLogout Berhasil");
                    System.out.println("\nTekan [ENTER] untuk melanjutkan");
                    pause.nextLine();
                    loop = false;
                    break;
                    
                default:
                    System.out.println("\nMenu tidak tersedia!\n");
                    break;
            }
        }
    }
    
    
    static void menuUser() throws IOException{
        boolean loop = true;
        while (loop){
            System.out.println("|=================================|");
            System.out.println("|            Menu User            |");
            System.out.println("|=================================|");
            System.out.println("| 1. Cara Pemesanan               |");
            System.out.println("| 2. Lihat Data Barang            |");
            System.out.println("| 3. Quit                         |");
            System.out.println("|=================================|");
            System.out.print("\nMasukan Pilihan Anda : ");
            int menu1 = Integer.parseInt(input.readLine());
            switch (menu1){
                case 1:
                    System.out.println("|=====================================================================================|");
                    System.out.println("|                                Cara Pemesanan Barang                                |");
                    System.out.println("|=====================================================================================|");
                    System.out.println("| 1. Hubungi nomor WhatsApp berikut : 081236666520                                    |");
                    System.out.println("| 2. Ketik pesan pertama dengan format pemesanan yang sesuai, seperti:                |");
                    System.out.println("|    Halo, saya ingin memesan barang dari toko Anda. Berikut adalah detail pesanan    |");
                    System.out.println("|    saya: [nama barang], [jumlah barang], [harga barang], [alamat pengiriman].       |");
                    System.out.println("| 3. Tunggu balasan dari penjual dengan informasi harga total, metode pembayaran,     |");
                    System.out.println("|    dan estimasi waktu pengiriman.                                                   |");
                    System.out.println("| 4. Jika Anda setuju dengan harga dan informasi pengiriman, balas pesan penjual      |");
                    System.out.println("|    dengan konfirmasi pesanan dan metode pembayaran yang akan Anda gunakan.          |");
                    System.out.println("| 5. Setelah Anda membayar, berikan bukti pembayaran pada penjual dan konfirmasi      |");
                    System.out.println("|    alamat pengiriman Anda.                                                          |");
                    System.out.println("| 6. Tunggu konfirmasi dari penjual bahwa barang telah dikirim.                       |");
                    System.out.println("| 7. Setelah barang tiba, konfirmasi penerimaan barang dan kirimkan feedback mengenai |");
                    System.out.println("|    kualitas barang dan pelayanan penjual.                                           |");
                    System.out.println("|=====================================================================================|");
                    System.out.println("\nTekan [ENTER] untuk melanjutkan");
                    pause.nextLine();
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
                            System.out.println("|==============================================================|");
                            System.out.println("|  No  |            Console           |  Stok  |     Harga     |");
                            System.out.println("|==============================================================|");
                            for(int i =0; i < DataConsole.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                DataConsole.sort(Comparator.comparing(Console::getNama));
                                DataConsole.get(i).displayBarang();
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|==============================================================|");
                            System.out.println("\nTekan [ENTER] untuk melanjutkan");
                            pause.nextLine();
                            break;
                            
                        case 2:
                            System.out.println("|===========================================================================|");
                            System.out.println("|  No  |             Game             |  Stok  |     Harga     |  Platform  |");
                            System.out.println("|===========================================================================|");
                            for(int i =0; i < DataGame.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                DataGame.sort(Comparator.comparing(Game::getPlatform));
                                DataGame.get(i).displayBarang();
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|===========================================================================|");
                            System.out.println("\nTekan [ENTER] untuk melanjutkan");
                            pause.nextLine();
                            break;
                            
                        case 3:
                            System.out.println("|==============================================================|");
                            System.out.println("|  No  |           Aksesoris          |  Stok  |     Harga     |");
                            System.out.println("|==============================================================|");
                            for(int i =0; i < DataAksesoris.size(); i++){
                                System.out.printf( "|%-6s" , (i+1));
                                DataAksesoris.sort(Comparator.comparing(Aksesoris::getNama));
                                DataAksesoris.get(i).displayBarang(false);
                                System.out.printf("|");
                                System.out.printf("\n");
                            }
                            System.out.println("|==============================================================|");
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
                    
                case 3 :
                    System.out.println("\nLogout Berhasil");
                    System.out.println("\nTekan [ENTER] untuk melanjutkan");
                    pause.nextLine();
                    loop = false;
                    break;
                    
                default:
                    System.out.println("\nMenu tidak tersedia!\n");
                    break;    
            }
        }
    }
    
    //LOGIN
    public static void main(String[] args) throws NumberFormatException, IOException{
        
        ArrayList<User> DataUser = new ArrayList<>();
            DataUser.add(new User("eko", "123"));
        while(true){
            System.out.println("|=============================|");
            System.out.println("|    SMD Playstation Store    |");
            System.out.println("|=============================|");
            System.out.println("| 1. Daftar                   |");
            System.out.println("| 2. Login                    |");
            System.out.println("| 3. Exit                     |");
            System.out.println("|=============================|");
            System.out.print("Masukan Pilihan Anda : ");
            int select = Integer.parseInt(input.readLine());
            switch(select){
                case 1:
                    System.out.println("|==============================|");
                    System.out.println("|            Daftar            |");
                    System.out.println("|==============================|");
                    System.out.print(" Masukkan Username    : ");String username = input.readLine();
                    System.out.print(" Masukkan Password    : ");String password = input.readLine();
                    if (username.equals("admin")){
                        System.out.println("\n Username tidak bisa digunakan!");
                        System.out.print("\n Tekan [ENTER] untuk kembali\n");
                        pause.nextLine();
                        break;
                    }
                    
                    User new_user = new User(username, password);
                    DataUser.add(new_user);
                    System.out.println("\nPendaftaran berhasil!");
                    System.out.println("\nSilahkan Login");
                    System.out.print("\nTekan [ENTER] untuk melanjutkan\n");
                    pause.nextLine();
                    break;
                    
                case 2:
                    System.out.println("|=============================|");
                    System.out.println("|            Login            |");
                    System.out.println("|=============================|");
                    System.out.print(" Username : "); String Uname = input.readLine();
                    System.out.print(" Password : "); String pass = input.readLine();
                    if (Uname.equals("admin") && pass.equals("admin")){
                            menuAdmin();
                            break;
                    }
                    for (User user : DataUser){
                        if(Uname.equals(user.getUsername()) && pass.equals(user.getPass())){
                            menuUser();
                        }
                    }break;
                    
                case 3 :
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("\nPilihan tidak tersedia!\n");
                    break;
            }
        }
    }
    
}
