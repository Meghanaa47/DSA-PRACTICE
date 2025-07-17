//there is a monkey who want the bananas.but the bananas kept on the nth step and it have
// to to reach the top.each time he can climb 1 or 2 steps.your work is o return how many distinct ways the monkey can climb the top

import java.util.Scanner;
public class nthStep {
   public static int distinctWay(int n){
      if(n==1||n==2)
      return n;
      return distinctWay(n-1)+distinctWay(n-2);
   }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the step number: ");
      int n=sc.nextInt();
      int x= distinctWay(n);
      System.out.print(x);
  }
}
