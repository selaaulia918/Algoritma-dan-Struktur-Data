# Jawaban 2.3.3

1. Base lain Algoritma Divide and Conquer adalah pencarian nilai factorial yang didasarkan pada perhitungan rekursif dan membagi masalah menjadi beberapa bagian yang disebut upa-masalah
2. Devide merupakan cara program membagi masalah menjadi beberapa upa-masalah yang memiliki kemiripan dengan masalah semula namun berukuran lebih kecil. 
Kode pemrogramannya adalah seperti ini :
if (n == 1){
	return 1;
} else {
	int fakto = n * faktorialDC(n-1);
	return fakto;
}
Conquer merupakan pemecahan masalah yang disesuaikan dengan masing masing upa-masalah secara rekursif.
Kode pemrogramannya adalah seperti berikut:
int fakto = n * faktorilDC(n-1);
Combine merupakan gabungan dari solusi masing-masing upa-masalah membentuk solusi masalah semula.
Kode pemrogramannya adalah seperti berikut :
return fakto;
3. Bisa dengan menggunkan perulangan while.
Source code :
public int faktorialBF(int n){
	int fakto = 1;
	int i = 1;
	while (i < n){
	fakto = fakto * i;
	i++;
}
	return fakto;
}
4. Perubahan terdapat di source code MainFaktorial pada line 26, 30, 31, 34, 38, dan 39
5. Apabila banyak elemen yang masukkan bernilai lebih dari 20 maka hasil ada yang minus namun apabila kurang dari 20 maka hasil tetap dan durasi yang diperlukan menggunakan cara Divide Conquer lebih cepat dibandingkan dengan Brute Force


# Jawaban 2.4.3
1. Method PangkatBF() menggunakan Algoritma Brute Force yaitu dengan melakukan perulangan secara berurutan, sedangkan Method PangkatDC() menggunakan Algoritma Divide and Conquer yaitu dengan membagi tugasnya sehingga menjadi permasalahan yang lebih kecil lalu mennggabungkannya kembali.
2. Arti potongan kode Algoritma Divide and Conquer tersebut adalah dimana cara mengeksekusi atau memproses program dengan cara membagi tugas nya terlebih dahulu menjadi lebih kecil. Pada saat membagi tugas nya program akan membagi elemen menjadi dua bagian, sedangkan pada bilangan ganjil tidak dapat dibagi dua.
3. jawaban terdapat pada Pangkat.class line 25-29
4. Terdapat pada Pangkat.class line 33-39
5. Modifikasi terdapat pada MainPangkat.Class


# Jawaban 2.5.3
1. Jika menggunakan method TotalBF() perhitungan akan terurut sedangkan jika menggunakan method TotalDC() perhitungan akan dibagi menjadi lebih kecil
2. Jawaban ada di MainPangkat.class
3. Formulasi return value tersebut merupakan proses penggabungan atau combine setelah terjadi proses pembagian tugas pada Algoritma Divide and Conquer.
4. Variable mid dibutuhkan sebagai pembagi elemen yang menjadikan masalah menjadi beberapa bagian atau proses.
5. Jawaban ada di MainPangkat.class