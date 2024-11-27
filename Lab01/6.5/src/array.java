import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        int[] my_array1={1789, 2035, 1899, 1456, 2013};
        double avg;
        int sum;
        System.out.println("Origin array: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted array:" + Arrays.toString(my_array1));
        
        sum=0;
        for (int num: my_array1) {
            sum += num;
        }
        avg=(double) sum/my_array1.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average " + avg);
    }
}