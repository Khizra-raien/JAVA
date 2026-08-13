import java.util.*;
public class Array {
    // public static int linearSearch(String menu[] ,String  food){
    //     for(int i=0;i<menu.length;i++){
    //         if(menu[i]==food){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static int largestNo( int num[] ){
    //     int max=Integer.MIN_VALUE;
    //     int small=Integer.MAX_VALUE;
    //     for(int i=0;i<num.length;i++){
    //         if(small>num[i]){
    //             small=num[i];
    //         }
    //     }
    //     System.out.println("smallest no is "+ small);
    //     for(int i=0; i<num.length; i++){
    //         if(max<num[i]){
    //             max=num[i];
    //         }
    //     }
    //     return max;
        
    // }
    // public static int binarySearch(int num[],int key){
    //     int start=0; int end = num.length-1;
    //     while(start<= end){
    //         int mid=(start+end)/2;
    //         if(num[mid]==key){
    //             return mid;
    //         }
    //         if(num[mid]>key){
    //             end=mid-1;
    //         }
    //         else{
    //             start=mid+1;
    //         }
            
    //     }
    //     return -1;
    // }
// public static void reverseArray(int num[]){
//     int first=0; int last=num.length-1;
//     while(first<last){
//         int temp =num[last];
//         num[last]=num[first];
//         num[first]=temp;
//         first++;
//         last--;
//     }
// }

// public static void printPairs(int num[]){
//     int tp=0;
//     for(int i=0;i<num.length;i++){
//         int curr=num[i];
//         for(int j=i+1;j<num.length;j++){
//             System.out.print("("+curr+","+num[j]+")"+" ");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("total pairs"+tp);

// }

public static void printSubarray(int num[]){
    int ts=0;
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int curSum=0;
    //int Sum=0;
    for(int i=0;i<num.length;i++){
    int start =i;
    for(int j=0;j<num.length;j++){
        int end=j;
        curSum=0;
        for(int k=start ;k<=end;k++){
            System.out.print("("+num[k]+")");
            ts++;
            curSum+=+num[k]; 
        }
        if(max<curSum){
            max=curSum;
        }
        if(min>curSum){
            min=curSum;
        }
        System.out.println();
    }
    System.out.println();
}
System.out.println("max sum is "+max);
System.out.println("min sum is "+min);
System.out.println("total subarray is  "+ts);
}

//public static void main(String args[]){

int num[]={ 2,4,6,8,10};
printSubarray(num);

//printPairs(num);
// reverseArray(num);
// for(int i=0;i<num.length;i++){
//     System.out.print(num[i]+" ");

// int key=2;
// int index=binarySearch(num,key);
// System.out.println("index for key at "+ index);
// int maxNo = largestNo(num);
// System.out.println("largest number is "+ maxNo);


        // String menu[]= {"dosa","idle","sandwich","thickshakes","samosa"};
        // String food="thickshakes";
        // int index= linearSearch(menu, food );
        // if(index==-1){
        //     System.out.println("food not found");
        // }
        // else{
        //     System.out.println("food found at index  "+index);
        // }
}
}

