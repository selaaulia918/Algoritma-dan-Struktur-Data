# Jawaban Pertanyaan

1. Method proses bubble sort terdapat pada class DaftarMahasiswaBerprestasi dalam void bubbleSort()
2. Method proses selectioon sort terdapat pada class DaftarMahasiswaBerprestasi dalam void bubbleSort()
3. Yang dimaksud proses swap adalah proses dimana isi dari index akan di cek dengan suatu keadaan atau selection lalu akan mengganti urutan index tadi berdasarkan pengecekan tadi
4. => Pada baris program tersebut terdapat 2 proses yaitu
a. pada kode program "if" terdapat pengecekan "apakah isi array lishMhs.ipk index ke J lebih besar dari pada isi array lishMhs.ipk index ke J - 1 .?
b. selanjutnya jika index tadi lebih besar maka akan terjadi proses perubahan isi array atau swap
5. a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?
Kegunaan perulangan i yaitu digunakan untuk mengulang perulangan j sesuai dengan jumlah mahasiswa nya, sedangkan perulangan j digunakan untuk membandingkan data.
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
Karena indeks ke-0 dari array listMhs sudah terinisialisasi sebagai data pertama sehingga perulangan dikurangi 1 sebagai pengabaian indeks ke - 0
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
Karena perulangan tersebut untuk mengulang nama, umur, tahun masuk, dan ipk yang jumlah perulangannya 2 kali lipat dari jumlah listMhs.
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
Terdapat 100 tahap karena perulangan tersebut mengandung notasi O(n) jika n bernilai 50 dengan n dikalikan 2
O(n*2) . 50*2 = 100 eksekusi
6.  Proses pencarian nilai terkecil untuk melakukan sorting pada selection sort
7. public void insertionSort(boolean Ascending) {
        int i, j;
        for (i = 0; i < listMhs.length; i++) {
            Mahasiswa_1941720123 temp;
            temp = listMhs[i];
            j = i;
            if (Ascending) {
                while ((j > 0) && (listMhs[j - 1].ipk > temp.ipk)) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            } else {
                while ((j > 0) && (listMhs[j - 1].ipk < temp.ipk)) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            }
            listMhs[j] = temp;
        }