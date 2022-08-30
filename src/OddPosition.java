public class OddPosition {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int i =0; i<=arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
