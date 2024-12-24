import java.util.ArrayList;
import java.util.List;

public class SubsetsExample {

    public static void findSubsets(int[] nums, List<Integer> current, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        findSubsets(nums, current, index + 1, result);

        current.add(nums[index]);
        findSubsets(nums, current, index + 1, result);

        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(nums, new ArrayList<>(), 0, result);

        System.out.println("Subsets of the set: ");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
