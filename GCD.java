public class GCD {
    public static void main(String[] args) {
        int n1 = 45;
        int n2 = 35;
        int temp;
        while(n2!= 0){
            temp = n2;
            n2 = n1%n2;
            n1= temp;

        }
        System.out.println(n1);
    }
}
