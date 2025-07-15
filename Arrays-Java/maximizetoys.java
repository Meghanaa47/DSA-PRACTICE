import java.util.*;
public class maximizetoys {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int total=sc.nextInt();
        int a[]=new int[n];
       Arrays.sort(a);
        int c=0,sum=0;
        for(int i:a){
            sum+=i;
           if(sum>total)
           break;
           c++;
            
        }
        System.out.println(c);
    }
}
