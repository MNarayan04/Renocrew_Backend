// import javax.print.Doc; 
// class EkClass{ 
// int a; 
// public int getA() { 
// return a; 
// } 
// EkClass(int a){ 
// this.a = a;
//  } 
// public int returnone(){
//  return 1; 
// } 
// } 
// class DoClass extends EkClass{ DoClass(int c){ super(c); 
// System.out.println("I am a constructor"); } 
// } 
// public class pratice11 {
//     public static void main(String[] args) {
//         EkClass e = new EkClass(65); 
//        DoClass d = new DoClass(5); 
//        System.out.println(e.getA()); }
// }




class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class pratice11 {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
