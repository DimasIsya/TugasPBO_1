//Dimas Isya Saputra-123210143

package tugaspbo;

import java.util.Scanner;

public class TugasPBO {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        boolean repeat = true;
        
        while(repeat) {
            System.out.println("=== MENU ===");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            
            switch(menu) {
                case 1:
                    hitungBalok();
                    break;
                case 2:
                    hitungTabung();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    repeat = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
            
            if(repeat) {
                System.out.println("\nTekan enter untuk kembali ke menu...");
                input.nextLine(); // Membuang newline di buffer
                input.nextLine(); // Menunggu input enter
            }
        }
    }
    
    public static void hitungBalok() {
        Scanner input = new Scanner(System.in);
        double panjang, lebar, tinggi;
        
        System.out.println("\n== Hitung Balok ==");
        System.out.print("Masukkan panjang: ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        lebar = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();
        
        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
        Balok balok = new Balok(panjang, lebar, tinggi);
        System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());
        System.out.println("Keliling persegi panjang: " + pp.hitungKeliling());
        System.out.println("Luas persegi panjang: " + pp.hitungLuas());
        System.out.println("Volume balok: " + balok.hitungVolume());
    }
    
    public static void hitungTabung() {
        Scanner input = new Scanner(System.in);
        double jariJari, tinggi;
        
        System.out.println("\n== Hitung Tabung ==");
        System.out.print("Masukkan jari-jari: ");
        jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();
        
        Lingkaran lingkaran = new Lingkaran(jariJari);
        Tabung tabung = new Tabung(jariJari, tinggi);
        System.out.println("Luas permukaan tabung: " + tabung.hitungLuasPermukaan());
        System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
        System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Volume tabung: " + tabung.hitungVolume());
    }
    }
