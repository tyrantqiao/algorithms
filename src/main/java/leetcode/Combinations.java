package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author tyrantqiao
 */
public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
		if (k == n || k == 0) {
			List<Integer> element = new ArrayList<>();
			for (int i = 1; i <= k; i++) {
				element.add(i);
			}
			return new LinkedList<>(Arrays.asList(element));
		}
		List<List<Integer>> result = this.combine(n - 1, k - 1);
		result.forEach(e -> e.add(n));
		result.addAll(this.combine(n - 1, k));
		return result;
	}

}