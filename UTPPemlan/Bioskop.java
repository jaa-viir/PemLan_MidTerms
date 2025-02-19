package UTPPemlan;
import java.util.*;

public class Bioskop {
    private String namaPemesan;
    private int jumlahTiket;
    private String jenisFilm;
    private static int jumlahTiketHororDanAction = 10;
    private static int jumlahTiketlainnya = 8;

    public Bioskop(String namaPemesan, int jumlahTiket, String jenisFilm) {
        this.namaPemesan = namaPemesan;
        this.jumlahTiket = jumlahTiket;
        this.jenisFilm = jenisFilm;
    }

    public double hitungBiaya() {
        double hargaTiket = 0;
        switch (jenisFilm.toLowerCase()) {
            case "horor":
                hargaTiket = 25000;
                break;
            case "komedi":
                hargaTiket = 20000;
                break;
            case "drama":
                hargaTiket = 22000;
                break;
            case "action":
                hargaTiket = 27000;
                break;
            case "romantis":
                hargaTiket = 23000;
                break;
        }
        return hargaTiket * jumlahTiket;
    }

    public boolean tiketTersedia(int jumlahTiketDipesan) {
        if (jenisFilm.equalsIgnoreCase("horor") || jenisFilm.equalsIgnoreCase("action")) {
            return jumlahTiketDipesan <= jumlahTiketHororDanAction;
        } else {
            return jumlahTiketDipesan <= jumlahTiketlainnya;
        }
    }

    public void nota() {
        System.out.println("\nNota Pemesanan:");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Jenis Film: " + jenisFilm.substring(0, 1).toUpperCase() + jenisFilm.substring(1));
        System.out.println("Total Biaya: Rp. " + hitungBiaya());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String namaPemesan = in.nextLine();

        int jumlahTiket;
        do {
            while (!in.hasNextInt()) {
                System.out.println("Jumlah tiket tidak valid. Masukkan angka bulat positif.");
                in.next();
            }
            jumlahTiket = in.nextInt();
            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan angka bulat positif.");
            }
        } while (jumlahTiket <= 0);

        String jenisFilm;
        boolean isValidJenisFilm;
        do {
            jenisFilm = in.next().toLowerCase();
            isValidJenisFilm = jenisFilm.equals("horor") || jenisFilm.equals("komedi") || jenisFilm.equals("drama")
                    || jenisFilm.equals("action") || jenisFilm.equals("romantis");
            if (!isValidJenisFilm) {
                System.out.println("Jenis film tidak valid. Mohon masukkan salah satu dari: 'horor', 'komedi', 'drama', 'action', 'romantis'.");
            }
        } while (!isValidJenisFilm);

        Bioskop pesanan = new Bioskop(namaPemesan, jumlahTiket, jenisFilm);

        if (!pesanan.tiketTersedia(jumlahTiket)) {
            System.out.println("Maaf, jumlah tiket pesanan anda melebihi batas maksimum per booking.");
            return;
        }

        pesanan.nota();

        in.close();
    }
}
