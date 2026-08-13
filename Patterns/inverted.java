 import java.util.Scanner;

 public class inverted {
    //INVERTED PYRAMID
//   public static void invertPatterns(int n ){
//     for(int i=1;i<=n;i++){
//         for(int k=1;k<=n-i;k++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.err.println();
//     }
//  }

// INVERTED NUMBER PYRAMID

// public static void invertNumb(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i+1;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }
// FLOYD PATTERNS
// public static void floydPattern(int n){
//     int num=1;
//     for(int i=1;i<=n;i++){
//         for(int j=1 ;j<=i;j++){
//             System.out.print(num +" ");
//             num++;
//         }
//         System.out.println();
//     }
// }

// 0-1 TRIANGLE PATTERNS
public static void zeOnePat(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            sum=i+j;
            if(sum%2==0){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }
        System.out.println();
    }

}

// public static void main(String args[]) { 
        //invertPatterns(4);
//invertNumb(5);
//floydPattern(5);
zeOnePat(5);
}

}