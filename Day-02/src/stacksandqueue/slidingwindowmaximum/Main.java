package stacksandqueue.slidingwindowmaximum;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 3, 0, -3, 2, 3, 9, 7};
        int k = 3;
        //Calling the static function from maxSlidingWindow and storing the same into result
        int[] result = SlidingWindow.maxSlidingWindow(nums, k);
        //Printing the result
        System.out.println(Arrays.toString(result));
    }
}
