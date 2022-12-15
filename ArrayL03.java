import java.util.Scanner;

public class ArrayL03 {
  // Qus- Calculate the no of pair whose equal to the given target 
  // ex- [1,2,3,4,5], target=7, so 3+4, 2+5 are 2 pairs    
static int pairSum(int[]arr, int target){
    int n = arr.length;
     int ans = 0;  
    for(int i = 0;i<n;i++){// for first number
        for(int j = i+1; j<n;j++){ // for second number
            if(arr[i] + arr[j] == target){
                  ans++;
            }
        
        }
    }

    return ans;
}

// Qus = return the no of triplate when you add the three number of given arr
// ex = [1,4,5,6,3] target = 12 (1,5,6)(4,5,3) are two pairs which is returning the value after adding is 12

static int TripletSum(int[]arr, int target){
    int ans = 0;
    int  n = arr.length;
    for(int i = 0; i<n; i++){
       for(int j = i+1; j<n;j++){
        for(int k = j+1; k<n;k++){
            if(arr[i]+arr[j]+arr[k] == target){
                ans++;
            }
        }
       }
    }
    return ans;
}


// Qus - find The Unique Element in given array ex = [1,2,2,4,1] ans => 4
static int uniquNum(int arr[]){
    int n = arr.length;
    for(int i = 0; i<n; i++){
        for(int j = i+1; j<n; j++){
            if(arr[i]== arr[j]){
                arr[i] = -1;
                arr[j] = -1;
            }
        }
    }
    int ans = -1;
    for(int i = 0; i<n;i++){
        if(arr[i]>0){ 
            ans = arr[i];
        }
    }
    return ans;
}



static int findMax(int[]arr){
     int max = Integer.MIN_VALUE;
     int n = arr.length;

     for (int i = 0; i<n; i++) {
        if(arr[i]>max){
            max = arr[i];
        }
     }
     return max;
}


static int secondLargest(int arr[]){
    int n = arr.length;
    int max = findMax(arr);
       for(int i = 0;i<n;i++){
        if(arr[i]==max){
            arr[i] = Integer.MIN_VALUE;
        }
       }
       int secondMax = findMax(arr);
       return secondMax;
        }
    


        // Qus- return the  First Reapeating Number in given array if no repeating number exist then return -1; ex- 1 2 3 2 3 ans 2 ex- 1 2 3 4 5 ans = -1;
        static int firstRepeatingNumber(int[]arr){
            int n = arr.length;
            int ans = -1;
            for(int i = 0; i<n; i++){ // first number
                for(int j = i+1;j<n;j++){ // second number
                    if(arr[i]==arr[j]){
                      return arr[i];
                    }
                }
            }
            return -1;
        }


    public static void main(String []args){
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter Size of Array");
     int n = sc.nextInt();
     int [] arr = new int[n];


     System.out.println("Enter "+n+" elements");
     for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
     }
    //  System.out.println("Enter the sum target value");
    //  int target = sc.nextInt();


    //  System.out.println("Number of Pair = "+pairSum(arr, target));

    // System.out.println("No of triplets = "+TripletSum(arr, target));


    
    // System.out.println("The Unique Element Is: "+uniquNum(arr));



    // System.out.println("The Second Largets Value Is: "+secondLargest(arr));


    System.out.println("First Repeating Number Is: "+firstRepeatingNumber(arr));

    } 
}
