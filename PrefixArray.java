import java.util.*;
public class PrefixArray {
    public static void prefixArraySum(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){    //prefix array
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0;i<num.length;i++){    //start
            int start=i;
            for(int j=i;j<num.length;j++){  //end
                int end=j;
                currSum= start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum is "+maxSum);
    }
    public static void main(StringClass args[]){
      //  int num[]={2,4,6,8,10};
        prefixArraySum(num);
    }
    
}
