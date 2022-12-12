import java.util.Scanner;
public class ArrayL02One {

    static void  changeArray(int[] arr){
          
        for(int i = 0; i<arr.length;i++){
            arr[i] = 0;
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[]args){
         int[] arr = new int[3];
         arr[0] = 6;
         arr[1] = 7;
         arr[2] = 8;

         changeArray(arr);

        
    
    }
}
