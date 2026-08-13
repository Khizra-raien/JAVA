public class Sorting {
    // public static void bubbleSort(int arr[]){
    //     for(int i=0; i<arr.length-1 ;i++){
    //         int swap=0;
    //         for(int j=0; j<arr.length-1-i ; j++){
                
    //             if(arr[j]>arr[j+1]){
    //                 int temp= arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1]= temp;
    //                 swap++;
    //         }
            
    //         }
    //         if(swap==0){
    //             System.out.println("array is already sorted");
    //             break;
    //         }
    //     }
    // }

    public static void printSort(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");        }
            System.out.println();
    }
    // public static void selectionSort(int arr[]){
    //     for(int i=0; i<arr.length-2;i++){
    //         int minPos=i;
    //         for(int j=i+1; j<arr.length-1;j++){
    //             // ascending 
    //             if(arr[minPos]>arr[j]){ //for descending if(arr[minPos]<arr[j])
    //                 minPos=j;
    //             }
    //         }
    //         int temp=arr[minPos];
    //         arr[minPos]=arr[i];
    //         arr[i]=temp;
    //     }
    // }
    // public static void insertionSort(int arr[]){
    //     for(int i=0; i<arr.length-1 ; i++){
    //         int curr=arr[i];
    //         int prev=i-1;
    //         while(prev>=0 && arr[prev]>curr){
    //             arr[prev+1]=arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1]=curr;
    //     }
    // }

    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE; //largest no find
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //count number= frequency each no
        int count[]= new int[largest];
        for(int i=0 ; i< largest; i++){
            count[arr[i]]++;
            }
        
        //sorting
        int j=0;
        for(int i=0;i<count.length; i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    // public static void main(String args[]){
        int arr1[]={4,1,3,1,3,7};
        countingSort(arr1);
        printSort(arr1);
        //insertionSort(arr1);
        //printSort(arr1);
        // selectionSort(arr1);
        // printSort(arr1);
        // int arr[]={5,4,3,2,1};
        //  bubbleSort(arr);
        // printSort(arr);
        // int arr1[]={1,2,3,4,5,};
        // bubbleSort(arr1);
        // printSort(arr1);
    }
}
