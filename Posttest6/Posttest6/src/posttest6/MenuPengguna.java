/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;

import java.io.IOException;
import java.util.Comparator;
import static posttest6.Main.DataAksesoris;
import static posttest6.Main.DataConsole;
import static posttest6.Main.DataGame;
import static posttest6.Main.input;
import static posttest6.Main.pause;

/**
 *
 * @author User
 */
public class MenuPengguna implements Pengguna {
    @Override
    public void caraPesan(){
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
    }
        
    @Override
    public void lihat() throws IOException{
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
            case 1 -> {
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
            }

            case 2 -> {
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
            }

            case 3 -> {
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
            }
            
            default -> System.out.println("\nMenu tidak tersedia!\n");
        }
    }
}
