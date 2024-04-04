/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ThinkPad
 */
public class Validate {

    private static String REGEX_NUMBER = "^[1-9]\\d*$";

    public static boolean checkEmpty(String str) {
        return str.trim().isEmpty();
    }

    public static boolean checkBookID(String id) {
        if (id.trim().length() != 6) {
            return false;
        }
        Pattern regex = Pattern.compile("^(BU|MC|PS|PC)$");
        Matcher matcher = regex.matcher(id.trim().substring(0, 2));
        if (!matcher.matches()) {
            return false;
        }
        if (!id.trim().substring(2).matches(REGEX_NUMBER)) {
            return false;
        }
        return true;
    }
}
