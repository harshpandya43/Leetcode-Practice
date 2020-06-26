//Given an array of integers, find if the array contains any duplicates.
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

//Input: [1,2,3,1]
//Output: true


package amazon;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };
		ContainsDuplicate cd = new ContainsDuplicate();

		boolean b = cd.containsDuplicateSol(nums);
		System.out.println(b);

	}

	public boolean containsDuplicateSol(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}

		return false;
	}

}
