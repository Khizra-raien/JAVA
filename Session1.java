import java.util.*;
public class Session1 {
    //  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // Q1 sum of even no and odd no
//         int SumEven=0;
//         int SumOdd=0;
//         char choice='y';
//         do{
//             System.out.println("enter your number  ");
//             int n=sc.nextInt();
//             if(n%2==0){
//                 SumEven+=n;
//             }
//             else{
//                 SumOdd+=n;
//             }
//             System.out.println("do you want to continue yes 'y' or no'n'");
//             choice =sc.next().charAt(0);
//         }while(choice=='y');
// System.out.println("sum of even no is "+SumEven);
// System.out.println("sum of odd no is "+SumOdd);

// Q2 factorial of no 
// System.out.println("enter your number  ");
// int n=sc.nextInt();
// int fact=1;
// for(int i=n;i>0;i--){
//     fact*=i;
// }
// System.out.println("factorial of number "+ n+ "  is  "+ fact);

int x=sc.nextInt();
 int rev=0;
        while(x>0){
            int lastDig=x%10;
            rev=rev*10+lastDig;
            x/=10;
        }
        System.out.println(rev);
    
}
}
