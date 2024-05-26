/*
 Copyright 2024 Rohan Bari <rohanbari@outlook.com>

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package code.LeetCode;

import java.util.TreeSet;

/**
 * Question: https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */
class RemoveDupFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);

        int index = 0;
        for (Integer num : set)
            nums[index++] = num;

        return set.size();
    }
}
