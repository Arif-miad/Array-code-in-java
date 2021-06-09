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
public class Arrat2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x [] []= new int [2][3];
       int y [][]= new int [2][3];
        
             System.out.println(x);   
        for (int row =0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("x[%d][%d] = ",row,col);
                x[row][col]=input.nextInt();
                
            }
          
            
        }
        
    }
}
