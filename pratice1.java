// Practice Set 1 Solutions: 

// Question 1:-
public class Practice_Set_001 {
    public static void main(String[] args) {
        System.out.println("Sum Of Three Numbers: ");
        int a = 45;
        int b = 45;
        int c = 45;
        int sum = a + b + c;
        System.out.println(sum);
    }
}

//  Question 2
import java.util.Scanner;

public class Practice_Set_001{
    public static void main(String[] args) {
        int s1, s2, s3;
        Scanner s = new Scanner(System.in);
        System.out.println("CGPA Of Three Subjects: ");
        System.out.println("Marks of s1: ");
        s1 = s.nextInt();
        System.out.println("Marks of s2: ");
        s2 = s.nextInt();
        System.out.println("Marks of s3: ");
        s3 = s.nextInt();

        int total = s1 + s2 + s3;
        System.out.println("Total Marks: "+ total);

        double cgpa = (total/300.0) * 100;
        System.out.println("CGPA Of Three Subjects: " + cgpa);
    }
}

//  Question 3:-

import java.util.Scanner;

public class Practice_Set_001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = s.next();
        System.out.println("Hello " + name + ", have a good day.");
    }
}

//  Question 4:-
import java.util.Scanner;
public class Practice_Set_001 {
    public static void main(String[] args) {
        double miles, km;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter speed in km: ");
        km = s.nextFloat();
        miles = km * 0.62;
        System.out.println("Speed In Miles is: "+miles);
    }
}

//  Question 5:-

import java.util.Scanner;

public class Practice_Set_001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Checking If Number Is Integer Or Not: ");
        System.out.println("Enter Number: ");
        boolean b1 = s.hasNextInt();
        System.out.println(b1);
    }
}