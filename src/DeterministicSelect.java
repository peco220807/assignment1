import java.util.Arrays;

public class DeterministicSelect {
    public static int select(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k];
    }
}