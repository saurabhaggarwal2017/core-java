package lectures.lecture01;

public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("Array practice!");

        int[] arr1 = new int[5];
        int[] arr2 = {1, 3, 4, 6, 8, 9};

        arr1[0] = 10;
        arr1[1] = 12;
        arr1[2] = 54;
        arr1[3] = 89;
        arr1[4] = 78;

        int i = 0;
        while (i < arr1.length) {
            System.out.print(arr1[i] + ", ");
            i++;
        }
        i = 0;
        System.out.println();
        while (i < arr2.length) {
            System.out.print(arr2[i] + ", ");
            i++;
        }
    }
}
