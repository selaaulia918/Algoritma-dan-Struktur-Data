/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author Asus
 */
public class Tugas3Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(19);
        bt.insert(11);
        bt.insert(20);
        bt.insert(4);
        bt.insert(5);
        bt.insert(1);
        bt.insert(13);
        bt.insert(7);
        bt.insert(15);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.minvalue(bt.root);
        System.out.println("Nilai Terkecil : " + bt.minvalue(bt.root));
        bt.maxvalue(bt.root);
        System.out.println("Nilai Terbesar : " + bt.maxvalue(bt.root));
        System.out.print("Leaf : ");
        bt.printLeaves(bt.root);
        System.out.println();
    }
}
