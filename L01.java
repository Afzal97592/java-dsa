class ArraysExample{
    void SumOfArray(){
        int[] arr = {1,4,5,6,9, 10};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum+arr[i];
        }
    System.out.println(sum);
    }

    void maxOfArray(){
        int[] arr_2 = {2,5,6,78,20, 80};  // ans = 8
        int max = 0;
        for(int i = 0; i<arr_2.length; i++){
            if(arr_2[i]>max){
                max = arr_2[i];
            }
        }
         System.out.println(max);
    }

    void searchGivenElement(){
        int[] arr3 = {4,5,6,9,10,4};
        int gElm = 4;
        int ans = -1;
        for(int i = 0; i<arr3.length;i++){
            if(arr3[i]==gElm){
               ans = i;
            //    break;  for if you are searching for first appearenc ogf sane digit in  same areay
            }
        } 
        System.out.println("The answer is equal to: "+ans);
          
   
}

public class L01 {
    public static void main(String[]args){
        ArraysExample obj = new ArraysExample();
        obj.SumOfArray();
        obj.maxOfArray();
        obj.searchGivenElement();
    }
}
}