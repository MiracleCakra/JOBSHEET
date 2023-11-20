public class Kubus07 {
    // Variabel sisi sebagai panjang sisi kubus
    private double sisi;

    // Konstruktor untuk inisialisasi objek Kubus07 dengan panjang sisi tertentu
    public Kubus07(double sisi) {
        this.sisi = sisi;
    }

    // Fungsi untuk menghitung volume kubus
    public double hitungVolume() {
        double volume = Math.pow(sisi, 3);
        return volume;
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public double hitungLuasPermukaan() {
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        return luasPermukaan;
    }

    // Getter untuk mendapatkan panjang sisi kubus
    public double getSisi() {
        return sisi;
    }

    // Setter untuk mengubah panjang sisi kubus
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Main method untuk contoh penggunaan
    public static void main(String[] args) {
        // Membuat objek Kubus07 dengan panjang sisi 5
        Kubus07 kubus = new Kubus07(5);

        // Menggunakan objek untuk menghitung volume dan luas permukaan
        double volume = kubus.hitungVolume();
        double luasPermukaan = kubus.hitungLuasPermukaan();

        // Menampilkan hasil perhitungan
        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
}
