public class Array07 {
    public static void BoundaryValue(int matrix[][],int size) {
        for(int i =0; i<size;i++){
            for(int j= 0;j<size;j++){
                if(i==0 || j==0 ||i==size-1 || j== size-1 ){
                    System.out.print(matrix[i][j] + ", ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        
    }
    // Java Program to Print Boundary Elements of a Matrix
    public static void main(String[] args) {
        int[][] b = { { 8, 2, 13, 4 },
                      { 9, 16, 17, 8 },
                      { 1, 22, 3, 14 },
                      { 15, 6, 17, 8 } };
                BoundaryValue(b, 4);
    }
    
}
