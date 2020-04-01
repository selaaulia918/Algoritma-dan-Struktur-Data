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
public class Prefix {
    public int a;
    public int top;
    public char[] stack;
    
    public Prefix(int total) {
        a = total;
        top = -1;
        stack = new char[a];
        push(')');
    }
    
    public void push(char b) {
        top++;
        stack[top] = b;
    }
    
    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }
    
    public boolean IsOperand(char b) {
        if ((b >= 'A' && b <= 'Z') || (b >= 'a' && b <= 'z') || (b >= '0' && b <= '9') || b == ' ' || b == '.') {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsOperator(char b) {
        if (b == '^' || b == '%' || b == '/' || b == '*' || b == '-' || b == '+') {
            return true;
        } else {
            return false;
        }
    }
    
    public int presedence(char b) {
        switch (b) {
            case '^': return 3;
            case '%': return 2;
            case '/': return 2;
            case '*': return 2;
            case '-': return 1;
            case '+': return 1;
            default: return 0;
        }
    }
    
    public String konversi(String C) {
        String D = "";
        char b;
        for (int i = 0; i < a; i++) {
            b = C.charAt(i);
            if (IsOperand(b)) {
                D = D + b;
            }
            if (b == ')') {
                push(b);
            }
            if (b == '(') {
                while (stack[top] != ')') {
                    D = D + pop();
                }
                char temp = pop();
            }
            if (IsOperator(b)) {
                while (presedence(stack[top]) >= presedence(b)) {
                    D = D + pop();
                }
                push(b);
            }
        }
        return D;
    }
}
