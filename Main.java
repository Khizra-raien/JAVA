import java.util.Scanner;
abstract class Simple{
    abstract void add(int a,int b);
    void sub(int a, int b){
        int s=a-b;
        System.out.println("subtraction is "+s);}}
public class Main extends Simple{
    void add(int a,int b){
        int sum=a+b;
        System.out.println("addition is "+sum);}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first value");
        int a=sc.nextInt();
        System.out.println("enter a second value");
        int b=sc.nextInt();
        Main t=new Main();
        t.add(a,b);
        t.sub(a,b);
    }
}
