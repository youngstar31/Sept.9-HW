public class Homework6 {
    // 6- CREATE A METHOD THAT TAKES AN ARRAY OF NUMBERS AND MULTIPLIES EACH NUMBER IN THE ARRAY BY 3
    public static void multiply(int[] arr) {

        for (int x = 0; x < arr.length; x++){
            System.out.println(arr[x] * 3);


        }
    }

    public static void main(String[] args) {
        multiply(new int[]{5, 7, 8, 9});
    }


}