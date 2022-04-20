/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipoabstratos;

/**
 *
 * @author Renato Nunes
 */
public class TestaPilha {
       public static void main(String[] args) {
        Stack<Integer> pilha = new Stack();
        int i, num;
        for (i = 1; i <= 10; i++) {
            if (pilha.isFull() == false) {
                pilha.push(i);
            }
        }
        while (pilha.isEmpty () == false) {
            num = pilha.pop();
            System.out.println(num);
        }
    }
    
}
