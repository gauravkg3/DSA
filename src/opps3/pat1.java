package opps3;

import java.util.Scanner;

public class pat1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter new number:-");
        n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j <=2*i-1; j++) {
                if(j==2*i-1)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n-2; i>=0 ; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j <=2*i-1; j++) {
                if(j==2*i-1)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
