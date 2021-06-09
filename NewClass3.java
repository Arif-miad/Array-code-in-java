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
public class NewClass3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][]A=new int [3][3];
        int  sumofdaigonalelement = 0;
        int sumofupperelement = 0;
        int sumoflowerelement = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                
               A[row][col]=input.nextInt();
            }
            
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                
                if(row==col)
                {
                     sumofdaigonalelement =  sumofdaigonalelement + A[row][col];
                }
                if(row<col)
                {
                    sumofupperelement = sumofupperelement + A[row][col];
                }
                if(row>col)
                {
                    sumoflowerelement = sumoflowerelement + A[row][col];
                }
            }
            
        }
        System.out.println(" sumofdaigonalelement " + sumofdaigonalelement);
        System.out.println("  sumofupperelement " +   sumofupperelement);
        System.out.println("sumoflowerelement " + sumoflowerelement);
    }
}
