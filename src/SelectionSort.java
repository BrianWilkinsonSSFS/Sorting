import java.util.ArrayList;

public class SelectionSort {

    public static void main(String[] args) {
        
        ArrayList<Integer> nums1 = generateArray(10);
        System.out.println(nums1);

    }

    public static ArrayList<Integer> generateArray(int num) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i=0; i<num; i++) {
            int value = (int)(Math.random() * 100) + 1;
            numbers.add(value);
        }

        return numbers;
    }

}
