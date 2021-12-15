package com.exmaple.recursion;

import java.util.Scanner;

public class PairStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");

        String s = scanner.nextLine();
        System.out.println(PairStar(s, 0));
    }

    static String PairStar(String s, int i) {
        if (i >= s.length()-1) return s;

        s = (s.charAt(i)==s.charAt(i+1)) ? s.substring(0, i+1) + '*' + s.substring(i+1) : s;
        return PairStar(s, i+1);
    }
}
