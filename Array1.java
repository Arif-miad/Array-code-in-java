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
public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("plase enter the value ");
        int [] number = new int [5];
        number [0] = input.nextInt();
        number [1] = input.nextInt();
        number [2] = input.nextInt();
        number [3] = input.nextInt();
        number [4] = input.nextInt();
        int sum = 0;
        sum = number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("sum = " +sum);
        
        
    }
}
