import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter array values:");
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int min,k=0;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])
                min=j;
            }
            if(min!=i){
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            k+=1;
            }
            for(int num:a){
               System.out.print(num+" ");
            }
            System.out.println();
        }
        System.out.println(k);
    }
}
