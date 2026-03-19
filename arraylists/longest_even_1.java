import java.util.*;
public class longest_even_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int index=-1;
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        int n=list.size();
        Collections.sort(list,Collections.reverseOrder());
        for(int i=n-1;i>=0;i--){
            if((list.get(i)-'0')%2==0){
                index=i;
                break;
            }
        }
        char a=list.get(index);
        if(index==-1){
            System.out.println("-1");
        }
        else{
            for(int i=index;i<n-1;i++){
                list.set(i,list.get(i+1));    // Collections.swap(list,i,i+1);
            }
            list.set(n-1,a);
        }
        String str1="";
        for(int i=0;i<n;i++){
            str1+=list.get(i);
        }
        System.out.println(str1);
    }
}
