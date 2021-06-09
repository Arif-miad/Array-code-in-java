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
public class NewClass4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] A = new int [4][5];
        int k = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                A [row][col] = k;
                k++;
                
            }
            
        }
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <5; col++) {
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }
    }
}
