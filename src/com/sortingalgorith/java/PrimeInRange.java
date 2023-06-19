package com.sortingalgorith.java;

import java.util.Scanner;

public class PrimeInRange
{
    public static void main(String[] args) {
        int min,max,flag=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the minimum value");
        min=sc.nextInt();
        System.out.println("Enter the maximun value");
        max=sc.nextInt();
        for(int n=min;n<=max;n++)
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(n+"  ");
            }
            flag=0;
        }
    }
}
