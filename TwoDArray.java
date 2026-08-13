public class TwoDArray {
//     public static void spiralMatrix(int matrix[][]){
//         int stRow=0;
//         int eRow=matrix.length-1;
//         int stColumn=0;
//         int eColumn=matrix[0].length-1;

//  while(stRow<=eRow && stColumn<= eColumn){
//         //top row fixed change column 
//         for(int j=stColumn; j<=eColumn;j++){
//             System.out.print(matrix[stRow][j]+" ");
//         }
//         // right colum fix sr+1 row 
//         for(int i=stRow+1 ; i<=eColumn ; i++){
//             System.out.print(matrix[i][eColumn]+" ");
//         }

//         //bottom fixed end row ec-1 column 
//         for(int j=eColumn-1 ; j>=stColumn ; j--){
//             if(stRow==eRow){ // for odd matrix cond 
//                 break;
//             }
//             System.out.print(matrix[eRow][j]+" ");

//         }
//         // left 
//         for(int i =eRow-1; i>=stRow+1; i--){
//             if(stColumn==eColumn){ // odd matrix cond 
//                 break;
//             }
//             System.out.print(matrix[i][stColumn]+" ");
//         }
//         stRow++;
//         stColumn++;
//         eColumn--;
//         eRow--;
//     }
//     System.out.println();
//     }

// public static int diagonalSum(int matrix[][]){
//     int sum=0;
//     for(int i=0; i<matrix.length; i++){
//         //pd
//         sum += matrix[i][i];

//         //sd
//         if(i != matrix.length -1 -i){
//             sum += matrix[i][matrix.length-1-i];
//         }
//     }
//     return sum;
// }
public static void transposeMatrix(int matrix[][]){
    int Tmatrix[][]=new int[matrix[0].length-1][matrix.length-1];
    for(int i=0 ; i<)
}
    // public static void main(String args[]){
        int matrix[][] ={ {1,2,3,4 },
                        {5 , 6, 7, 8},
                        { 9, 10 , 11, 12},
                        { 13, 14, 15, 16}};
            // spiralMatrix(matrix);
            // System.out.println(diagonalSum(matrix));
                    }
}
