import java.util.*;
public class cnt_of_common_even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(),i;
        ArrayList<Integer> a=new ArrayList<>();
        for(i=0;i<n1;i++){
            a.add(sc.nextInt());
        }
        int n2=sc.nextInt();
        ArrayList<Integer> b=new ArrayList<>();
        for(i=0;i<n2;i++){
            b.add(sc.nextInt());
        }
        a.retainAll(b);
        int c=0;
        for(i=0;i<a.size();i++){
            if(a.get(i)%2==0){
                c+=1;
            }
        }
        System.out.println(c);

    }
}
