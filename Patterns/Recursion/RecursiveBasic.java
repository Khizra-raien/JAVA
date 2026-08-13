package Recursion;

public class RecursiveBasic {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
    //fibonacci number
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        return fnm1+fnm2;
    }
    // sorted array
    public static boolean sortedArray(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        
        return sortedArray(arr, i+1);
    }
    // first occurrence of an number 
    public static int firstOcc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    // last occurrence of an number 
    public static int lastOcc(int arr[], int key, int i){
        if(i==arr.length){
            return-1;
        }
        int isFound=lastOcc(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    // power of x^n O(n) tc 
    public static int powern(int x, int n){
        if(n==0){
            return 1;
        }
        return x*powern(x,n-1);
    }
    // optimized approach of x^n is O(log n)
    public static int optimizedPow(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpow=optimizedPow(a, n/2);
        int halfPowSq=halfpow*halfpow;

        if(n%2 !=0){  
            return a* halfPowSq;
        }
        return halfPowSq;
    }
    public static void intToStr(int n, String[] arr ){
        if(n==0){
            return;
        }
        int lastdig=n%10;
        n=n/10;
        intToStr(n, arr);
        System.out.print(arr[lastdig]+" ");
    }
    public static void StringLength(String str,int idx){

        if(n==str.length()){
            return;
        }
    }
    public static void TowerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disc from "+src +" to "+ dest);
            return;
        }
        TowerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disc from "+src +" to "+ dest);
        TowerOfHanoi(n-1, helper, src, dest);
    }
    public static Boolean SortedArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return SortedArray(arr, idx+1);
        }else{
            return false;
        }
        
        
    }
        public static String newstr=" ";
        public static    int count=0;   
    public static String moveXatEnd(String str, int idx){
        
        char currChar=str.charAt(idx);
        if(idx==str.length()-1){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            return newstr;
        }
        if(currChar!='x'){
            newstr+=currChar;
            moveXatEnd( str,  idx+1);
        }else{
            count++;
            moveXatEnd( str,  idx+1);
        }
        return newstr;
    }
    public static void main(String args[]) {
        System.out.println(moveXatEnd("axbcdxx", 0));
        int[] arr={1,2,3,4,5};
        //System.out.println(SortedArray(arr,0));
        //TowerOfHanoi(3, "S","H","D");
        // String[] words={"zero", "one","two","three","four","five", "six","seven","eight","nine"};
        // int n=1774;
        // if(n==0){
        //     System.out.println("zero");
        //     return;
        // }else{
        //     intToStr(n, words);
        // }
        
        //int[] arr={8,4,5,6,3,4,6,7,4,5};
        //System.out.println(optimizedPow(2,10));
        //System.out.println(powern(2,5));
        //System.out.println(lastOcc(arr,6,0));
        //System.out.println(firstOcc(arr,6,0));
       // System.out.println(sortedArray(arr, 0));
        // System.out.println(fib(5));
        //System.out.println(fact(4));
    }
}
