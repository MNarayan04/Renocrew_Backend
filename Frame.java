
import java.util.*;

public class Frame {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);
        l1.addLast(676);
        l1.addFirst(788);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        //l1.clear();
        l1.set(1, 566);
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
/*
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(66);
        System.out.println("L1 Linked list before: "+ l1);

        l1.addFirst(0); //Inserting 0 at the starting of L1
        System.out.println("L1 Linked list after: "  + l1);

    }
}


















import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);

        ad1.pollFirst(); //deletes 6
        ad1.removeFirst(); //deletes 56

        System.out.println(ad1);

    }
}


*/