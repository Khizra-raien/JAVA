import java.util.*;
public class OOPS {
    // public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter real number");
        int real=sc.nextInt();
        System.out.println("enter imaginary number");
        int img= sc.nextInt();

        Complex numb = new Complex(); 
        System.out.println("sum of 2 number is "+numb.sum(real,img));
        System.out.println("diff of 2 number is "+numb.diff(real,img));
        System.out.println("product of 2 number is "+numb.product(real,img));
        // Bear b= new Bear();
        // b.eats();
        // b.sleep();
    }
}

class Complex{
    int real;
    int img;
    public int sum(int r, int i){
        return i+r;
    }
    public int diff(int r, int i){
        return r-i;
    }
    public int product(int r ,int i){
        return r*i;
    }
}
interface carnivore{
    void eats();
}
interface herbivore{
    void sleep();
}
class Bear implements carnivore, herbivore{
    public void eats(){
        System.out.println("eats both grass and meat");
    }
    public void sleep(){
        System.out.println("sleep more than 3 hrs");
    }
}
