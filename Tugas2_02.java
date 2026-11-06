import java.util.Scanner;
public class Tugas2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};   

        System.out.print("Masukkan jumlah item menu yang ingin dipesan: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();

        String[] namaMenu = new String[jumlahMenu];
        int[] menuJumlah = new int[jumlahMenu];
        int totalHarga = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("\nPemesanan ke-" + (i + 1));
            boolean menuValid = false;

            while(!menuValid) {
                System.out.print("Masukkan nama menu: ");
                String namaItem = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaItem)) {
                        namaMenu[i] = menu[j];
                        menuValid = true;
                        break;
                    }   
                }
                
                if (!menuValid) {
                    System.out.println("Menu tidak tersedia");
                }
            }

            System.out.print("Masukkan jumlah item untuk membeli " + namaMenu[i] + ": ");
            menuJumlah[i] = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(namaMenu[i])) {
                    totalHarga += harga[j] * menuJumlah[i];
                    break;
                }
            }
        }

        System.out.println();
        System.out.printf("%-20s | %-8s | %-12s\n", "       Menu", "Jumlah", "Harga");

        for (int i = 0; i < namaMenu.length; i++) {
            int hargaSatuan = 0;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(namaMenu[i])) {
                    hargaSatuan = harga[j];
                    break;
                }
            }
            int subtotal = hargaSatuan * menuJumlah[i];
            System.out.printf("%-20s | %-8d | Rp. %-9d\n", namaMenu[i], menuJumlah[i], subtotal);
        }

        System.out.println("Total Biaya Keseluruhan : Rp. " + totalHarga);

        sc.close();
    }
}