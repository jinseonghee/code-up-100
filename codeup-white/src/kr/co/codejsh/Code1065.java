package kr.co.codejsh;

import java.util.Scanner;

public class Code1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a%2==0)
            System.out.printf("%d ", a);
        if(b%2==0)
            System.out.printf("%d ", b);
        if(c%2==0)
            System.out.printf("%d ", c);
    }
}

