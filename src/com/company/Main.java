package com.company;

public class Main {

    public static void main(String[] args) {
        int p = 4;

        int g = 4;
        System.out.println(Math.pow(p, g));
        System.out.println(Math.sqrt(p));
        System.out.println(Math.sqrt(g));

        /////////////////////////////////////////////////////
        int a = 1;
        int b = -2;
        int c = -3;
        double d;
        double x1 , x2;
        d = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Дискриминант = " + d);
        x1 = (-b + Math.sqrt(d))/2;
        x2 = (-b - Math.sqrt(d))/2;
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);


    }


}
