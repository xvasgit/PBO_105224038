import java.util.Scanner;
// github repository : 
// https://github.com/xvasgit/PBO_105224038.git
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        // 1. Deklarasi Array
        int[] nilaiMahasiswa = new int[jumlah];

        // 2. Perulangan untuk Input Nilai
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int tempNilai = input.nextInt();

            // 3. Perbandingan (Validation)
            if (tempNilai < 0 || tempNilai > 100) {
                System.out.println("Nilai tidak valid! Masukkan antara 0-100.");
                i--; // Mengulang input untuk indeks yang sama
            } else {
                nilaiMahasiswa[i] = tempNilai;
            }
        }
        
        // --- KERJAKAN LOGIKA DI BAWAH INI ---
        // 4. Hitung Rata-rata, Tertinggi, Terendah
        int jumlahLulus=0, total =0, terendah, tertinggi;
        terendah = nilaiMahasiswa[0];
        tertinggi = nilaiMahasiswa[0];
        for (int i = 0; i < jumlah; i++) {
            total += nilaiMahasiswa[i];
            if (terendah > nilaiMahasiswa[i]) {
                terendah = nilaiMahasiswa[i];
            }else if(tertinggi < nilaiMahasiswa[i]) {
                tertinggi = nilaiMahasiswa[i];
            }
            if(nilaiMahasiswa[i] >= 75) {
                jumlahLulus++;
            }
        }
        double rataDouble = (double)total / (double)jumlah;
        int banyakRata = 0;
        for (int i = 0; i < jumlah; i++) {
            if(nilaiMahasiswa[i] > rataDouble){
                banyakRata++;
            }
        }
        System.out.println("--- HASIL ANALISIS --- ");
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai rata-rata : " + rataDouble);
        System.out.println("Jumlah mahasiswa di atas rata-rata :" + banyakRata);
        System.out.println("Jumlah mahasiswa Lulus : " + jumlahLulus);
        
        // 5. Tampilkan Hasil dan Status Kelulusan
        for (int i = 0; i < jumlah; i++) {
            if (nilaiMahasiswa[i] >= 75) {
                System.out.println("Mahasiswa " + (i + 1) + ": " + nilaiMahasiswa[i] + " (Lulus)");
            } else {
                System.out.println("Mahasiswa " + (i + 1) + ": " + nilaiMahasiswa[i] + " (Tidak Lulus)");
            }
        }
        input.close();
    }
}