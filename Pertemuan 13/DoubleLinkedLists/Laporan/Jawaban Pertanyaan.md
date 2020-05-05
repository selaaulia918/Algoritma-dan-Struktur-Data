# Jawaban Pertanyaan Double Linked Lists

1. Double Linked Lists memiliki dua buah pointer yaitu pointer next dan prev. Pointer next menunjuk pada node setelahnya dan pointer prev menunjuk pada node sebelumnya. Double memiliki arti field pointer-nya dua buah dan dua arah, ke node sebelum dan sesudahnya. Sedangkan Linked Lists artinya adalah node-node yang saling terhubung satu sama lain. Jadi double linked list adalah node-node yang saling terhubung satu sama lain dan memiliki dua pointer yang menunjuk ke node sebelum dan sesudahnya.

2. Atribut next digunakan untuk menunjuk pada node setelahnya dan atribut prev digunakan untuk menunjuk pada node sebelumnya.

3. kegunaan inisialisasi atribut head dengan null dan size dengan 0 pada konstruktor class DoubleLinkedLists adalah untuk pembuatan awal double linked lists dan menandakan bahwa linked lists masih kosong.

4. Pada method addFirst() pembuatan object dari konstruktor class Node dianggap sama dengan null karena operasi addFirst pada linked lists adalah penambahan node di awal linked lists jadi tidak ada data sebelum data awal ini. Oleh karena itu, pointer prev akan menunjuk pada null.

5. Pada method addFirst() arti dari statement head.prev = newNode adalah pointer prev pada Node head yang lama akan menunjuk ke Node sebelumnya yaitu newNode yang nantinya newNode ini akan menjadi head yang baru.

6. Pada method addLast() arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null adalah pada object Node yang baru pointer prev akan menunjuk pada current yaitu Node terakhir sebelumnya, dan pointer next akan menunjuk ke null yang menandakan bahwa Node baru ini merupakan Node terakhir di dalam linked lists.