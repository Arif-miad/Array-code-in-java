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
public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the 5 number :");
        int [] x = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            x[i]= input.nextInt();
            
        }
        for (int i = 0; i < 5; i++) {
            sum =x [i]+sum;
            
        }
        System.out.println("sum is " +sum);
    }
}
