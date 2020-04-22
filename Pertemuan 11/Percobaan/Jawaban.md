# Jawaban Pertanyaan Percobaan

1. Mengapa pada proses traverse nilai head perlu disimpan terlebih dahulu dalam variabel tmp ?
Jawab : 
Transver adalah operasi yang digunakan untuk mencetak dam memproses penambahan data di akhir linked lists. Jadi fungsi head perlu disimpan di variabel tmp adalah agar ketika penambahan data baru head tidak berubah. Data yang baru akan menempati tmp saja dan head tetap berisi data.

2. Apa kekurangan implementasi single LinkedLists tanpa penunjuk tail ?
Jawab :
Tidak akan bisa menambah data baru di belakang, karena perubahan data baru membutuhkan tail yang mengikat node baru. Secara singkatnya agar head tidak berubah atau bergeser.

3. Tambahkan implementasi method addByValue berdasarkan nilai yang dicari! Node baru akan ditambahkan setelah node yang dicari ditemukan.
Jawab :
Source code dalam LinkedLists Class
<img src="1.ekstensifoto">

Source code dalam MainLinkedList Class
<img src="2.ekstensifoto">

Ouput dari addByLinked
<img src="5.ekstensifoto">

4. Tambahkan implementasi method removeByValue berdasarkan nilai yang dicari!
Jawab :
Source code dari LinkedList Class
<img src="3.ekstensifoto">

Source code dari MainLinkedLists Class
<img src="4.ekstensifoto">

Ouput dari source code tersebut 
<img src="6.ekstensifoto">

5. 