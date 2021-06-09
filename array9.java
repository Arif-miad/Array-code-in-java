/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayjanava;

import java.util.Scanner;

/**
 *
 * @author Arif Miad
 */
public class array9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][]A= new int [2][3];
        int[][]B= new int [2][3];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col]=input.nextInt();
                
            }
            
        }
        // geting A matrix
         System.out.println(" A = ");
          for (int row = 0; row < 2; row++) {
              for (int col = 0; col < 3; col++) {
                  System.out.print(" "+A[row][col]);
                  
                  
              }
              System.out.println();
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col]=input.nextInt();
                
            }
            
        }
        // geting B matrix
        System.out.println("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+B[row][col]);
                
            }
            System.out.println();
            
        }
     
    }
}
