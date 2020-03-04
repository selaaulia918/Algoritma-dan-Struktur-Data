# Laporan Praktikum Brute Force Divide Conquer 2

## Belajar Sisip Gambar
<img src = 'belajar.png'>
## Latihan Bruce Force

## Latihan Divide Conquer

## Tugas Praktikum
### Pertanyaan Praktikum 3
1. Hasil outputnya seperti di gambar :
<img src = 'prak1.png'>
2. Dikarenakan maksud dari program yang telah ada di gambar digunakan untuk menginstansiasi array of object ppArray. 
Sebagaimana program minMax[] ppArray = new minMax[5] -> sebagai instansiasi dan 
program ppArray[0] = new minMax(); -> sebagai inisialisasi atau memberikan nilai kepada object
3. Sudah ada di dalam source code MinMax dan MainMInMax
4. Pada program tersebut berarti bahwa nilai 4 adalah indeks akhir atau batas dari array yang diinputkan oleh user.
5. Karena saat menggunakan algoritma divide and conquer array akan di bagi menjadi beberapa bagian, untuk pembagian yang sama antara bagian kanan dan bagian kiri maka memerlukan indeks awal yang merupakan indeks ke-0, indeks akhir merupakan indeks ke-n, dan indeks tengah merupakan batas diantara keduanya, sehingga dari situlah pembagiannya berawal.
6. Iya, karena jika terpisah dan dijadikan dalam satu class, maka variabel global tersebut tidak dapat terbaca oleh fungsi main pada class itu sendiri.
7. Tidak bisa, karena Array digunakan sebagai parameter untuk menguraikan dan sebagai patokan/batasan bagian array.
8. Dapat dilakukan dengan merubah metode dari divide conquer menjadi method brute force.
public class MainMinMax {

    public static void main(String[] args) {
        //TODO code application logic here
        MinMax[] ppArray = new MinMax[5]; // 0(1)
        ppArray[0] = new MinMax(); // 0(1)

        Scanner sc = new Scanner(System.in); // 0(1)
        for (int i = 0; i < 5; i++) { // 0(n)
            ppArray[i] = new MinMax(); // 0(1)
            System.out.println("Nilai Array indeks ke-" + i); // 0(1)
            System.out.print("Masukkan nilai : "); // 0(1)
            ppArray[i].nilaiArray = sc.nextInt(); // 0(1)
        }
        int min = ppArray[0].nilaiArray; // 0(1)
        int max = ppArray[0].nilaiArray; // 0(1)
        for (int l = 0; l < 5; l++) { // 0(n)
            if (ppArray[l].nilaiArray < min) { // 0(1)
                min = ppArray[l].nilaiArray; // 0(1)
            } else if (ppArray[l].nilaiArray > max) { // 0(1)
                max = ppArray[l].nilaiArray; // 0(1)
            }
        }
        System.out.println("Brute Force"); // 0(1)
        System.out.println("Nilai minimal  : " + min); // 0(1)
        System.out.println("Nilai maksimal : " + max); // 0(1)
9. Bonus
10. Sesuai case, jika perbandingan maka menggunakan brute force, jika pencarian menggunakan divide conquer
11. Sebagai pembanding
12. Sebagai pengganti if else

### Pertanyaan Praktikum 4
1. n * n * 1 = n^2
2. n * n * 1 = n^2 dimana n = 100
							= 100^2
							= 10.000 instruksi
3. Notasi kedua kode tersebut tidak dapat berbeda, tetapi pada kode B jika dijalankan akan mengoutputkan hasil yang tak terhingga.