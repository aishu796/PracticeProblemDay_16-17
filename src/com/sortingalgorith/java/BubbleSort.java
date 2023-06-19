package com.sortingalgorith.java;

public class BubbleSort
{
    public static void main(String[] args) {
        int arr[]={5,1,2,3,6,};
        int length=arr.length;
        System.out.println("UnSorted Array is:");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+"  ");
        }
        for(int i=0;i<length;i++)
        {
            for(int j=1;j<length-i;j++){
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array is:");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+"  ");
        }

    }
}