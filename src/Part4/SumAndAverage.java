package Part4;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 2};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of the given array is "+sum);
        System.out.println("Average of the given array is "+sum/ a.length);
    }
}

