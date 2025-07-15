import java.util.Scanner;
public class quicksort {
       static void quick(int a[],int low,int high){
            if(low<high){
                int pi=partition(a,low,high);
                quick(a,low,pi-1);
                quick(a,pi+1,high);
            }
        }
       static int partition(int a[],int low,int high){
            int pivot=a[high];
            int i=low-1;
            for(int j=low;j<high;j++){
                if(a[j]<pivot){
                    i++;
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
            int t=a[i+1];
            a[i+1]=a[high];
            a[high]=t;
            return i+1;
        }
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter array values:");
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        quick(a,0,a.length-1);
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
