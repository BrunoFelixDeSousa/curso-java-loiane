/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursoJava.aula19.labs;

import java.util.Scanner;

/**
 *
 * @author loiane
 */
public class Exer10 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        
        for (int i=0; i<vetorA.length; i++){
            
            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            
            vetorB[i] = vetorA[i] % 2;
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }    
}
