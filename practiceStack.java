import java.util.*;
public class practiceStack {
    static int[] stk = new int[5];
    static  int top=-1;

    public static Boolean isEmpty(){
    return top==-1;

}

public static Boolean isFull(){
    return stk.length-1==top;
} 
public static void push(int val){
    if(isFull()){
        System.out.println("stack overflow");
        return;
    }
    top++;
    stk[top]=val;
}
public static void pop(){
    if(isEmpty()){
        System.out.println("stack underflow");
        return;
    }
    System.out.println("pop element  "+stk[top]);
    top--;
}
public static void peep(){
    if(isEmpty()){
        System.out.println("stack underflow");
        return;
    }
    System.out.println("peep element  "+stk[top]);
}
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);

while(true){
System.out.println("1. push  2 pop  3 peep 4 print stack");

int choice=sc.nextInt();
    switch (choice){
        case 1:System.out.println("enter value");
        int val=sc.nextInt();
        push(val);
            break;


        case 2: pop();
        break;

        case 3:peep();
        break;

        case 4:
            System.out.println("stack element");
            for(int i=0;i<5;i++){
                System.out.println(stk[i]);
            }
            break;
        
        default: System.out.println("enter a valid number");
    }
    }// single array 3 stack ko implement 
}
    
}
