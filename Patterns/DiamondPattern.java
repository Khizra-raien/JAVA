public class DiamondPattern {
   // public static void main(String args[]) {
        int n=4;
        // upper half
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){ //spaces
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){ // star
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
