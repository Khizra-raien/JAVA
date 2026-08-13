public class KadanesMaxSubArray {
    public static void maxSubArray(int num[]){
        //int maxNo=Integer.MIN_VALUE;
        // int cs=0;
        // all -ve no
        // maxNo=num[0];
        // for(int i=0;i<num.length;i++){
            
        //     if(num[i]>maxNo){
        //         maxNo=num[i];
        //     }
        // }
        // System.out.println("max sum of subarray is "+maxNo);
// mixed no 
  int cs = num[0];
int maxSum = num[0];

for(int i = 1; i < num.length; i++){
    if(cs + num[i] > num[i]){
        cs = cs + num[i];
    } else {
        cs = num[i];
    }

    if(cs > maxSum){
        maxSum = cs;
    }
}
System.out.println("max sum of subarray is "+maxSum);
    }
        
// all +ve no
    //     for(int i=0;i<num.length;i++){
    //         cs=cs+num[i];
    //         if(cs<0){
    //             cs=0;
    //          }
    //         if(maxNo<cs){
    //              maxNo=cs;
    //         }
    //      }
    //     System.out.println("max sum of subarray is "+maxNo);
    // }

public static void main(StringClass args[]){
        int num[]={-1,-2,-4,7,-3,9};
        maxSubArray(num);
    }
}