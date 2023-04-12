public class BinarySearch {
  public static void Binary(int arr[], int se, int ee, int key) {
    int mid = (se + ee) / 2;
    while (se <= ee) {
      if (arr[mid] < key) {
        se = mid + 1;
      } else if (arr[mid] == key) {
        System.out.println("Element is found at index: " + mid);
        break;
      } else {
        ee = mid - 1;
      }
      mid = (se + ee) / 2;
    }
    if (se > ee) {
      System.out.println("Element is not found!");
    }

  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50 };
    int key = 10;
    int ee = arr.length - 1;
    Binary(arr, 0, ee, key);

  }
}
