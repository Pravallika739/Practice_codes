import java.util.*;
public class ArrayListMethods {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(10);
        System.out.println(a.lastIndexOf(10));
        System.out.println(a);
        a.add(1,100);
        System.out.println(a);
        a.set(2,200);
        System.out.println(a);
        a.remove(3);
        System.out.println(a);
        a.remove(Integer.valueOf(40)); // removes the first occuring index of 40
        System.out.println(a);
        ArrayList<Integer> b=new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(b);
        a.addAll(b);
        System.out.println(a);
        //a.removeAll(b); // removes all elements of b in a, if 4 is present in a and b aslo, all 4s will be removed from a and b -- difference i.e uncommon elements
        System.out.println(b);
        a.retainAll(b); // retains only those elements of a which are also present in b -- intersection i/e common elements
        System.out.println("sorting started");
        System.out.println(a);
        System.out.println(b);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
        Collections.reverse(b);
        System.out.println(b);
        ArrayList<Integer> c=new ArrayList<>(a); 
        c=a;
        System.out.println(c);
         System.out.println(c.contains(4));
    }
}
