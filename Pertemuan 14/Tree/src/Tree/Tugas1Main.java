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
public class Tugas1Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        bt.insert(8);
        bt.insert(3);
        bt.insert(6);
        bt.insert(7);
        bt.insert(10);
        bt.insert(14);
        bt.insert(4);
        bt.insert(9);
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
    }
}
