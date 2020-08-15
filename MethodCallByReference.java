import java.util.Arrays;

/*
we will pass arr as argument and multiply all the elements
then will modify each index of arr to 0
 */
public class MethodCallByReference {
    public static void main(String[] args) {
        MethodCallByReference obj = new MethodCallByReference();
        int[] brr = {1, 2, 3, 4};
        System.out.println(obj.mul(brr));
        System.out.println(Arrays.toString(brr));
    }

    public int mul(int[] arr) {
        int response = 1;
        for (int i = 0; i < arr.length; i++) {
            response = response * arr[i];
            arr[i] = 0;
        }
        return response;
    }
}
