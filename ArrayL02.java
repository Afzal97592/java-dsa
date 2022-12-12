import java.util.Scanner;

public class ArrayL02 {

    static void printArray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];


    System.out.println("Enter "+ n+ " array elements");
    for(int i=0; i<n; i++){
         arr[i] = sc.nextInt();
    }

    // for(int i = 0; i<arr.length; i++){
    //     System.out.print(arr[i]+" ");

    // insted of above code here call only the function like
System.out.println("original array");
    printArray(arr);

    // }

    // trying to coppy arr into new array

    int[] arr_2 = arr;
    // for(int i =0; i<arr_2.length; i++){
    //     System.out.print(arr_2[i]+" ");
    // }
System.out.println("Copied Array");
    // printArray(arr_2);
    arr_2[0] = 1;
    arr_2[1] = 2;
    printArray(arr_2);
    }
}
