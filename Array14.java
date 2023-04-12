public class Array14 {
    // Insert an elemet at given index.
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int temparr[] = new int[15];
        int insertElement = 26;
        int atIndex = 2;
        for (int i = 0; i < 9; i++) {
            if (i < atIndex) {
                temparr[i] = arr[i];

            } else if (i == atIndex) {
                temparr[atIndex] = insertElement;
            } else {
                temparr[i] = arr[i - 1];
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(temparr[i]);
        }

    }
}
