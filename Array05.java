// Java Program to Compute the Sum of Diagonals of a Matrix
public class Array05 {
    public static void sumdia(int matrix[][], int size) {
         int psum = 0, ssum =0;
        //  for primary diagonal
         for(int i =0;i<size;i++){
            for(int j = 0;j<size ;j++){
                if(i==j){
                    psum = psum + matrix[i][j];
                }
            }
         }
         System.out.println("Sum of principle diagonal: " + psum );
         //  for secondary diagonal
         for(int i =0;i<size;i++){
            for(int j = size;j>=0;j--){
                if((i+j) == (size-1)){
                    ssum = ssum + matrix[i][j];
                }
            }
         }
         System.out.println("Sum of secondary diagonal: " + ssum );
         
            
    }
    
    public static void main(String[] args) {
        int[][] b = { { 8, 2, 13, 4 },
                      { 9, 16, 17, 8 },
                      { 1, 22, 3, 14 },
                      { 15, 6, 17, 8 } };
         sumdia(b, 4);
         
        
    }
}
