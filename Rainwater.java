public class Rainwater {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        int water = 0;
        int n = 7;

        int leftHigh[] = new int[n];
        int rightHigh[] = new int[n];

        leftHigh[0] = arr[0];
        for (int j = 0; j < n - 1; j++) {
            leftHigh[j + 1] = Math.max(leftHigh[j], arr[j + 1]);
        }

        // System.out.println("Left Array:");

        // for (int i = 0; i < n; i++) {
        // System.out.println(leftHigh[i]);
        // }

        rightHigh[n - 1] = arr[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            rightHigh[i] = Math.max(rightHigh[i + 1], arr[i]);

        }
        // System.out.println("Right Array:");

        // for (int i = 0; i < n; i++) {
        // System.out.println(rightHigh[i]);
        // }

        System.out.print("water trap: ");
        for (int i = 0; i < n; i++) {
            water += Math.min(leftHigh[i], rightHigh[i]) - arr[i];

        }
        System.out.print(water);

    }
}
