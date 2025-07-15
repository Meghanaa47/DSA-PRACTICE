import java.util.*;

public class insertionsort {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter array values:");
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int key,j;
        for(int i=1;i<n;i++){
            key=a[i];
            j=i-1;
            while(j>=0&&a[j]>key){
                a[j+1]=a[j];
                    j=j-1;
            }
            a[j+1]=key;

            for(int num:a){
               System.out.print(num+" ");
            }
            System.out.println();
        }}
}
