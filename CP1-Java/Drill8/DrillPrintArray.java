
//Write a declaration that populates an array with the following numbers
//13, 96, 56, 27, 68, 80, 40
//then prints them out in the following format:
//[a0, a1, a2, ..., an]
//and finally prints the sum on a new line
public class DrillPrintArray {
    public static void main(String[] args) {
        int[] arr = {13, 96, 56, 27, 68, 80, 40};
        StringBuilder arrayRepresentation = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            arrayRepresentation.append(arr[i]);
            if (i < arr.length - 1) {
                arrayRepresentation.append(", ");
            }
        }
        arrayRepresentation.append("]");
        System.out.println(arrayRepresentation);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println(sum);
    }
}

