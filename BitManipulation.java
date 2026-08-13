public class BitManipulation {
    //even odd no
    public static void EvenOdd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even no ");
        }else{
            System.out.println("odd no ");
        }
    }
    public static int GetIthBit(int n, int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;

        }
        else{
            return 1;
        }
    }
    public static int SethithBit(int n, int i){
        int bitmask=1<<i;
        return n | bitmask;
    }
    public static int ClearithBit(int n , int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    public static int updateithBith(int n, int i, int newBit){
        //1 st approach
        // if(newBit==0){
        //     return ClearithBit(n, i);
        // }
        // else{
        //     return SethithBit(n, i);
        // }
        // 2nd approach
        n=ClearithBit(n, i);
        int bitmask=newBit<<i;
        return n | bitmask;
    }
    public static int ClearLastIBit(int n, int i){
        int bitmask=(-1)<<i;
        return n & bitmask;
    }
    public static int ClearRangeBit(int n, int i, int j){
        int a = ((~0)<<j+1);
        int b= (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask; 
    }
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0 ;
    }
    public static int CountSetBit(int n){
        int count=0;
        while(n>0){
            if((n & 1) !=0 ){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int FastExpo(int a, int n){
        int ans =1;
        while(n>0){
            if((n & 1) !=0){
                ans= ans * a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    // public static int ModularExpo(int a, int n , int x){

    // }
    public static int XpowX(int x){
        int result=1;
        for(int i=1; i<=x ; i++){
            result=x*result;
        }
        return result;
    }
    public static int Add1Num(int n){
    int bitmask=(~0);
    return n & bitmask;    
    }
    public static void ArrayReverse(int[] arr){
        int n= arr.length;
        int[] arr1 = new int[n];
        int j=0;
        for(int i=n-1 ; i>=0 ;i--){
            arr1[j]=arr[i];
            j++;
        }
        // for(int i=0 ;i<n-1; i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int i=0 ;i<n; i++){
            System.out.print(arr1[i]+" ");
        }
    }
    public static int[] RotateArrayLeft(int[] arr , int i , int j ){
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println( " ");
                return arr;

            
    }
    //leetcode  Q missing number  solved by my approach 
//     class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//                 if(i != nums[i]){
//                     return i;
                    
//                 }
//         }
//         return nums.length;
//     }
// }
    // public static void main(String args[]) {
        // EvenOdd(3);
        // EvenOdd(14);
       // System.out.println(GetIthBit(10, 3));
        // System.out.println(SethithBit(10, 2));
        //System.out.println(ClearithBit(10, 1));
        //System.out.println(updateithBith(10, 1,1));
        //System.out.println(ClearLastIBit(15, 2));
        //System.out.println(ClearRangeBit(10,2,4));
        //System.out.println(isPowerOfTwo(16));
         //System.out.println(CountSetBit(15));
        // System.out.println(FastExpo(5,3));
        // System.out.println(XpowX(2));
    //System.out.println(Add1Num(10));
   // int[] arr={2, 3,4,5,6,7,8,2,1,6};
    // ArrayReverse(arr);
    int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;
    RotateArray Left(arr, 0, n-1);
    RotateArrayLeft(arr, 0, n-k-1);
    RotateArrayLeft(arr, n-k, n-1);
    }
}
