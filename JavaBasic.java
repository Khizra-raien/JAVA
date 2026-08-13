import java.util.*;
public class JavaBasic {
  //  public static void main(String args[]){
Scanner sc = new Scanner(System.in);
// System.out.println("enter price of pencil, pen , eraser");

// float pencil = sc.nextFloat();
// float pen = sc.nextFloat();
// float er = sc.nextFloat();
// float sum = pencil + pen + er;
// System.out.println("total bill :"+
// sum);

// // with gst
// float gst =sum*0.18f;
// float total =sum+gst;
// System.out.println("total bill with gst: "+total);

// Q4
// byte b =4;
// char c ='a';
// short s =512;
// int i = 1000;
// float f=3.14f;
// double d=99.9954;

// double result =(f*b)+(i%c)-(d*s);
// System.err.println(result);

//Q5 will give error

// int x9 = 25;
// System.err.println(x9);

///Q1
// int x=2, y=5;
// int exp1=(x*y/x);
// int exp2=(x*(y/x));
// System.err.println(exp1);
// System.err.println(exp2);


//  Q4 Factorial of any no
// System.out.println("enter no for factorial");
// int n=sc.nextInt();
// int fact=1;
// for(int i=1; i<=n;i++){
//     fact*=i;

// }
// System.out.println("factorial of no "+n +" is : "+fact);

//Q2 print sum of even count and odd count
// System.err.println("enter no");
// int n=sc.nextInt();
// int evenCount=0, oddCount=0;
// for(int i=1;i<n;i++){
//     int lastDigit=n%10;
//     if(lastDigit%2==0){
//         evenCount+=lastDigit;
//     }
//     else{
//         oddCount+=lastDigit;
//     }
//     n=n/10;
// }
// System.out.println("sum of even no is "+evenCount);
// System.out.println("sum of odd no is "+oddCount);

System.out.println("enter no");
int n=sc.nextInt();
int table=1;
for(int i=1; i<=10;i++){
    table=n*i;
    System.out.println(n+"*"+i+"="+table);

}
}
}
