public class Extra {


    public static int Fact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * Fact(n - 1);
    }

    public static int PowerTwo(int n,int p){
        if(p==0){
            return 1;
        }
        return n*PowerTwo(n, p-1);
    }
    public static Boolean IsPalindrome( String str,int i,int j){
        if(i==j || str.length()==0){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        } 
        return IsPalindrome(str, i+1, j-1);
    }

    public static String ReverseStr(String str, int j){
        if(j==0){
            char ch=str.charAt(j);
            return String.valueOf(ch);
        }
            char ch =str.charAt(j);
        return ch + ReverseStr(str, j-1);
    }

    public static String[] CapToOne(String[] arr, int i){
        if(i== arr.length){
            return arr;
        }

    }
    // public static void main(String[] args) {
        //System.out.println(Fact(5));
        //System.out.println(PowerTwo(2,2));
        String[] arr= {"car","taco"};
        CapToOne(arr, 0);
    String str="football";
    //System.out.println(IsPalindrome(str, 0, str.length()-1));
    //System.out.println(ReverseStr(str, str.length()-1));
    }
}

// Write your solution here
//Circle Class Calculator
import java.util.*;
public class Main {
    //public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int r =sc.nextInt();
     
    System.out.println(3.14*r*r);
      System.out.println((float)2 * 3.14  * r);
    }
}
