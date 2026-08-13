import java.util.Scanner;

public class halfPyramid {
// PRIME NO IN A RANGE

// public static boolean isPrime(int n){
//     if(n==2){
//         return true;
//     }
//     for(int i=2;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//             return false;
//         }
//     }
//     return true;
// }
// public static void primeRange(int n){
//     for(int i=2;i<=n;i++){
//     if(isPrime(i)){
//         System.err.println(i+"");
//     }
// }
// }


// BINARY TO DECIMAL NUMBER
// public static void BinToDec(int n){
//     int pow=0;
//     int lastDig = 1;
//     int sum = 0;
//     while(n>0){
    
//     lastDig = n%10;
//     sum = sum+(lastDig*(int)Math.pow(2,pow));
//     pow++;
//     n=n/10;
// }
//  System.out.println("decimal no is :"+sum);
// }

// DECIMAL TO BINARY

// public static void DecToBin(int n){
//     int myNum=n;
// int bin=0;
// int pow=0;
// int rem=1;
// while(n>0){
//     rem=n%2;
//     bin=bin+ (rem*(int)Math.pow(10,pow));
//     pow++;
//     n=n/2;
// }
// System.out.println("binary  no of "+myNum  +" is " + bin);
// }
 // SUM OF DIGIT Q5

//  public static void sumDig(int n){
//     int sum=0;
//     int myNum=n;
//     while(n>0){
//        int  lastDig=n%10;
//         sum=sum+lastDig;
//         n/=10;

//     }
//     System.err.println("Sum of Digit "+myNum  +" is " + sum);
//  }

// palindrome of a number 

public static void palindrome(int n){
    int origNo=n ;
    int oldNo=n;
    int rev=0;
    int leng=0;
    while(n!=0){
        leng++;
        n/=10;
    }
    int pow=leng-1;
    while(origNo>0){
        int lastDig=origNo%10;
        rev=rev+(lastDig*(int)Math.pow(10,pow));
        pow--;
        origNo/=10;
    }
    if(oldNo==rev){
        System.out.println("the number is palindrome  "+oldNo );
    }
    else{
        System.out.println("the number is not  palindrome  " +oldNo);
    }
}
    // public static void main(String args[]){
        //isPrime(10);
        //rimeRange(20);
        //BinToDec(1001);
        //DecToBin(5);
        //sumDig(777);
        palindrome(121);

Scanner sc = new Scanner(System.in);


// inverted half pyramid
// for(int i=1;i<=4;i++){
//     for(int j=4;j>=i;j--){
//        System.out.print("*");
//     }
//     System.out.println();
// }


//half pyramid with number
// for(int i=1;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }


//Character pattern
// int n=7;
// char ch='A';
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(ch);
//         ch++;
//     }
//     System.out.println();
// }





}
}
