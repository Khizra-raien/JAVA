public class RhombusPattern {

    public static void HollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                if(i==1|| i==n || j==1 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // public static void main(String args[]) { 
        HollowRhombus(5);
    // int n=7; 
    // for(int i=1;i<=5;i++){
    //     for(int k=1;k<=n-i;k++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=n;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

}
}
