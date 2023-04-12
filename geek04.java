public class geek04 {
    static long nthFibonacci(long n){
        long a1 = 0;
        long a2 = 1;
        long sum =0;

        
            for (int j = 1; j<n; j++){
                sum = a1;
                a2 = a1+a2;
                System.out.println(sum);
            }       
                


            return 0;
            
        // code here
    }
    public static void main(String[] args) {
        long a = nthFibonacci(5);
        System.out.println(a);
        
    }
}
