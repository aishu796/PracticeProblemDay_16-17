package com.sortingalgorith.java;



public class InsertionSort {
    public static void main(String [] args ) {
    int arr[]={21,1,65,48,3};
    int length=arr.length;
        System.out.println("UnSorted array is:");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+"   ");
        }

        for(int i=1;i<length;i++)
    {
        int key=arr[i];
        int j=i-1;

        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j=j-1;

        }
        arr[j+1]=key;

    }
        System.out.println();
        System.out.println("Sorted array is:");
    for(int i=0;i<length;i++){
        System.out.print(arr[i]+"   ");
    }


    }
}