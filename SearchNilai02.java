import java.util.Scanner;

public class SearchNilai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilai = {78, 65, 90, 55, 88, 72};

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        boolean ditemukan = false;
        int index = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                ditemukan = true;
                index = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }

        sc.close();
    }
}