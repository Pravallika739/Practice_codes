import java.util.ArrayList;
import java.util.Scanner;

public class kth_largest_element {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(),i;
        ArrayList<Integer> a=new ArrayList<>();
        for(i=0;i<n1;i++){
            a.add(sc.nextInt());
        }
       ArrayList<Integer> b=new ArrayList<>();
       int max=0;
       int res=0;
       int k=sc.nextInt();
       while(k>0){
        max=0;
       for(i=0;i<a.size();i++){
            if(a.get(i)>max){
                max=a.get(i);
            }
       }
       res=max;
       a.remove(Integer.valueOf(max));
       k-=1;
      }
      max=0;
      for(i=0;i<a.size();i++){
            if(a.get(i)>max){
                max=a.get(i);
            }
       }
       System.out.println(res);
    }
}
