/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayjanava;

import static java.lang.Integer.sum;
import java.util.Scanner;

/**
 *
 * @author Arif Miad
 */
public class Array6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the 5 number :");
        int [] x = new int [5];
            double avg = 0;
                int sum = 0; 
        for (int i = 0; i < 5; i++) {
            x[i]= input.nextInt();
            
        }
        for (int i = 0; i < 5; i++) {
           
            sum = sum+x[i];
           avg = sum / 5;
          
        }
        
        System.out.println("sum = " +sum);
        System.out.println("Average = " +avg);
        double max = x[0];
        double min = x[0];
        for (int i = 0; i < 5; i++) {
            if(max<x[i])
            {
                max = x[i];
            }
            if(min>x[i])
            {
                min = x[i];
            }
            
        }
        System.out.println("Maximum = " +max);
        System.out.println("Mininum " +min);
        
    }
}
