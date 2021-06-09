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
public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value ");
        int i ,sum=0,average;
        int [] x = new int [5];
        for(i=0;i<5;i++)
        {
            x[i]= input.nextInt();
        }
        for(i=0;i<5;i++)
        {
             sum = sum+x[i];
        }
        average = sum/5;
        System.out.println("sum = " +sum);
        
       
        
    }
}
