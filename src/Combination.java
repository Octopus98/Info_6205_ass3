import java.util.*;

public class Combination {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new LinkedList<Integer>(), candidates, target);
        return result;
    }
    private void dfs(List<List<Integer>> result, LinkedList<Integer> list, int[] arr, int target) {
        if (target == 0) {
            result.add(new LinkedList<Integer>(list));
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= target) {
                list.addFirst(arr[i]);
                dfs(result, list, Arrays.copyOfRange(arr, 0, i + 1), target - arr[i]);
                list.removeFirst();
            }
        }
    }
}
