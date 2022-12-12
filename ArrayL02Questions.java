import java.util.Date;
import java.io.*;
import java.util.Scanner;

public class ArrayL02Questions {

   
    static void noOfOccurance(int[] arr, int x){
 
int count = 0;
for(int i = 0; i<arr.length; i++){
    if(arr[i] == x){
        count++;
    }
}
System.out.println("The number of Occurance of x is: "+ count);
    }

    static void lastOccuranceofX(int[] arr, int x){
        int lastIndex = -1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        System.out.println("last Occurance Of X: "+ lastIndex);
        // return lastIndex; use when you want to return the value and want to print in main function
    }

    static void strictlyGreaterNo(int[] arr, int x){
        int count = 0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] > x){
                count++;
            }
        }
        System.out.println("The No Elements Greater than "+ x+ " : "+ count);
    }

    static  void isSorted(int[] arr){
        boolean check = true;

        for(int i = 1; i<arr.length; i++){
            // loop start from 1 becouse on first comparison we will compare between 0 and -1 so -1 is not a index value
              if(arr[i]<arr[i-1]){
                check = false;
                break;
              }
        }
        System.out.println(check);
    }
    

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter Size Of array");
        int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter "+ n+ " Elememts for array");

         for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
         }



        //  System.out.println("Enter that no Which you want to no of occurance");


        // System.out.println("Enter that no Which you want to the last occurance of that number");
        //    int x = sc.nextInt();
            // noOfOccurance(arr, x);

            // Q2- print the last occurance of x ex- [1,2,3,3,1,1] ans-5

            // lastOccuranceofX(arr, x);



            // Q-3 print the no of elements which is strictly greater then x   : ex=> arr[1,2,3,4,5] x = 2  ans = 3
            // System.out.println("Enter the no x For find The no of Greater Elemet X: ");
            // int x = sc.nextInt();
            // strictlyGreaterNo(arr, x);




            //Q-4 is array sorted or not
            isSorted(arr);
    }
}
