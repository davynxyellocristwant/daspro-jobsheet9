import java.util.Scanner;
public class Tugas2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Goreng", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.print("Masukkan nama makanan/minuman yang ingin anda pesan: ");
        String cariMenu = sc.nextLine();
        boolean tersedia = false;
        int hargaMenu = 0;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                tersedia = true;
                hargaMenu = harga[i];
                break;
            }
        }

        if (tersedia) {
            System.out.println("Menu: " + cariMenu + " Harganya Rp." + hargaMenu + "\n");
        } else {
            System.out.println("Mohon maaf menu " + cariMenu + " tidak tersedia.");
        }

        


        sc.close();
    }
}