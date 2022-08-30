public class DuplicateElement {
    public static void main(String[] args) {

        int[] arr = {9, 8, 8, 7, 6, 5, 4, 4, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println(arr[j] + " ");
                }
            }
        }
    }
}
