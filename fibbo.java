public class fibbo {
    public static int fibo(int n){
        if(n<0){
            System.out.println("positive");
        }
        if(n<=1){
            return n;
        }
        return fibo(n-2)+fibo(n-1);
    }
    public static void main(String[] args) {
        int n = fibo(4);
        System.out.println(n);
    }
}
