/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chikaproject;

/**
 *
 * @author cindyjulia
 */
public class Chikaproject {

    public static void main(String[] args) {
    int a, b, c;
    
    for (a=1; a<=5; a++){
        for (b=a; b<=5; b++){
            System.out.print(" ");
        }   
        for (c=1; c<=(2*a-1); c++){
            System.out.print("*");
        }
        System.out.println("");
    }    
 }
}

