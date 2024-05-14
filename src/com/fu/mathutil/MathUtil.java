/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ADMIN
 */
//TA VIẾT CÁI CLASS CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//
public class MathUtil {
    //n! = 1.2.3.4.5.6....n
    //20! vừa khớp kiểu long, kiểu long tối đa 18 con số 0;
    //nếu đưa vào âm, 21 giai thừa, ta không tính, ta đập vào mặt ai xài hàm
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        //hàm dừng k cần return
        //xuống đây là n = 0...20
        if(n == 0 || n == 1)
            return 1;
        
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
        
        
    }   
   
}
