import java.util.Scanner;

public class mergesort {
    static void divide(int a[],int l,int h){
        if(l<h){
            int mid=(l+h)/2;
           divide(a,l,mid);
           divide(a,mid+1,h);
            merge(a,l,mid,h);
        }
    }
    static void merge(int a[],int l,int m,int h){
        int n1=m-l+1;
        int n2=h-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
           left[i]=a[l+i];
        for(int i=0;i<n2;i++)
           right[i]=a[m+i+1];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            a[k++]=left[i]<right[j] ? left[i++] : right[j++];
            }
        while(i<n1){
            a[k++]=left[i++];
        }
        while(j<n2){
            a[k++]=right[j++];
        }

    }
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter array values:");
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        divide(a,0,a.length-1);
        for(int num:a){
            System.out.print(num+" ");
        }}
}
