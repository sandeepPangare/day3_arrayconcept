public class SecondLargestElement {
    public static void main(String[] args) {

        int[] a={6,5,4,9,8,7,3,2,1};
        int temp;
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Second Largest Number in Array is " +a[1]);
    }
}
