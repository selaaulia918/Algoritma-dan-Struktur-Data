/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Asus
 */
public class Faktorial {
    public int nilai; 
    public int faktorialBF(int n){
	int fakto = 1; // 0(1)
	int i = 1; // 0(1)
	while (i < n){ // 0(n)
	fakto = fakto * i; // 0(1)
	i++;// 0(1)
        }
	return fakto; // 0(1)
    }
    public int faktorialDC(int n){
        if (n==1){ // 0(1)
            return 1; // 0(1)
        } else { // 0(1)
            int fakto = n* faktorialDC(n-1); // 0(1)
            return fakto; // 0(1)
        }
    }
}
// 1+1+(nx1x1)+1+1+1+1+1+1 =
// 2+ n + 6 =
// 8 + n =
// O (n)
