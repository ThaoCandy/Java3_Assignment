/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.util;

import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class Helper {
    public  static boolean isIntNumber(String so){
        try {
            Integer kq = Integer.valueOf(so);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public  static boolean isNumberScore(String so){
        try {
            Double kq = Double.valueOf(so);
            return !(kq < 0 || kq > 10);
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean isEmail(String email){
        String reg = "^[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        return email.matches(reg);
    }
//    
//    public static void main(String[] args) {
//        System.out.println(isEmail("thao"));
//        System.out.println(isEmail("thao@"));
//        System.out.println(isEmail("thao@fpt.vn"));
//        
//    }
}
