import java.util.Scanner;
public class ArrayRataNilai02 {
    public static void main(String[] argys) {
    Scanner input = new Scanner(System.in); 

        System.out.print("Masukan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }
            
        if (nilaiMhs.length > 0) {
            rata2 = (double) total / nilaiMhs.length;
        } else {
            rata2 = 0;
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }

        String predikat;
        if (rata2 >= 85) {
            predikat = "Sangat Baik";
        } else if (rata2 >= 70) {
            predikat = "Baik";
        } else {
            predikat = "Perlu Pendampingan";
        }

        int jumlahLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Predikat: " + predikat);
        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahLulus);

        input.close();
    }
}