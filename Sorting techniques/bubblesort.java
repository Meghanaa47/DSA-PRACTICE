import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter array values:");
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int k=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                k+=1;
                }
            }
            for(int num:a){
              System.out.print(num+" ");
            }
            System.out.println();
        }
       System.out.println(k);
    }
}
