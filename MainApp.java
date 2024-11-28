import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login
        Login login = new Login();
        System.out.println("+-----------------------------------------------------+");
        System.out.print("Username : ");
        String username = scanner.nextLine();
        System.out.print("Password  : ");
        String password = scanner.nextLine();

        // CAPTCHA
        Captcha captcha = new Captcha();
        System.out.println("Captcha: " + captcha.getQuestion());
        System.out.print("Jawab: ");
        int userAnswer = scanner.nextInt();
        scanner.nextLine(); // Bersihkan buffer

        if (!captcha.validateAnswer(userAnswer)) {
            System.out.println("Captcha salah! Program dihentikan.");
            scanner.close();
            return;
        }

        // Validasi Login
        if (login.validateLogin(username, password)) {  // Hanya username dan password yang divalidasi
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal, silakan diulangi.");
            scanner.close();
            return;
        }

        // Program berlanjut...
        System.out.println("+-----------------------------------------------------+");
        System.out.println("Selamat Datang di Supermarket Budiman");
        System.out.println("Tanggal dan Waktu : " + DateTimeUtil.getCurrentDateTime());
        System.out.println("+-----------------------------------------------------+");

        // Faktur
        Transaction transaction = new Transaction();
        System.out.print("No. Faktur      : ");
        transaction.setNoFaktur(scanner.nextLine());
        System.out.print("Kode Barang  : ");
        transaction.setKodeBarang(scanner.nextLine());
        System.out.print("Nama Barang : ");
        transaction.setNamaBarang(scanner.nextLine());

        // Harga Barang
        System.out.print("Harga Barang : ");
        try {
            transaction.setHargaBarang(scanner.nextDouble());
            scanner.nextLine(); // Membersihkan buffer
        } catch (Exception e) {
            System.out.println("Input harga barang tidak valid. Program akan berhenti.");
            scanner.close();
            return;
        }

        // Jumlah Beli
        System.out.print("Jumlah Beli     : ");
        try {
            transaction.setJumlahBeli(scanner.nextInt());
            scanner.nextLine(); // Membersihkan buffer
        } catch (Exception e) {
            System.out.println("Input jumlah beli tidak valid. Program akan berhenti.");
            scanner.close();
            return;
        }

        // Tampilkan struk
        transaction.printReceipt();

        // Kasir
        System.out.print("Kasir : ");
        String namaKasir = scanner.nextLine();
        System.out.println("+-----------------------------------------------------+");
        System.out.println("Terima kasih telah berbelanja, " + namaKasir + "!");

        scanner.close();
    }
}
