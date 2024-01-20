
// problem 1
package com.company

public class cwh{
    public static void main (String[] args){
        float a = 7/4/0f*9/2.0f;
        System.out.println(a);

    }

}

//Problem - 2

float v = 10;
        float u = 2;
        float a = 5;
        float s = 4;
        float sc = (v * v - u * u) / (2 * a * s);
        System.out.println(sc);


//Problem  - 3

package Percectage;
import java.util.Scanner;
public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "write the value of v ");
        float v = sc.nextFloat();
        System.out.println( "write the value of u ");
        float u = sc.nextFloat();
        System.out.println( "write the value of a ");
        float a = sc.nextFloat();
        System.out.println( "write the value of s ");
        float s = sc.nextFloat();
        System.out.println( ((v * v) - ( u * u ))/(2 * a * s)  );

    }
}