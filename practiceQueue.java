import java.util.Scanner;

public class practiceQueue {
    public static int front=0;
    public static int rear=-1;
    static int[] arr= new int[5];
    public static Boolean isFull(){
        return rear==arr.length-1;
    }
    public static Boolean isEmpty(){
    return rear<front;

}
public static void enqueue(int val){
    if(isFull()){
        System.out.println("queue overflow");
        return;
    }
    rear++;
    arr[rear]=val;
}
public static void dequeue(){
    if(isEmpty()){
        System.out.println("queue underflow");
        return;
    }
    System.out.println("dequeue element: " + arr[front]);
    front++;
}
public static void peek(){
    if(isEmpty()){
        System.out.println("queue underflow");
        return;
    }
    System.out.println("peek element: " + arr[front]);
}
public static void printQueue(){ 
    
    if(isEmpty()){
        System.out.println("queue underflow");
        return;
    }
    System.out.println("queue element: ");
    for(int i=front;i<=rear;i++){
        System.out.println(arr[i]);
    }
}


    // public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
int choice;
        while(true){
            System.out.println("1. enqueue  2 dequeue  3 peek 4 print queue");
            choice=sc.nextInt();
            switch (choice){
                case 1:System.out.println("enter value");
                int val=sc.nextInt();
                enqueue(val);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    printQueue();
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}
