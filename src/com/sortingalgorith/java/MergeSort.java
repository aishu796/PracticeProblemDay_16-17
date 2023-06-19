package com.sortingalgorith.java;


import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("how many elements you want to enter");
        int n =sc.nextInt();
        int a[]=new int [n];
        System.out.print("Enter the array elements  ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        mergesort1(a,0,a.length-1);
        for(int val:a)
        {
            System.out.print(val+"    ");
        }

    }

    private static void mergesort1(int[] a, int i, int j)
    {
        if(i<j) {
            int mid = (i + j) / 2;
            mergesort1(a, i, mid);
            mergesort1(a, mid + 1, j);
            msort(a, i, mid, j);
        }



    }

    private static void msort(int[] a, int low, int mid, int high)
    {
        int i=low;
        int j=mid+1;
        int k=low;
        int []b=new int[a.length];
        while(i<=mid &&j<=high)
        {
            if(a[i]<a[j])
            {
                b[k]=a[i];
                i++;
                k++;


            }
            else {
                b[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            b[k]=a[i];
            i++;
            k++;
        }
        while(j<=high)
        {
            b[k]=a[j];
            j++;
            k++;
        }
        for( i=low;i<=high;i++)
        {
            a[i]=b[i];

        }
    }
}

