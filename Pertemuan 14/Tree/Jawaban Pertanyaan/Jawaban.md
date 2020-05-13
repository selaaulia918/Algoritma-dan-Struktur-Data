# Jawaban Pertanyaan 

1. Mengapa dalam Binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
	Jawab : Karena binary search tree dibuat untuk mengatasi kelemahan pada binary tree biasa, yaitu kesulitan dalam searching/pencarian
			node tertentu dalam binary tree. Biasa disebut juga dengan ordered binary tree.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
	Jawab : Digunakan untuk menunjukkan successor dari node tersebut.

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
	Jawab : 
		a. Root (Akar) : Node khusus dalam tree yang tidak memiliki predesesor
		b. null
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
	Jawab : Pembuatan objek node dimana objek tersebut berada dalam atribut root

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut? 
	Jawab : Untuk melakukan pemeriksaan jika data yang diinputkan lebih kecil dari atas dalam node current. Kemudian jika child setelah
			kanan dari node tersebut kosong, maka akan dibuat objek node dengan nilai dari data di inputkan. Sedangkan jika tidak kosong maka node current digantikan node child left.

6. Apa perbedaan antara traverse mode pre-order, in-order dan post-order?
	Jawab : 
		PreOrder : cetak isi node yang dikunjungi, kunjungi LeftChild, kunjungi RightChild. 
		InOrder : kunjungi LeftChild, cetak isi node yang dikunjungi, kunjungi RightChild. 
		PostOrder : kunjungi LeftChild, kunjungi RightChild, cetak isi node yang dikunjungi. 

7. Perhatikan method delete(). Sebelum proses penghapusan node, didahului dengan proses pencarian node yang akan dihapus. Selain ditujukan untuk mencari node yang akan dihapus (current), proses pencarian tersebut juga akan mencari parent dari node yang akan dihapus (parent). Menurut Anda, mengapa diperlukan juga untuk mengetahui parent dari node yang akan dihapus? 
	Jawab : Karena diperlukan, bila node current yang dihapus memiliki successor, sehingga successor tidak terhapus. 

8. Untuk apakah dibuat variabel dengan nama isLeftChild di dalam method delete()? 
	Jawab : Untuk petunjuk apakah node yang dihapus merupakan child di sebelah kiri.

9. Untuk apakah method getSuccessor( ) ? 
	Jawab : Digunakan ketika proses penghapusan node yang memiliki 2 child 

10. Di ulasan teori, disebutkan bahwa ketika suatu node yang memiliki 2 child dihapus, node tersebut digantikan oleh node successor, dimana node successor bisa didapat dengan 2 cara, yaitu 1) mencari nilai terbesar dari subtree di sebelah kirinya, atau 2) mencari nilai terkecil dari subtree di sebelah kanannya. Manakah 1 dari 2 cara tersebut yang diimplementasikan dalam method getSuccessor() di program di atas? 
	Jawab : Untuk mencari nilai terkecil pada subtree di sebelah kanannya. 
	
11. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray? 
	Jawab : Untuk menyimpan index node terakhir. 

12. Apakah kegunaan dari method populateData() dan traverseInOrder( ) ? 
	Jawab : Untuk menginputkan array data dan index terakhir array yang terisi data. 

13. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left-child dan rigth child masin-masing?
	Jawab : left child 5, right child 6.