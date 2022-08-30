public class LargestSmallestElement {
    public static void main(String[] args) {

        int[] a = {6, 5, 4, 9, 8, 7, 3, 2, 1};
        int k=1;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) { //for smaller or greater

                    int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                }
            }
            if (i==k-1){
                System.out.println("Largest Element is " + a[i]); //for Largest value
                //System.out.println("Smallest Elememnt is " + a[i]); //For smallest value
            }
        }
    }
}
