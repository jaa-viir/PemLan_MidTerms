package UTPPemlan;
import java.util.*;

public class LaundrySukaMaju {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // input 1
        Object namaPelanggan;
        while (true) {
            namaPelanggan = in.nextLine();
            if (namaPelanggan instanceof Integer) { 
                System.out.println("Masukkan nama yang valid!");
            }
            else break;
        }

        // input 2 (bagian ini lama mikirnya plis sulit banget kak ya allah)
        int beratCucian = 0;
        while (true) {
            try {
                beratCucian = Integer.parseInt(in.nextLine());
                if (beratCucian < 1) {
                    System.out.println("Masukkan berat cucian yang valid!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid!");
            }
        }   

        // Input 3
        String jenisCucian = in.nextLine().toLowerCase();
        while (!jenisCucian.equals("basah") && !jenisCucian.equals("kering")) {
            jenisCucian = in.nextLine().toLowerCase();
        }


        // Hitung biaya
        double biayaPerKg;
        if (jenisCucian.equals("basah")) {
            biayaPerKg = 5000;
        } else {
            biayaPerKg = 7000;
        }
        double biayaSementara = (double) beratCucian * biayaPerKg;
        double pajak = biayaSementara * 0.1;
        double totalBiaya = biayaSementara + pajak;

        // Output 
        System.out.println("============== NOTA ===============");
        System.out.println("Pelanggan: " + namaPelanggan);
        System.out.println("Berat Cucian: " + beratCucian + " kg");
        System.out.println("Jenis Cucian: " + jenisCucian);
        System.out.println("Biaya: Rp. " + biayaSementara);
        System.out.println("Pajak: Rp. " + pajak);
        System.out.println("Total Biaya: Rp. " + totalBiaya);
        System.out.println("Terima kasih " + namaPelanggan + " dan sampai jumpa");
        System.out.println("===================================");
    }
}