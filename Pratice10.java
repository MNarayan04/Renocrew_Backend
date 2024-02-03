// // package com.company;

// class Base{
//     public int x;

//     public int getX() {
//         return x;
//     }

//     public void setX(int x) {
//         System.out.println("I am in base and setting x now");
//         this.x = x;
//     }

//     public void printMe(){
//         System.out.println("I am a constructor");
//     }
// }

// class Derived extends Base{
//     public int y;

//     public int getY() {
//         return y;
//     }

//     public void setY(int y) {
//         this.y = y;
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         // Creating an Object of base class
//         Base b = new Base();
//         b.setX(4);
//         System.out.println(b.getX());

//         // Creating an object of derived class
//         Derived d = new Derived();
//         d.setY(43);
//         System.out.println(d.getY());
//     }
// }




// package com.company; 
import javax.print.Doc; 
class EkClass{ 
int a; 
public int getA() { 
return a; 
} 
EkClass(int a){ 
this.a = a;
 } 
public int returnone(){
 return 1; 
} 
} 
class DoClass extends EkClass{ DoClass(int c){ super(c); 
System.out.println("I am a constructor"); } 
} 
public class Pratice10 { 
public static void main(String[] args) {
 EkClass e = new EkClass(65); 
DoClass d = new DoClass(5); 
System.out.println(e.getA()); } }