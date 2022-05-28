/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author janjan
 */
public class Palindrom {
    public static void main(String[] args) {
        String kata1, kata2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kata 1 = ");
        kata1 = input.nextLine();
        
        System.out.print("Kata 2 = ");
        kata2 = input.nextLine();
        
        String temp = "", temp1 = "";
        for (int i = kata1.length()-1; i >= 0; i--) {
            temp += kata1.charAt(i);
        }
        System.out.print("\nPalindrom kata 1 = "+temp.toLowerCase());
        
        for (int i = kata2.length()-1; i >= 0; i--) {
            temp1 += kata2.charAt(i);
        }
        System.out.print("\nPalindrom kata 2 = "+temp1.toLowerCase());
        
    }
}
