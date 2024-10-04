import java.util.Scanner;

public class Pemilihan2Percobaan211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        char menu; 
        String member;
        int harga, jumlah_beli;
        Double diskon, total_bayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Roti");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        menu = input11.next().charAt(0);
        System.out.println("Apakah punya member (y/n)? = ");
        member = input11.next();
        System.out.println("-------------------------------------");

        if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == '1') {
                harga = 12000;
                System.out.println("Harga Kopi " + harga);
                System.out.print("Masukkan Jumlah Yang Ingin Dibeli = ");
                jumlah_beli = input11.nextInt();
                total_bayar = (harga * jumlah_beli) - (harga*jumlah_beli*diskon);
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } else if (menu == '2') {
                harga = 10000;
                System.out.println("Harga Teh" + harga);
                System.out.print("Masukkan Jumlah Yang Ingin Dibeli = ");
                jumlah_beli = input11.nextInt();
                total_bayar = (harga * jumlah_beli) - (harga*jumlah_beli*diskon);
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } else if (menu == '3') {
                harga = 20000;
                System.out.println("Harga Roti" + harga);
                System.out.print("Masukkan Jumlah Yang Ingin Dibeli = ");
                jumlah_beli = input11.nextInt();
                total_bayar = (harga * jumlah_beli) - (harga*jumlah_beli*diskon);
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } else {
                System.out.println("menu tidak tersedia");
            }
        } else if (member.equals("n")) {
            if (menu == '1') {
                harga = 12000;
                System.out.println("Harga Kopi" + harga);
                System.out.print("Masukkan Jumlah Yang Ingin Dibeli = ");
                jumlah_beli = input11.nextInt();
                total_bayar = (double) harga * jumlah_beli;
                System.out.println("Total bayar = " + total_bayar);
            } else if (menu == '2') {
                harga = 10000;
                System.out.println("Harga Teh" + harga);
                System.out.print("Masukkan Jumlah Yang Ingin Dibeli = ");
                jumlah_beli = input11.nextInt();
                total_bayar = (double) harga * jumlah_beli;
                System.out.println("Total bayar = " + total_bayar);
            } else if (menu == '3') {
                harga = 20000;
                System.out.println("Harga Roti" + harga);
                System.out.print("Masukkan Jumlah Yang Ingin Dibeli = ");
                jumlah_beli = input11.nextInt();
                total_bayar = (double) harga * jumlah_beli;
                System.out.println("Total bayar = " + total_bayar);
            } else {
                System.out.println("Member tidak tersedia");
            }
        }
        System.out.println("-------------------------------------");
    }
}