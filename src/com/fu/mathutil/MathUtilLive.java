/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        long result = MathUtil.getFactorial(n);
        System.out.println("5! = 120; actual: " + result);
        //thêm code 5pm ngày 15-05-2024
        System.out.println("expected: 3! = 6; actual: " + MathUtil.getFactorial(3));
        
    }
    
    
}
