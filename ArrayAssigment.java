public class ArrayAssigment {
    //Q1
    // public static boolean checkDuplicate(int num[]){
    //     for(int i=0;i<num.length;i++){
    //         int x=num[i];
    //         for(int j=i+1;j<num.length;j++){
    //             if(x==num[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
//Q3
//buy and sell stock

//Q4 trapped water 
// public static int trappedWater(int height[]){
// //left max array 
// int n=height.length;
// int leftMax[]= new int[n];
//     leftMax[0]=height[0];
//     for(int i=1; i<n; i++){
//         leftMax[i] = Math.max(height[i],leftMax[i-1]);
//     }
//     // right max array
//     int rightMax[] = new int[n];
//     rightMax[n-1]= height[n-1];
//     for(int i=n-2 ;i>=0 ;i--){
//         rightMax[i]= Math.max(height[i],rightMax[i+1]);
//     }
//     // loop  trapped water 
//     int trappedWater=0;
//     for(int i=0;i<n;i++){
//         int waterLevel=Math.min(leftMax[i],rightMax[i]);
//         trappedWater += waterLevel- height[i];
//     }
//     return trappedWater;
// }

//Q5 triple  sum==0
// public static void tripletSum(int num[]){
//     int sum=0;
//     for(int i=0 ; i<num.length ; i++){
//         int x = num[i];
//         for(int j=i+1 ; j<num.length ; j++){
//             int y = num[j];
//             for(int k=j+1 ; k<num.length ; k++){
//                 int z=num[k];
//                 if(i!=j && i!=k){
//                 sum=x+y+z;
//                 if(sum==0){
//                     System.out.println("["+ x + y + z+"]");
//                 }
//             }
//             }
//         }
//     }
// }


// q2 rotated array find element 
    public static int rotatedArray(int num[],int key){
        int n=num.length;
        int start=0; int end=n-1;
        while(start<end){
            int mid=(start+end)/2;
            if(num[start]<num[mid]){
                
            }
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]> key){
                end=mid-1;
                
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    // public static void main(String args[]){
        int rotated[]={4,5,6,7,0,1,2};
        //System.out.println(rotatedArray(rotated, 2));
        // int num[]= { -1 ,0 , 1 ,2 ,-1 ,-4};
        // tripletSum(num);
        // int num1[]= { 0 };
        // tripletSum(num1);
    // int  height[] = {0,1,0, 2,1,0,1,3,2,1,2,1};
    // System.out.println("trapped water is "+trappedWater(height));
    // int  height1[] = {4,2,0,3,2,5};
    // System.out.println("trapped water is "+trappedWater(height1));



        // int num[]={1,2,3,1};
        // System.out.println(checkDuplicate(num));
        // int num2[]={1,2,3,4};
        // System.out.println(checkDuplicate(num2));
        // int num3[]={1,1,1,3,3,2,4,4,5};
        // System.out.println(checkDuplicate(num3));
}
}
