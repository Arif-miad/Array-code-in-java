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
public class Array7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of 5 :");
        int [] x = new int [5];
        int sum =0;
        double avg = 0;
        for (int i = 0; i < 5; i++) {
           x [i]= input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sum = sum +x[i];
            avg = sum/5;
            
        }
        System.out.println("sum = "+sum);
        System.out.println("average = "+avg);
        double max= x[0];
        double min= x[0];
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
        System.out.println("maximum = "+max);
        System.out.println("minimum = " +min);
    }
    
}
