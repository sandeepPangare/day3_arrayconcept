public class CopyElements {
    public static void main(String[] args) {
        String names[] = {"Shubham", "Rahul", "Shubham", "mayur", "Anmol"};
        String namesCopy[] = new String[names.length];

        for(int i=0;i<names.length;i++) {
            namesCopy[i] = names[i];
        }

        for(int i=namesCopy.length-1;i>-1;i--) {
            System.out.println("Copied Elements = "+namesCopy[i]);
    }
}}
